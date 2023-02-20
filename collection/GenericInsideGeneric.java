package collection;

public class GenericInsideGeneric<S,T> {
	private S first;
	private T second;
	public void setFirst(S first)
	{
		this.first=first;
	}
	public void setSecond(T second)
	{
		this.second=second;
	}
	public S getFirst()
	{
		return first;
	}
	public T getSecond()
	{
		return second;
	}
	public static void main(String[] args) {
		GenericInsideGeneric<GenericInsideGeneric<String,Integer>,Integer> gig=new GenericInsideGeneric<>();
		gig.setSecond(98);
		GenericInsideGeneric<String,Integer> inside=new GenericInsideGeneric<String,Integer>();
		inside.setFirst("Ayaan");
		inside.setSecond(24);
		gig.setFirst(inside);
		System.out.println(gig.getSecond());
		System.out.println(gig.getFirst().getSecond());
		System.out.println(gig.getFirst().getFirst());
		
	}

}
