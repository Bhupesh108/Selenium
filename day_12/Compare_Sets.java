package day_12;

import java.util.HashSet;

public class Compare_Sets {

	public static void main(String[] args) {
		HashSet<Object>set1=new HashSet<Object>();
set1.add("Red");
set1.add("Orange");
set1.add("Black");
set1.add("White");
set1.add("Purple");
System.out.println("Print the value of Hashset1:"+set1);

HashSet<Object>set2=new HashSet<Object>();
set2.add("White");
set2.add("Yellow");
set2.add("Blue");
set2.add("Orange");
set2.add("Pink");
System.out.println("Print the value of Hashset2:"+set2);
set1.retainAll(set2);
System.out.println("Print the value if Hashset retaining duplicate only:"+set1);
	}

}
