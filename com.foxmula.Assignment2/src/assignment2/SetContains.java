package assignment2;
import java.util.*;

public class SetContains {
	public static void main(String []args) {
		
		System.out.println("enter the number to check");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
	Set set = new HashSet();
	for(int i=0;i<9;i++) {
		set.add(i);
		
	}
	
	if(set.contains(n)) {
		System.out.println(n+" is present");
		
	}
	else System.out.println(n+" is not present");

	
	}

}
