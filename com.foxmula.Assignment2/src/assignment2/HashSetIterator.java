package assignment2;
import java.util.*;
public class HashSetIterator {
	
	public static void main(String []args) {
		
	HashSet set=new HashSet();  
	for(int i=0;i<9;i++) {
		set.add(i*i);	
	}
	
	Iterator itr=set.iterator();
	while(itr.hasNext()){    
        System.out.println(itr.next());
	}
	}
}
