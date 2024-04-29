package dsa.recursion;

public class Print1toN {
	// int i = 0;
	public static void main(String[] args) {
		// int i=0;
		int n = 5;
		printNum(1, n);

	}

	public static void printNum(int i, int n) {
		if (i == n + 1) {
			return;
		}
		System.out.println(i);
		printNum(i + 1, n);
	}
	public static void printNum1(int i,int n) {
		
	}

}
