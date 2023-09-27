package inheritance;

class First
{
	public void display()
	{
		System.out.println("In first");
	}
}
class Second extends First
{
	public void show()
	{
		System.out.println("In Second");
	}
}
class Third extends Second
{
	/*
	 	Second has its properties and First properties 
	 	So now all the properties are extended by Third
	 */
}
public class MultiLevel {
	public static void main(String[] args) {
		Third t=new Third();
		t.show();
		t.display();
	}
}	
