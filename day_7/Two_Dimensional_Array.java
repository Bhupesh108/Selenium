
//WAP to Add Two Matrix using Multi-dimensional Arrays

package day_7;

import java.util.ArrayList;

public class Two_Dimensional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matrix1[][]= {{2,3,4},{4,5,6},{12,10,5}};
	    int matrix2[][]= {{6,7,8},{9,10,11},{7,6,4}};
	    ArrayList<Integer>sumlist=new ArrayList<Integer>();
	    
	    for(int i=0;i<matrix1.length;i++) {
	    	for(int j=0;j<matrix2.length;j++) {
	    		int Sum = matrix1[i][j]+matrix2[i][j];
	    		sumlist.add(Sum);
	    	 }
	    }
	    
	    for(Integer num:sumlist) {
	    	System.out.println(num);
	    }
}

}
