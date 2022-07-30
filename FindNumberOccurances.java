package week3.day2;

import java.util.Map;
import java.util.TreeMap;

public class FindNumberOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[]={2,3,5,6,3,2,1,4,2,1,6,-1};
		
		//Create Map 
		
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
		
		//Traverse through the loop to add the numbers
		
		for (int i = 0; i < input.length; i++) {
			
					map.put(input[i], map.getOrDefault(input[i], 0)+1);		
		
		}
		System.out.println(map);
		
	}

}
