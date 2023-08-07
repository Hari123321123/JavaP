package Javaoops;
class Test1Main {
	  public static void main(String[] args) 
{
	    Javaoops.person myObj = new Javaoops.person();
	    myObj.setName("John"); // Set the value of the name variable to "John"
	    System.out.println(myObj.getName());
	  }
	}
class person {

	private String name;

	  // Getter
	  public String getName() {
	    return name;
	  }

	  // Setter
	  public void setName(String newName) {
	    this.name = newName;
	  }}