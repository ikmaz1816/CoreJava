package loops;

public class Break {
	public static void main(String[] args) {
		/*
		  break statement is used to stop the iteration 
		*/
		for(int i=0;i<5;i++)
		{
			if(i==3)
			{
				break;
			}
			System.out.println(i);
		}
	}
}
