package basics;

public class _L12ForLoop {
	//This is an entry controlled loop
	public static void main(String[] args) {
		//Printing only the even numbers in the range 0 to 20
		for(int i=0;i<=20;i++)
		{
			if((i&1)==0)
				System.out.print(i+" ");
		}

	}

}
