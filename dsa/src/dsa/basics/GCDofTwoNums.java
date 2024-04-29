package dsa.basics;

public class GCDofTwoNums {
	public static void main(String[] args) {
		
		//int m, n= 4, 8;
		int m=48, n=18;
		int x;
//		if(m>n) {
//			x=n;
//		}else {
//			x=m;
//		}
		
		// normal method
		x=Math.min(m, n);
		
		for(int i=x;i>1;i--) {
			if((m%i==0)&&(n%i==0)) {
				System.out.println(i);
				break;
			}
		}
		
		//recursion method
		System.out.println("the gcd of "+m+" and "+n+" is "+gcd(m,n));
		
		
	}
	static int  gcd(int a,int b) {
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}
	

}
