package arraybasicproblems;

public class MinNumber {
	public int min(int[] arr)
	{
		int min=Integer.MAX_VALUE;
		int length=arr.length;
		for(int i=0;i<length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
}
