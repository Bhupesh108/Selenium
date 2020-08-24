//wap to swap the first and last character of a string in java/

package day_10;

public class Swap_String {
	
	public static String swapFirstAndLast(String str) {
	//check if the string has only one character then return the string	//
		
		if (str.length()<1)
			return str;
	
		//converting the string into character array.
		
		char[]ch=str.toCharArray();
		
		//Swapping a first and last character of a string//
		char temp= ch[0];
		ch[0]=ch[ch.length-1];
		ch[ch.length-1]=temp;
		
		//converting character to 
		//string and return
		return String.valueOf(ch);
	}
	public static void main(String[] args) {
			String str="healthiswealth";
			System.out.println(swapFirstAndLast(str));
		
	}
}