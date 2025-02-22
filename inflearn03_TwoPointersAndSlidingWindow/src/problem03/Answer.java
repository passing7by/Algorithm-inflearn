package problem03;

import java.util.Scanner;

/*
 * 슬라이딩 윈도우(O(n)
 * n>100,000이므로 2중 for문 사용 불가(O(n^2))
 */
public class Answer {
	
	public int solution(int n, int k, int[] arr){
		int answer = 0, sum = 0;
		
		for (int i = 0; i < k; i++) sum += arr[i];
		answer = sum;
		
		for (int i = k; i < n; i++) {
			sum += (arr[i] - arr[i-k]);
			answer = Math.max(answer, sum);
			// answer와 sum 중 큰 수가 새로이 answer이 됨
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Answer A = new Answer();
		
		Scanner kb = new Scanner(System.in);
		
		// 입력
		int n = kb.nextInt(); // 매출 일수
		int k = kb.nextInt(); // 연속 일수
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		// 출력
		System.out.println(A.solution(n, k, arr));
	}
}
