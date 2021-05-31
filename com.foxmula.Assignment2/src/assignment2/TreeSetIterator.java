package assignment2;
import java.util.*;
public class TreeSetIterator {
	
	public static void main(String []args) {
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		for(int i=0;i<9;i++) {
			ts.add(i*(i+1));
			
		}
		Iterator itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
