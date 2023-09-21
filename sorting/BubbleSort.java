package sorting;

public class BubbleSort {
	private Swap swap;
	
	public BubbleSort(Swap swap)
	{
		this.swap=swap;
	}
	
	public void bubbleSort(int[] arr)
	{
		int length=arr.length;
		for(int i=0;i<length-1;i++)
		{
			for(int j=0;j<length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					swap.swap(arr, j, j+1);
				}
			}
		}
	}
}
