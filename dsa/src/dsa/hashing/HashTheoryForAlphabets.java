package dsa.hashing;

import java.util.Scanner;

public class HashTheoryForAlphabets {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s= sc.next();
		
		//pre compute
		int[] hash  = new int[25];
		for(int i=0;i<s.length();i++) {
			hash[s.charAt(i)-'a']+=1;
		}
		
		System.out.println("enter how many queries you need");
		int q= sc.nextInt();
		while(q-- !=0) {
			System.out.println("enter the query");
			 int ch = sc.next().charAt(0);
			 //fetch
			 System.out.println(hash[ch-'a']);
		}
	}

}
