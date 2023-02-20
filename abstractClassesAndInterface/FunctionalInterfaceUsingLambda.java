package abstractClassesAndInterface;

interface Product
{
	int res(int a,int b);
}
public class FunctionalInterfaceUsingLambda {

	public static void main(String[] args) {
		Product p=(a,b)->a*b;
		System.out.println(p.res(2, 3));

	}

}
