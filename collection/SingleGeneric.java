package collection;

public class SingleGeneric<T> {

	T variable;
	public SingleGeneric(T data)
	{
		variable=data;
	}
	public T getVariable()
	{
		return variable;
	}
	public static void main(String[] args) {
		SingleGeneric<Integer> s=new SingleGeneric<>(5);
		System.out.println(s.getVariable());

	}

}
