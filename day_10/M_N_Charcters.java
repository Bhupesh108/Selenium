//Write a Java program to count the number of words ending in 'm' or 'n'.

package day_10;

public class M_N_Charcters {
	public int endsWith(String Str) {
		int l=Str.length();
		int temp=0;
		for (int i=0;i<l;i++) {
			if (Str.charAt(i)=='m'||Str.charAt(i)=='n') {
				if (i<l-1 &&!Character.isLetter(Str.charAt(i+1)))
					temp++;
				else if (i==i-1)
					temp++;
			}
		}
return temp;
}
	
	public static void main(String[] args) {
		M_N_Charcters obj=new M_N_Charcters();
		String Str1="Ravi RAM Karam is fan of Rajm";
		System.out.println("Print the value of :"+Str1);
	System.out.println("The number of words ends with m or n is :" +obj.endsWith(Str1));
	}
}