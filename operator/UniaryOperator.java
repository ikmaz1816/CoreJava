package operator;

public class UniaryOperator {
	public static void main(String[] args) {
		int a=5;
		
		/*
		 	 Post increment, increments the value at next step of execution
		 	 
		 	 pre increment , increments the value at that particular instance
		 */
		System.out.println(a++);
		
		System.out.println(++a);
	
		System.out.println(a--);
		
		System.out.println(--a);
		
		System.out.println(a++ + ++a + a-- + --a);
	}
}
