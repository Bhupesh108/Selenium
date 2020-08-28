package day_13;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Remove_List {
	public static void main(String[] args) throws IOException {
	    Scanner scan=new Scanner(System.in);
	    int range;
	    List<String>list=new ArrayList<String>();
	    List<String>newList=new ArrayList<String>();
	    System.out.println("Enter the range of the list");
	    range=scan.nextInt();
	    for (int i=0;i<range;i++) {
	        System.out.println("Enter the name of person");
	        String v=scan.next();
	        list.add(v);
	    }
	    System.out.println("The ArrayList is"+ list);
	    for (String s : list) {
	        if (s.toLowerCase().startsWith("s") && s.length() > 5) {
	            newList.add(s);
	        }
	    }
	    System.out.println(" the updated list is "+ newList);
	}
}
