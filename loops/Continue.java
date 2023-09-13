package loops;

public class Continue {
	public static void main(String[] args) {
		// continue is used to skip the iteration
		int i=0;
		while(i<5)
		{
			i++;
			if(i==3)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}
