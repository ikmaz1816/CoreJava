package search;

public class LinearSearch {
	public int linearSearch(int[] arr,int key)
	{
		/*
		 	This is a type of search in which the order doesn't matter
		 	It iterates on the array members sequentially until the required member is found
		 	or the whole array is iterated
		 	T.C->O(n)
		 */
		int length=arr.length;
		for(int i=0;i<length;i++)
		{
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
}
