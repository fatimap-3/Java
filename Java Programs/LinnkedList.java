package cosc2006classwork;

import java.util.LinkedList;

public class LinnkedList {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Audi");
		cars.add("mercedes");
		cars.add("G-wagon");
		cars.add("Ferrari");
		cars.removeLast();
		System.out.println(cars);

	}

}
