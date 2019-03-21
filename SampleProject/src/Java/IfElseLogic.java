package Java;

public class IfElseLogic {

	public static void main(String[] args) {
		
		int i=30;
		int j=20;
		if(j>i) {
			System.out.println("j is the big number");
			System.out.println("***********************");
			System.out.println("what is this");
		}
		else {
			System.out.println("j is the small number");
		}
		// find the highest number logic
		int a=500;
		int b=600;
		int c=300;
		if(a>b & a>c) {
			System.out.println("a is the highest number");
		}
		else if(b>c) {
			System.out.println("b is the highest number");
		}
		else {
			System.out.println("c is the highest number");
		}
		

	}

}
