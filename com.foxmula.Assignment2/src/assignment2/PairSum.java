package assignment2;
import java.util.*;
public class PairSum {
	public static void main(String []args) {
		
		System.out.println("enter the sum to check");
		Scanner scan=new Scanner(System.in);
		int k=scan.nextInt();
		
	ArrayList al= new ArrayList();
	  
	
	for(int i=-3;i<9;i++) {  
		al.add(i);
		
	}
	
	System.out.println("The pairs are:");
	for(int i=0;i<al.size();i++) {
		for(int j=i+1;j<al.size();j++) {
			
			int a=(int)al.get(i);

			int b=(int)al.get(j);
			if(a+b==k) {
				
				System.out.println("["+a+","+b+"]");
			}
			
		}
		
		
	}
	
	}
}
