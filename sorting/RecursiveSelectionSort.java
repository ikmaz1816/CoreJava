package sorting;

public class RecursiveSelectionSort {
	private Swap swap;
	public RecursiveSelectionSort(Swap swap)
	{
		this.swap=swap;
	}
	public void sort(int[] arr,int r,int c,int max)
	{
		if(r==0)
			return;
		if(r>c)
		{
			if(arr[c]>arr[max])
			{
				sort(arr,r,c+1,c);
			}
			else
				sort(arr,r,c+1,max);
		}
		else
		{
			swap.swapByT(arr, r-1, max);
			sort(arr,r-1,0,0);
		}
	}
}
