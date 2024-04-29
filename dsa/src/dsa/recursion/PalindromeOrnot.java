package dsa.recursion;

public class PalindromeOrnot {
	public static void main(String[] args) {
		String s = "maffdam";
		// palindromeORnotNOrmal(s);
		if (palindromeOrNOtRecursive(s, 0)) {
			System.out.println(s + " is palindrome");
		} else {
			System.out.println(s + " is not palindrome");
		}
	}

	// recursive approach
	private static boolean palindromeOrNOtRecursive(String s, int left) {
		// TODO Auto-generated method stub
		// left; right=s.length()-1;
		if (left > s.length() / 2) {
			// System.out.println(s+" not palindrome");
			return true;
		}
		if (s.charAt(left) != s.charAt(s.length() - left - 1)) {
			return false;
		}

		return palindromeOrNOtRecursive(s, left + 1);

	}

	// normal approach
	private static void palindromeORnotNOrmal(String s) {
		// String[] ss = s.split("");
		boolean b = true;
		int n = s.length() - 1;
		int i = 0;
		while (i <= (n / 2) + 1) {
			if (s.charAt(i) != (s.charAt(n - i))) {
				b = false;
				break;
			}
			i++;
		}
		if (b) {
			System.out.println(s + " is palindrome");
		} else {
			System.out.println(s + " is not palindrome");
		}
	}

}
