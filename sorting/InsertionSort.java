package sorting;

public class InsertionSort {
	public void sort(int[] arr)
	{
		int length=arr.length;
		for(int i=0;i<length;i++)
		{
			int temp=arr[i];
			int j=i;
			for(;j>0 && arr[j-1]>temp;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[j]=temp;
		}
	}
}
