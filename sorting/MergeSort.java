package sorting;

public class MergeSort {
	public void sort(int[] arr,int start,int end)
	{
		if(end-start==1)
			return;
		int mid=(start+end)/2;
		sort(arr,start,mid);
		sort(arr,mid,end);
		merge(arr,start,mid,end);
		
	}

	private void merge(int[] arr, int start, int mid, int end) {
		int i=start;
		int j=mid;
		int k=0;
		int[] ans=new int[end-start];
		while(i<mid && j<end)
		{
			if(arr[i]>=arr[j])
			{
				ans[k++]=arr[j++];
			}
			else
			{
				ans[k++]=arr[i++];
			}
		}
		while(i<mid)
		{
			ans[k++]=arr[i++];
		}
		while(j<end)
		{
			ans[k++]=arr[j++];
		}
		for(int u=0;u<ans.length;u++)
		{
			arr[u+start]=ans[u];
		}
	}
}
