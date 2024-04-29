package dsa.recursion;

public class SumofNnaturals {

	int i=1;
	 //static int sum=0;
	public static void main(String[] args) {
		
		sumOfNaturals(3,0);
		System.out.println(functioanlSum(3));
		//System.out.println(sum);
	}
	
	//parameterized way like calling sum n times and adding the =m
	public static  void sumOfNaturals(int n,int sum) {
		if(0==n) {
			System.out.println(sum);
			return ;
		}
		sum+=n;
		 sumOfNaturals(n-1,sum);
	}
	
	//functional way like return the n + function(n-1) which is simpler
	public static int functioanlSum(int n) {
		if(n==1) {
			return 1;
		}
		return n + functioanlSum(n-1);
	}
	
}
