package day_12;

import java.util.ArrayList;

public class Remove_Duplicate {

	public static void main(String[] args) {
		ArrayList<Object>al=new ArrayList<Object>();
		al.add("Java");
		al.add("CoreJava");
		al.add("Testleaf");
		al.add("Java");
		al.add("Testleaf");
		
		System.out.println("Print the value of list before removing duplicate:/"+al);
	for (int i=0;i<al.size();i++) {
		System.out.println(i);
		
		for (int j=i+1;j<al.size();j++) {
			System.out.println(j);
			if(al.get(i).equals(al.get(j))){
				al.remove(j);
				System.out.println(j);
				j--;
				
			}
	}
		
	}
System.out.println("Print the value of list after removing duplicate:"+al);
}
}