package assignment2;
import java.util.*;

public class ArrayListOccurences {
	
	public static void main(String []args) {
		
		ArrayList al= new ArrayList();
		
		for(int i=0;i<50;i++) {
			int rand = (int)(Math.random() * 15) + 1;
			al.add(rand);
			
		}
		
		System.out.println(al);
		
		 Set<Integer> set = new HashSet<Integer>(al);
	        for (Integer a : set)
	            System.out.println("Frequency of  "+a + " : " + Collections.frequency(al, a));
	    }
		  
	}
		


