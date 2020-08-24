//WAP to find largest and smallest elements of an array.
package day_8;

public class Largest {

	public static void main(String[] args) {
		int []a= {23,12,34,56,32,78};//Here we have provided the value of array.
		
		int max=a[0]; //Here we assume that first element of an array is maximum hence int max=a[0]
		
		for (int i=1;i<a.length;i++) {//Here we are finding the array values for the position a[1],a[2],a[3],a[4],a[5]
			if(max<a[i]) {//if 23<12 (here 23 maximum is greater so not come inside the loop and itierate the value again.
				
				{
					
				max=a[i];//if 23<34 (Here 34 is greater than 23 so it comes inside the if block and value of a[i]=max.
				
			}
		}
		}
		
		System.out.println("maximum element is "+ max);
		
	}


}