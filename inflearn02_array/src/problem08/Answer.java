package problem08;

import java.util.Scanner;

public class Answer {
	public int[] solution(int n, int[] arr){
		int[] answer = new int[n];
		for (int i = 0; i < n; i++) {
			int cnt = 1;
			for (int j = 0; j < n; j++) {
				if (arr[j]>arr[i]) cnt++;
			}
			answer[i] = cnt;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Answer A = new Answer();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); // 점수의 개수를 입력받음
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for (int x : A.solution(n, arr)) {
			System.out.print(x+" ");
		}
	}
}
