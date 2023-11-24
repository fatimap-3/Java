package sem3cosc2006;

public class ABCBank {
    private String aN;
    private String oN;
    private double bal;

    public ABCBank(String aN, String oN) {
        if (!verify(aN)) {
            throw new BankException("Invalid account number: " + aN);
        }

        this.aN = aN;
        this.oN = oN;
        this.bal = 0.0;
    }

    public ABCBank(String aN, String oN, double initialBal) {
        this(aN, oN);
        deposit(initialBal);
    }

    public void deposit(double amo) {
        bal += amo;
    }

    public void withdraw(double amo) {
        if (bal >= amo) {
            bal -= amo;
        } else {
            throw new BankException("Insufficient funds to withdraw $" + amo + ", current balance=$" + bal);
        }
    }

    public double bal() {
        return bal;
    }

    private boolean verify(String aN) {
        if (aN.length() != 8) {
            return false;
        }

        String prefix = aN.substring(0, 2);
        String digits = aN.substring(2);

    
        boolean validPrefix = prefix.matches("[A-Z]+");
        boolean validDigits = digits.matches("\\d+");

        return validPrefix && validDigits;
    }

    public static class BankException extends RuntimeException {
        public BankException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        try {
            ABCBank account1 = new ABCBank("CA987654", "Kawshar Patel");
            System.out.printf("Account balance for Kawshar Patel is is $%.2f%n", account1.bal());

            account1.deposit(500.0);
            System.out.printf("Account balance after deposit for Kawshar Patel is $%.2f%n", account1.bal());

            account1.withdraw(200.0);
            System.out.printf("Account balance after withdrawal for Kawshar patel is  is $%.2f%n", account1.bal());

            ABCBank account2 = new ABCBank("CA123456", "Fatima Patel");  
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }
}

