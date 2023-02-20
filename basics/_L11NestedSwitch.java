package basics;

public class _L11NestedSwitch {

	public static void main(String[] args) {
		int a =5 ,b=3;
		switch(a)
		{
		case 1:
			System.out.println("1");
			switch(b)
			{
			case 1:
				break;
			}
			//Mostly used for calling objects
		}

	}

}
