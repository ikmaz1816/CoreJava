package operator;

public class LogicalOperator {

	public static void main(String[] args) {
		
		/*
		  Logical Operator  are operator used with relational operator
		  
		  &&-> If there are n conditions then all the n conditions has to be true
		  
		  ||->  If there are n conditions any one condition has to be true
		  
		  !-> It is used to negate the condition
		 */
		
		int a =5 ;
		int b=6;
		
		System.out.println(a>5 && b<=6);
		
		System.out.println(a>5 || b<=6);
		
		System.out.println(!(a>5 && b<=6));

	}

}
