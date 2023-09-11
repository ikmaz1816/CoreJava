package conditionalstatement;

public class SwitchCase {
	/*
	 	When there are multiple if case statement we use switch case 
	 */
	public static void main(String[] args) {
		//let us design a calculator
		
		int a=5;
		int b=3;
		char ch ='+';
		
		switch(ch)
		{
			case '+':
				System.out.println(a+b);
				break;
			case '-':
				System.out.println(a-b);
				break;
			default:
				System.out.println("Please choose a correct option");
		}
	}
}
