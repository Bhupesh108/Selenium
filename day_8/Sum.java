package day_8;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int num=0;
		int total=0;
	//input array values from user
	Scanner scan=new Scanner(System.in);
System.out.println("Enter number of elements");
num=scan.nextInt();
int[] myarray=new int[num];
	System.out.println("Enter the value of array");
	for (int i=0; i<num;i++) {
		myarray[i]=scan.nextInt();
			total=total+myarray[i];
	}
	System.out.println("Sum of the array:"+total);
	}
}