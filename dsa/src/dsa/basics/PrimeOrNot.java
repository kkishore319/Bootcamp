package dsa.basics;

public class PrimeOrNot {
	public static void main(String[] args) {
		int n = 1;
		boolean b=true;
		if(n==0 || n==1) {
			b=false;
		}
		
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				b=false;
				break;
			}
		}
		if(b) {
			System.out.println(n+" is prime");
		}else {
			System.out.println(n+" is not prime");
		}
	}

}
