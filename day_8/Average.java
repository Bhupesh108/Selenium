package day_8;

public class Average {

	public static void main(String[] args) {
		
	
	int[] a= {12, 13, 16, 18, 19};
	int total=0;
	float average=0;
	
	for (int i=0;i<a.length;i++) {
	
	total=total+a[i];
	
	}
	
System.out.println("Print the value of total:"+total);	

average= (float) total/a.length;

System.out.println("value of average:"+ average);
	}

}