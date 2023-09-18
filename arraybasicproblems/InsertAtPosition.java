package arraybasicproblems;

public class InsertAtPosition {
	public void insertAtPosition(int[] arr,int index,int value)
	{
		int length=arr.length;
		for(int i=length-1;i>=index;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[index]=value;
		//Edge cases can be taken care of
		
		
	}
}
