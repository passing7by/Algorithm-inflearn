package problem04;

import java.util.Scanner;

public class Answer {
	
	public int solution(int n, int m, int[] arr){
		int cnt = 0, tmpSum = 0;
		int lt = 0;
		
		for (int rt = 0; rt < n; rt++) {
			tmpSum += arr[rt];
//			System.err.println(tmpSum);
			
			while (tmpSum > m) {
				tmpSum -= arr[lt++];
//				System.err.println(tmpSum);
//				lt++;
			}
			if (tmpSum == m) cnt++;
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		Answer A = new Answer();
		
		Scanner kb = new Scanner(System.in);
		
		// 입력
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		// 출력
		System.out.println(A.solution(n, m, arr));
	}
}
