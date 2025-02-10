package problem03;

import java.util.Scanner;

/*
 * 1. 매출 일수(N)가 입력됨(5~100,000)
 * 2. 공백 입력 후 연속 일수(K)가 입력됨(2~매출 일수)
 * 3. 두 번째 줄에 매출 일수(N)만큼의 숫자가 공백을 사이에 두고 입력됨(0~500)
 * 출력 : 최대 매출액
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력
		int n = sc.nextInt(); // 매출 일수
		int k = sc.nextInt(); // 연속 일수
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 로직
		// 시간 초과...
		int sp = 0;
		int ep = k-1;
		int maxSum = 0;
		while(ep <= n-1) {
			int sum = 0;
			// i=sp부터 i=ep까지 반복문을 돌며 더함
			for (int i = sp; i <= ep; i++) sum += arr[i];
			// 합이 기존의 maxSum보다 크면 maxSum에 저장
			if (sum > maxSum) maxSum = sum;
			sp++;
			ep++;
		}
		
		// 출력
		System.out.println(maxSum);
	}
}
