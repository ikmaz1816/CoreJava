package sorting;

public class QuickSort {
	private Swap swap;
	public QuickSort(Swap swap)
	{
		this.swap=swap;
	}
	public void sort(int[] arr,int start,int end)
	{
		if(start<end)
		{
			int pivot=partition(arr,start,end);
			sort(arr,start,pivot-1);
			sort(arr,pivot+1,end);
		}
	}

	private int partition(int[] arr, int start, int end) {
		int pivot=end;
		int count=start-1;
		// As we are going to iterate till last element
		for(int i=start;i<end;i++)
		{
			if(arr[i]<arr[pivot])
			{
				count++;
				swap.swapByT(arr, count, i);
			}
		}
		count++;
		swap.swapByT(arr, end, count);
		return count;
	}
}
