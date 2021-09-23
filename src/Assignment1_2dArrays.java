/*
 * 
 */
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Assignment1_2dArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		
		int num;
		
		System.out.println("How many elements you want to input: ");
		num = in.nextInt();
		//in.skip(System.lineSeparator());
		Double [] array2d = new Double [num];
		
		for ( int counter = 0; counter < num ; counter++) {
			System.out.println("Enter element number " + (counter + 1) + ": ");
			array2d[counter] = in.nextDouble();
			
			
		}
		
		in.close();
		System.out.println(" The array is: ");
		for (int counter = 0; counter < num; counter++) {
			System.out.print(" | ");
			
			System.out.print(array2d[counter]);
			
		}
		System.out.println(" ");
		System.out.println(" Values at an even index: ");
		for ( int i = 2; i < array2d.length; i = i + 2) {
			System.out.println(array2d[i]);
			
		}
		System.out.println("even values in the array: "); 
		for ( int i = 0; i < array2d.length; i++) {
			
			if (array2d[i] %2 == 0)
				System.out.println(array2d[i]);
			
		}
	
		System.out.println("odd values in the array: ");
		
		for (int i = 0; i < array2d.length; i++) {
			if (array2d[i]%2 != 0)
				System.out.println(array2d[i]);
			
		}
		
		System.out.println("array reversed are: ");
		
		for ( int i = array2d.length - 1; i>=0; i--) {
			if (i >=0)
				System.out.print(" | ");
			System.out.print(array2d[i] + " ");
			
		}
	// 1st 5th and last element 
		
	System.out.println(" ");
	  System.out.println(" Values at 1st, 5th, and last element are: "); 
	  double temp= array2d[0]; 
	  for (int i = 0; i<Array.getLength(array2d); i++)
	  { if ( i== 0) {
	  
	  System.out.println(array2d[i]);
	  
	  }
	  
	  
	  if (i == 4) {
	  
	  System.out.println(array2d[i]);
	  
	  }
	  
	 if (i == array2d.length - 1) {
		 System.out.println(array2d[i]);
		 
	 }
	}
	 
		
		
		double largest= array2d[0];
		double smallest= array2d[0];
		
		for(int i=1;i<array2d.length;i++)
		{
			if(array2d[i]>largest)
				largest = array2d[i];
			if(array2d[i]<smallest)
				smallest=array2d[i];
		}
		System.out.println("The largest value is: "+largest);
		System.out.println("The smallest value is: "+smallest);
	
		
		//alternating sum
		double number = 0;
		double total = 0;
		//double otherTotal= 0;

		//double naltSum = 0;
		
		for(int i=0;i<array2d.length;i++) {
			
			  
			number = array2d[i];
				if(i%2==0) {
					total = total + number;
				}
				else {
					total = total - number;
				}
				
			}
			
			
			System.out.println("Alternating sum: ");
			System.out.println(total);
		}
		
	
	
}
