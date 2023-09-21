package sorting;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr= {9,8,7,6,5};
//		BubbleSort bubbleSort=new BubbleSort(new Swap());
//		bubbleSort.bubbleSort(arr);
		
//		BubblesortRecursive bubbleSort =new BubblesortRecursive(new Swap());
//		bubbleSort.bubbleSort(arr, arr.length-1, 0);
		
//		InsertionSort insertion=new InsertionSort();
//		insertion.sort(arr);
		
//		SelectionSort ss=new SelectionSort(new Swap());
//		ss.sort(arr);
		
//		RecursiveSelectionSort selection=new RecursiveSelectionSort(new Swap());
//		selection.sort(arr, arr.length, 0, 0);
		
//		MergeSort sort =new MergeSort();
//		sort.sort(arr, 0, arr.length);
		QuickSort sort=new QuickSort(new Swap());
		sort.sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
