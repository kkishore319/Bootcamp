package dsa.basics;

public class ArmStrongNumOrNot {
	public static void main(String[] args) {
		
		int num= 123;
		int n= (int) (Math.floor(Math.log10(num))+1);
		//System.out.println(n);
		
		int sum=0;
		while(num>0) {
			int i= num%10;
			sum=(int) (sum+ Math.pow(i, n));
			//System.out.println(sum);
			num/=10;
		}
		//System.out.println(sum);
		
		if(sum==num) {
			System.out.println(num+" is armstrong number");
		}else {
			System.out.println(num+" is not armstrong number");
		}
	}

}
