package sorting;

public class SelectionSort {
	
	private Swap swap;
	public SelectionSort(Swap swap)
	{
		this.swap=swap;
	}
	public void sort(int[] arr)
	{
		int length=arr.length;
		for(int i=0;i<length;i++)
		{
			int min=i;
			for(int j=i+1;j<length;j++)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
			}
			/*
			 	Here are swap function would create addition issue
			 */
			swap.swapByT(arr, i, min);
		}
	}
}
