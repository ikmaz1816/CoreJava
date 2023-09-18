package arraybasicproblems;

public class MaxNumber {
	public int max(int[] arr)
	{
		int max=Integer.MIN_VALUE;
		int length=arr.length;
		for(int i=0;i<length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
}
