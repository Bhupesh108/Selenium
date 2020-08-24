
//Wap to find the Duplicate characters in a string//
package day_11;

public class Dup_char {

	public static void main(String[] args) {
		String Str="bhupeshpandita";
	System.out.println(Str);
		int temp=0;
		char[]ch=Str.toCharArray();
	System.out.println("Duplicate values are:");
		for (int i=0;i<Str.length();i++) {
			System.out.println(i);
		for (int j=i+1;j<Str.length();j++)	{
			System.out.println(j);
			if (ch[i]== ch[j]) {
				System.out.println(ch[j]);
				temp++;
				break;
				
			}
		}
	
	}

	}
}
