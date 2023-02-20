package basics;

public class _L16BreakContinue {

	public static void main(String[] args) {
		//Break statement it used to terminate the loop
		//Continue statement is used to skip that iteration
		//return is used to termainate that particular method in the stack
		
		for(int i=0;i<=10;i++)
		{
			if(i==5)
				break;
			System.out.print(i+" ");
		}

		for(int i=0;i<=10;i++)
		{
			if(i==5)
				continue;
			System.out.print(i+" ");
		}
		
		for(int i=0;i<=10;i++)
		{
			if(i==5)
				return;
			System.out.print(i+" ");
		}
	}

}
