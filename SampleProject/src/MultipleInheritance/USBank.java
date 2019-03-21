package MultipleInheritance;

public interface USBank {
	
	int min_balance=100;
	
	public void credit();
	
	public void debit();
	
	public void withdraw();
	
	//Interfaces does not have main method
	//we can define only method ..No body for methods
	//we can define the variable which is static in nature and can not change the value
	//No static methods can be created
	//we can not create the object for the Interfaces , they are abstract in nature.

}
