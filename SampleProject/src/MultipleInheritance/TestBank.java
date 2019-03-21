package MultipleInheritance;

public class TestBank {

	public static void main(String[] args) {
	
		HSBCBank hs = new HSBCBank();
			hs.credit();
			hs.debit();
			hs.withdraw();
			hs.loan();
			hs.homeLoan();
		System.out.println(USBank.min_balance);
			

	}

}
