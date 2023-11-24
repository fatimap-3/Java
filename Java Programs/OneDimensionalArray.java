package cosc2006classwork;

import java.util.ArrayList;

public class OneDimensionalArray {

	public static void main(String[] args) {
		ArrayList<String> oneDimensionalArray = new ArrayList<String> ();
		oneDimensionalArray.add("Volvo");
		oneDimensionalArray.add("BMW");
		oneDimensionalArray.add("Audi");
		System.out.println(oneDimensionalArray);
		System.out.println(oneDimensionalArray.get(0));
        System.out.println(oneDimensionalArray.remove(1));
	}

}
