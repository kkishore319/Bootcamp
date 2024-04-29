package dsa.basics;

public class NumberReverse {
	public static void main(String[] args) {
		
		int n=1235;
		int rev=0;
		while(n>0) {
			int r= n%10;
			rev=rev*10+r;
			n/=10;
		}
		System.out.println(rev);
	}

}
