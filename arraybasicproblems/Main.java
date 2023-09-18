package arraybasicproblems;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		MaxNumber max=new MaxNumber();
		System.out.println(max.max(arr));
		
		MinNumber min=new MinNumber();
		System.out.println(min.min(arr));
		
		InsertAtPosition insert=new InsertAtPosition();
		insert.insertAtPosition(arr, 2, 2);
		System.out.println(Arrays.toString(arr));
		
		DeleteFromPosition delete=new DeleteFromPosition();
		delete.deleteAtPosition(arr, 2);
		System.out.println(Arrays.toString(arr));
	}
}
