//Wap to find the Odd & Even Numbers in an Array

package day_9;

public class Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {21,22,23,24,25,26,28,34,11,32,11,13,99,10001};
for (int i=0;i<a.length;i++) {
	
	if (a[i]% 2==0) {
		System.out.println("Print number is even:"+a[i]);	
	}
	else
		System.out.println("Print number is odd:"+a[i]);
}
	}

}
