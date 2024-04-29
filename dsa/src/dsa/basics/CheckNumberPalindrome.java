package dsa.basics;

public class CheckNumberPalindrome {
	public static void main(String[] args) {
		int number=162321;
		System.out.println(number +" is "+isPalindrome(number));
		
	}
	public static String isPalindrome(int n) {
		int m=n;
		int rev=0;
		while(m>0) {
			int r= m%10;
			rev=rev*10+r;
			m/=10;
		}
		if(rev==n) {
			return "palindrome";
		}else {
			return "not palindrome";
		}
	}
}
