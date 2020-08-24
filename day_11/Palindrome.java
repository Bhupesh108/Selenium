//Wap to find given String is palindrome

package day_11;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		String a,b="";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string you want to check:");
		a=scan.nextLine();
		int n=a.length();
		System.out.println(n);
		
		for (int i=n-1;i>=0;i--)
	
		{
		b=b+a.charAt(i);
	System.out.println();
	}
if(a.equalsIgnoreCase(b)) {
System.out.println("The string is Palindrome:");
}
else
{
	System.out.println("The String is not a Palindrome");
}
}
}