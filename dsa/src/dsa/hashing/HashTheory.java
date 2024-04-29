package dsa.hashing;

import java.util.Scanner;

public class HashTheory {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("enter array length");
		n= sc.nextInt();
		int[] arr= new int[n];
		System.out.println("enter array elems");
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		
		//pre compute;
		int[] hash = new int[13];
		
		for(int i=0;i<n;i++) {
			hash[arr[i]]+=1;
		}
		
		System.out.println("enter how many queries you need");
		int q= sc.nextInt();
		while(q-- !=0) {
			int num;
			System.out.println("enter the query");
			num = sc.nextInt();
			//fetch
			System.out.println(hash[num]);
		}
		
	}

}
