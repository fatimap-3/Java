package sem3cosc2006;

public class maximumChar {

    public static char maximumChar(String string1, char maximum) {
        
        if (string1.isEmpty()) {
            return maximum;
        }

       
        char currentChar = string1.charAt(0);

        
        if (currentChar > maximum) {
            maximum = currentChar;
        }

      
        return maximumChar(string1.substring(1), maximum);
    }

    public static void main(String[] args) {
        System.out.println(maximumChar("Data Structures", (char) 0)); 
        System.out.println(maximumChar("Algoma U", (char) 0)); 
        System.out.println(maximumChar("COSC2006", (char) 0));
        System.out.println(maximumChar("1234", (char) 0));
    }
}
