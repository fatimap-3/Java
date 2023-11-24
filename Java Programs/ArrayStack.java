package cosc2006classwork;
import java.util.Scanner;
public class ArrayStack {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array");
	int size = input.nextInt();
	int array[] = new int[size];
	int top = -1;
	{
		if(top == -1)
		{
			System.out.println("The stack is empty. You can now add elements.");
			{
			if(top==array.length) {
				System.out.println("Sorry the stack is FULL. You cannot add any further elements");
			}
		   else {
			top++; 
			System.out.println("Enter the elemnts into the stack");
			for(int i=1; i<=size;i++) {
			int element = input.nextInt();
			array[top]= element;
		}
			}
			int element;
		    element = array[top];
			top--;
			System.out.println("The elements are removed from thee stack");
			
	}
	
	}
	
	}
}

}