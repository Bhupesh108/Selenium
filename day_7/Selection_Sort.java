//Wap for Selection Sorting.

package day_7;

public class Selection_Sort {

	public static void main(String[] args) {
		int a[]= {34,12,56,79,23,11};
		
		System.out.println("Print the value of unsorted array");
		for (int i=0;i<a.length;i++) {
			
		System.out.println(a[i]);
	}
//Selection Sort
		for(int i=0;i<a.length-1;i++) {
			
			//For finding first minimum value
			int min=a[i];
			int pos=i;
			for (int j=i;j<a.length;j++) {
			if (a[j]<min)	
			{
				min=a[j];
				pos=j;
			}
			}
			//Swapping
			int t=a[i];
			a[i]=a[pos];
			a[pos]=t;
			
		}
		System.out.println("Print the value of sorted array");
	for (int i=0;i<a.length;i++) {
			
		System.out.println(a[i]);
}}
}