package sem3cosc2006;

public class reverseNum {
	    public static void reverse(int num) {
	        boolean isNegative = false;

	        
	        if (num < 0) {
	            isNegative = true;
	            num = -num; 
	        }

	        int reversedNum = 0;

	        while (num != 0) {
	            int digit = num % 10; 
	            reversedNum = reversedNum * 10 + digit; 
	            num = num / 10; 
	        }

	        
	        if (isNegative) {
	            System.out.print("-");
	        }
	        System.out.println(reversedNum);
	    }

	    public static void main(String[] args) {
	        reverse(12345); 
	        reverse(-12345); 
	    }
	}


