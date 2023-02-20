package collection;

public class MutlipleGeneric<S,T> {
	private S var1;
	private T var2;
	public MutlipleGeneric(S var1,T var2)
	{
		this.var1=var1;
		this.var2=var2;
	}
	public S getVar1()
	{
		return var1;
	}
	public T getVar2()
	{
		return var2;
	}
	public static void main(String[] args) {
		MutlipleGeneric<String,Integer> mg=new MutlipleGeneric<>("Ayaan",1);
		System.out.println(mg.getVar1()+" "+mg.getVar2());

	}

}
