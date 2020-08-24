package day_5;

import java.util.Scanner;

public class LCM_HCF {

public static void main(String[] args) {
	int a,b,x,y,t,hcf,lcm;
	Scanner sc=new Scanner(System.in);//using scanner class we have created the object.
	
	System.out.println("Print the two integers\n");//Print the two integer value here
	x=sc.nextInt();//by using scanner class first input will be stored in x.
	y=sc.nextInt();//by using scanner class second input will be stored in y.
	
	a=x; //here we have store the value of x in variable a.
	b=y; //here we have store the value of y in variable b.
	while (b!=0) { //by using while loop the value of b should not equal to zero
		t=b;// value of b will be stored in new variable t
		b=a%b;// here we stored the remainder on b.
		a=t;//value of t will be stored in variable a.
}
	
hcf=a;
lcm=(x*y)/hcf;
System.out.println("highest common factor of "+x+" and "+y+ "=" + hcf);
System.out.println("least common factor of "+x+" and "+y+"="+ lcm);
	
}
}


