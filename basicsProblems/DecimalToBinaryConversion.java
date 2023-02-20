package basicsProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DecimalToBinaryConversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> ans=new ArrayList<>();
		int n=sc.nextInt();
		while(n>0)
		{
			ans.add(n%2);
			n/=2;
		}
		Collections.reverse(ans);
		System.out.println(ans);
		sc.close();

	}

}
