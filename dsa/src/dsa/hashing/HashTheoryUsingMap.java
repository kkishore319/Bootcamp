package dsa.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashTheoryUsingMap {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		
		HashMap<Integer, Integer> mp = new HashMap<>();
		for(int i=0;i<n;i++) {
		mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
//			if(!mp.containsKey(arr[i])) {
//				mp.put(arr[i], 1);
//			}else {
//				mp.put(arr[i], mp.get(arr[i])+1);
//			}
		
		}
//		for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
//			Integer key = entry.getKey();
//			Integer val = entry.getValue();
//			System.out.println(key+"->"+val);
//			
//		}
//		
		int q= sc.nextInt();
		while(q-- != 0) {
			int num= sc.nextInt();
			//fetch
			System.out.println(mp.getOrDefault(num, 0));
		}
		
		
		
	}
}
