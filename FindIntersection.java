package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		
		int num1[]={3,2,11,4,6,7};
		
		int num2[]={1,2,8,4,9,7};
		
		List<Integer> list1=new ArrayList<Integer>();
		
		List<Integer> list2=new ArrayList<Integer>();
		
		for (int i = 0; i < num1.length; i++) {
		
			list1.add(num1[i]);
			
			list2.add(num2[i]);
			
			if (num1[i]==num2[i]) {
			
				System.out.println(num1[i]);
			
			}
		
		}
		
	}

}
