package arraybasicproblems;

public class DeleteFromPosition {
	public void	deleteAtPosition(int[] arr,int index)
	{
		int length=arr.length;
		for(int i=index;i<length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[length-1]=0;
		//Edge cases can be taken care of
	}
}
