package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		
		List<Integer> list=new ArrayList<Integer>();
		
	   
		int count=0;
	
	 
		for (int i = 0; i < arr.length-1; i++) {
		
			for (int j = i+1; j < arr.length-1; j++) {
			
				if(arr[i]==arr[j]) {
				
					count++;
				
					if (count>0) {
					
						list.add(arr[i]);
				
					}
			
				}
		
			}
		
	
		}
		
		System.out.println("The Duplicate numbers are:"+list);
		
	}

}
