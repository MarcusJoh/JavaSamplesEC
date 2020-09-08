package arreysAndmore;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetsample {

	
	
	public static void HashSetRun() {
		 System.out.println("Hashset over here");
		
	    HashSet<String> set=new HashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  
        set.add("Five");
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }  
        
        
        
        HashSet<HashmapObject> setofHashmapObject=new HashSet<HashmapObject>();  
        
       //make some objects
        
        HashmapObject firstBook =new HashmapObject(1,"A Game of Thrones","	George R. R. Martin");
        
        HashmapObject secondBook =new HashmapObject(1,"A Clash of Kings","	George R. R. Martin");
        HashmapObject thirdBook =new HashmapObject(1,"A Clash of Kings","	George R. R. Martin");
        setofHashmapObject.add(firstBook);
        
        setofHashmapObject.add(secondBook);
        
        setofHashmapObject.add(thirdBook);
        
        
        
        
        for(HashmapObject b:setofHashmapObject){  
            System.out.println(b.id+" "+b.name+" "+b.author);  
            }  
		
	}
	
	
}
