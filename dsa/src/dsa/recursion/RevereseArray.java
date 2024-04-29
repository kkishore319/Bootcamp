package dsa.recursion;

import java.util.Arrays;

public class RevereseArray {
	public static void main(String[] args) {
		
		
		int n=4; int[] a1= {1,2,3,4};
		int[] b=new int[n];
		int[] a2 = new int[n];
		
		
	
		
		

		//rev(n, a2)
		//reverseArrayBySameArray(n,a1);
		//reverseArrayViaRecursion(a1, 0, n-1);
		
		
		for(int i:a1) {
		System.out.println(i);
	}		
		
		
	}

	//normal way 1st approach via another array 
	public static int[] rev(int n,int [] a) {
		int[] b = new int[n];
		for(int i=n-1;i>=0;i--) {
			b[i]=a[i];
		}
		return b;
	}
	
	
	// another approach via same array by swaping elements
	public static void reverseArrayBySameArray(int n, int[] a) {
		int p1=0, p2=n-1;
		while(p1<p2) {
			int temp= a[p1];
			a[p1]= a[p2];
			a[p2]= temp;
			p1++;
			p2--;
		}
		
	}
	
	//Recursive approach
	public static void reverseArrayViaRecursion(int[] a, int start, int end) {
		if(start<end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			reverseArrayViaRecursion(a, start+1, end-1);
		}
	}
	
	

}
