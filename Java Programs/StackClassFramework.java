package cosc2006classwork;
import java.util.*;
public class StackClassFramework {

	public static void main(String[] args) {
		Stack<String> St=new Stack<String>();
		St.push("We");
		St.push("are");
		St.push("in");
		St.push("Algoma");
		St.push("university");
		St.pop();
        System.out.println(St);
        System.out.println(St.peek());
	}
}
