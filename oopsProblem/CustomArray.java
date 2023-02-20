package oopsProblem;

import java.util.Arrays;
import java.util.Scanner;

public class CustomArray<T> {
	T[] arr;
	int index;
	@SuppressWarnings("unchecked")
	public CustomArray()
	{
		arr=(T[]) new Object[5];
		this.index=0;
	}
	public boolean isEmpty()
	{
		return this.index==0;
	}
	public int size()
	{
		return this.index;
	}
	public void add(T element)
	{
		if(index==arr.length)
			doubleArray();
		arr[index++]=element;
	}
	@SuppressWarnings("unchecked")
	private void doubleArray() {
		T[] duplicate=arr;
		arr=(T[]) new Object[duplicate.length * 2];
		for(int i=0;i<duplicate.length;i++)
		{
			arr[i]=duplicate[i];
		}
	}
	public void set(int index,T element)
	{
		if(index>=arr.length)
			return;
		arr[index]=element;
	}
	public void add(int index,T element)
	{
		if(index>=arr.length)
			return;
		for(int i=this.index-1;i>=index;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[index]=element;
		this.index++;
	}
	
	@Override
	public String toString() {
		return "CustomArray [arr=" + Arrays.toString(arr) + ", index=" + index + "]";
	}
	public T remove()
	{
		T element=arr[index-1];
		arr[index-1]=null;
		index--;
		return element;
	}
	public void remove(int index)
	{
		if(index>=arr.length)
		{
			return;
		}
		for(int i=index;i<=this.index;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[this.index]=null;
		index--;
	}
	public static void main(String[] args) {
		CustomArray<Integer> arr=new CustomArray<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			arr.add(sc.nextInt());
		}
		System.out.println(arr);
		arr.add(6);
		System.out.println(arr);
		System.out.println(arr.isEmpty());
		System.out.println(arr.remove());
		System.out.println(arr);
		arr.set(2,9);
		System.out.println(arr);
		arr.remove(2);
		System.out.println(arr);
		arr.add(2,3);
		System.out.println(arr);
		sc.close();
	}

}
