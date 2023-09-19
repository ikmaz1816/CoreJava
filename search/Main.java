package search;

public class Main {
	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,4,5};
		int key=4;
		
		System.out.println(new LinearSearch().linearSearch(arr, key));
		System.out.println(new BinarySearch().binarySearch(arr, key));
	}
}
