package sorting;

public class BubblesortRecursive {
	Swap swap;
	
	public BubblesortRecursive(Swap swap)
	{
		this.swap=swap;
	}
	public void bubbleSort(int[] arr,int r,int c)
	{
		if(r==0)
			return;
		if(r>c)
		{
			if(arr[c]>arr[c+1])
			{
				swap.swap(arr, c, c+1);
			}
			bubbleSort(arr,r,c+1);
		}
		else
			bubbleSort(arr,r-1,0);
	}
}
