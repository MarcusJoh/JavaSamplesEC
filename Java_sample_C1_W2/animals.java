package subClass;

public class animals extends type {
	
	  private String Name = "Polar bear";
	  
	  public static void main(String[] args) {

		  animals newAnimal = new animals();
	    
		  newAnimal.check();
	    
	    System.out.println(newAnimal.type + " " + newAnimal.Name);
	  }
	  
	}

class type {
  protected String type="Bear";
  public void check() {
    System.out.println("the check is done here");
 }

}