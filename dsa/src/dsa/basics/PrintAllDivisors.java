package dsa.basics;

public class PrintAllDivisors {
	public static void main(String[] args) {
		//normal method
		int n=36;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("------------------------------------------------------------------------");
		
		//optimum approach by printing 1st and last divisors
		
		for(int i=1;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				System.out.print(i+" ");
				if(i!=n/i) {
					System.out.print(n/i+" ");
				}
			}
		}
		
	}
	


}
