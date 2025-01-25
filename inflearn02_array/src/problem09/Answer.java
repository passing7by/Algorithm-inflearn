package problem09;

import java.util.Scanner;

public class Answer {
	public int solution(int n, int[][] arr){
		// 최댓값을 리턴해야되니까 초기값을 가장 작은 정수로 초기화 해 줬음
		int answer = Integer.MIN_VALUE;
		
		// sum1 : 행의 합 | sum2 : 열의 합
		int sum1 = 0, sum2 = 0;

		for (int i = 0; i < n; i++) {
			sum1 = sum2 = 0;
			// i가 바뀔 때마다 초기화 해 주어야 함
			
			for (int j = 0; j < n; j++) {
				// i=0일 때 0<=j<=4
				sum1 += arr[i][j]; // 행 고정, 열 이동
				sum2 += arr[j][i]; // 열 고정, 행 이동
			}
			// 이전의 answer와 sum1 중 큰 값을 answer로
			answer = Math.max(answer, sum1);
			// 이전의 answer와 sum2 중 큰 값을 answer로
			answer = Math.max(answer, sum2);
			// 행, 열, 기존의 answer 중 큰 값이 answer가 됨
		}
		
		sum1 = sum2 = 0;
		
		// 대각선 체크
		for (int i = 0; i < n; i++) {
			sum1 += arr[i][i]; // 대각선1
			sum2 += arr[i][n-i-1]; // 대각선2
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		// 대각선1, 대각선2, 기존의 answer 중 큰 값이 answer가 됨
		
		return answer;
	}
	
	public static void main(String[] args) {
		Answer A = new Answer();
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
		System.out.println(A.solution(n, arr));
	}
}
