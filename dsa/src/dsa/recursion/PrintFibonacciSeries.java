package dsa.recursion;

public class PrintFibonacciSeries {
	//private static Object[] arr;
	static int [] arr;
	public static void main(String[] args) {
		
		int n=5;
		
		//printFiboNormal(n);
		System.out.println();
		
		//System.out.println(printFiboRecursive(n));
		System.out.println();
		//printFiboNormalByArrays(n);
		arr= new int[n+1];
 		setARray(5);
 		//System.out.println(arr.length);
 		
 		for(int i:arr) {
 			System.out.print(i+" ");
 		}
	}

	private static void setARray(int n) {
		// TODO Auto-generated method stub
		if(n<=1) {
			arr[0]=0;
			arr[1]=1;
			return;
		}
		arr[n] = printFiboRecursive(n);
		setARray(n-1);
		
	}

	private static void printFiboNormalByArrays(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.println(0);
		}else {
			int fib[] = new int[n+1];
			fib[0]=0;
			fib[1]=1;
			for(int i=2;i<=n;i++) {
				fib[i]=fib[i-1]+fib[i-2];
			}
			for(int i: fib) {
				System.out.print(i+" ");
			}
		}
		
		
	}

	private static int  printFiboRecursive(int n) {
		// TODO Auto-generated method stub
		// 0 1 1 2 3  5(f'4) 
		if(n<=1) {
			return n;
		}
		int last =printFiboRecursive(n-1);
		int slast= printFiboRecursive(n-2);
		return last+slast;
	}

	private static void printFiboNormal(int n) {
		// TODO Auto-generated method stub]
		int a=0;
		int b=1;
		int c;
		if(n<=0 || n==0) {
			System.out.println(n+" is less than zero");
			return;
		}
		System.out.print(a+" "+b+" ");
		while(n-1>0) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			n--;
		}
		
		
	}

}
