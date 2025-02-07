package problem11;

import java.util.Scanner;

// 0번은 아예 사용하지 않기로 함 => arr[n+1][6]의 배열로 입력받기
// 삼중 for문
public class Answer {
	
	public int solution(int n, int[][] arr){
		int answer = 0, max = Integer.MIN_VALUE;
		
		for (int i = 1; i <= n; i++) { // i번 학생
			int cnt = 0;
			for (int j = 1; j <= n; j++) { // j번 학생
				for (int k = 1; k <= 5; k++) { // k학년
					if (arr[i][k] == arr[j][k]) {
						cnt++;
						break;
						// i와 j가 같은반인걸 확인하고 cnt++하고 k for문을 나와야 함
						// 왜? 우리가 궁금한건 i학생과 j학생이 같은반 된 적 있냐/없냐 임 (0 or 1)
						// 같은 반 된 적이 있는 걸 확인한 후에도 k for문이 돌아버리면, 그 후에 같은 반이 있을 경우 카운팅이 또 되어버림(2 이상)
					}
				}
			}
			
			if(cnt>max) {
				max = cnt;
				answer=i;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Answer A = new Answer();
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		int[][] arr = new int[n+1][6]; // 배열 길이를 왜 이렇게 설정?
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 5; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
		System.out.println(A.solution(n, arr));
	}
}
