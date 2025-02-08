package problem12;

import java.util.Scanner;

/*
 * 멘토-멘티의 총 가짓수 : 4*4 (본인이 스스로의 멘토이자 멘티인 경우 포함)
 * => 2중 for문이 돌아야 함
 */
public class Answer {
	
	public int solution(int n, int m, int[][] arr){
		int answer = 0;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				int cnt=0;
				for (int k = 0; k < m; k++) {
					int pi = 0, pj = 0;
					for (int s = 0; s < n; s++) {
						if (arr[k][s] == i) pi = s;
						if (arr[k][s] == j) pj = s;
					}
					if (pi < pj) cnt++;
				}
				if (cnt == m) {
					answer++;
//					System.out.println(i+" "+j);
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Answer A = new Answer();
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // 학생 수
		int m = kb.nextInt(); // 시험 수
		
		int[][] arr = new int[m][n]; // 배열 길이를 왜 이렇게 설정?
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
		System.out.println(A.solution(n, m, arr));
	}
}
