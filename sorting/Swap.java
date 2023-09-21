package sorting;

public class Swap {
	public void swap(int[] arr,int i,int j)
	{
		arr[i]=arr[i]+arr[j];
		arr[j]=arr[i]-arr[j];
		arr[i]=arr[i]-arr[j];
	}
	public void swapByT(int[] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
