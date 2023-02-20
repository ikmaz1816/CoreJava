package basics;

public class TypeCasting {

	public static void main(String[] args) {
		//char-> byte->int->long->float->double
	//Int can fit in long
		long a=4;
		//as long cannot fit in integer we typecast it
		int b=(int)a;
		System.out.println(b);
	}

}
