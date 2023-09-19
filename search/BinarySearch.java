package search;

public class BinarySearch {
	public int binarySearch(int[] arr,int key)
	{
		/*
		 	In this type the array must be in sorted manner 
		 	The space search reduces at each and every execution and hence it has less time 
		 	complexity compared to linear search
		 	T.C->O(logn)
		 */
		int start=0;
		int end=arr.length;
		while(start<=end)
		{
			int mid=(start +end)/2;
			if(arr[mid]==key)
				return mid;
			else if(arr[mid]>key)
				end=mid-1;
			else
				start=mid+1;
		}
		return -1;
	}
}
