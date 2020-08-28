package day_13;

import java.util.*;

public class Sum_List {

	public static int sum(List<Integer>list)
	{
	Iterator<Integer>it=list.iterator();
	System.out.println(list);
	int res=0;
	while(it.hasNext()) 
	{
		int num=it.next();
		System.out.println(num);
	if (num>5) {
			res+=num;
			System.out.println(it.next());
		}
	}
	return res;
}
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(5);
		System.out.println(sum(list));
}
}