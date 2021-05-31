package assignment2;
import java.util.*;

public class Arraylist_Contains {
	public static void main(String []args) {
		System.out.println("enter the to check");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
	ArrayList al= new ArrayList();
	  
	
	for(int i=0;i<9;i++) {
		al.add(i);
		
	}
		if(al.contains(n)) {
			System.out.println(n+" is present");
			
		}
		else System.out.println(n+" is not present");
	
	
	}

}
