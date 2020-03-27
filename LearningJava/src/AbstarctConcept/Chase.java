package AbstarctConcept;

public class Chase extends Bank{

	@Override
	public void loan() {
		System.out.println("This is a override method from Bank class");
	}
	
	public void homeloan(){
		System.out.println("This is chase class own method");
	}
	
	

}
