package dsa.basics;

public class CountDigits {
	public static void main(String[] args) {
		int m=13232;
		int n=m;
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
					
		}
		System.out.println(count	);
		
		String sn=Integer.toString(m);
		System.out.println(sn.length());
	}

}
