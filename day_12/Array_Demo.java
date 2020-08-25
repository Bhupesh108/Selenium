package day_12;

import java.util.ArrayList;

public class Array_Demo {

	public static void main(String[] args) {
		//Create an empty array list with initial capacity
		ArrayList<Integer>arrlist=new ArrayList<Integer>(5);
		//use add()method to add elements in the list//
		arrlist.add(10);
		arrlist.add(30);
		arrlist.add(25);
		arrlist.add(20);
		// adding element 35 in the third position
		arrlist.add(3, 35);
		//Print all the values in the arraylist
		for(int  number :arrlist) {
			System.out.println("Print the number:"+ number);
		}
	}

}
