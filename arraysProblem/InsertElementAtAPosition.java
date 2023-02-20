package arraysProblem;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementAtAPosition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n+1];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int element=sc.nextInt();
		int pos=sc.nextInt();
		for(int i=n-1;i>=pos;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[pos]=element;
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
