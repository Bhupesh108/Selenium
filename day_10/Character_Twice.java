
//Write a Java program to repeat every character twice in the original string
package day_10;

public class Character_Twice {

	public String repeatAllTwice(String str) {
		int l=str.length();
		String newstring="";
		for (int i=0;i<l;i++) {
			newstring+=str.substring(i, i+1)+str.substring(i, i+1);
		}
		return newstring;
		}
		public static void main(String[] args) {
			Character_Twice obj=new Character_Twice();
			String str1="Bhupesh";
			
			
			System.out.println("The given String is :"+ str1);
			System.out.println("The new String is :" +obj.repeatAllTwice(str1));
		}

	}


