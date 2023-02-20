package arraysProblem;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int pos=sc.nextInt();
		sc.close();
		if(pos==n+1)
		{
			arr[pos]=0;
			return;
		}
		for(int i=pos;i<n-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[n-1]=0;
		System.out.println(Arrays.toString(arr));
	}

}
