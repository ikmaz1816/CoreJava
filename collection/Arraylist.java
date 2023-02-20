package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
		//It is also called as dynamic array and the size increases with increase in elements 
		List<Integer> arr=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			arr.add(sc.nextInt());
		}
		System.out.println(arr);
		arr.set(0, 2);
		//set removes the value at that particular index
		System.out.println(arr);
		arr.add(2, 9);
		//Add works same as insertion of element in an array
		System.out.println(arr);
		
		Collections.sort(arr);
		System.out.println(arr);
		
		Collections.reverse(arr);
		System.out.println(arr);
		sc.close();
	}

}
