package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String text = "We learn java basics as part of java sessions in java week1";
				
		String[] str1=text.split(" ");
				
		Set<String> set1=new LinkedHashSet<String>();
				
		for (int i = 0; i < str1.length; i++) {
		
			set1.add(str1[i]);
			
		}
			
		System.out.println(set1);	
		
	}

}
