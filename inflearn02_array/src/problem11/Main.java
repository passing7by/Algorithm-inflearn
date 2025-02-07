package problem11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 학생 수 n은 3<=n<=1,000
 * O(n^2 log n) 까지 가능 | O(n^3) 불가
 * 1. 학생 수 n이 입력됨
 * 2. 한 학생당 한 줄에 1~5학년 동안 몇 반에 속했었는지 공백을 사이에 두고 입력됨
 *    이때 모든 정수는 1~9
 * 3. 같은 반이었던 다른 학생이 가장 많은 학생이 임시반장임
 * 4. 임시 반장인 학생의 번호 출력
 *    단, 여러명인 경우 그중 가장 적은 번호만 출력
 */
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 같은 반이었던 학생 수를 어떻게 도출해낼까...
		// 2차원 배열?
		/*
		 * r=행, c=열 이라고 치면
		 * r=0이고
		 * (0,0)=8일 때
		 * (0,1), (0,2).. 의 값을 해당 값과 비교하여 cnt++
		 * cnt가 가장 많은 r가 임시반장
		 * cnt는 배열에 저장해놨다가
		 * 그 배열의 값끼리 비교해서 값이 가장큰(max<x) 인덱스는 index+1 해서 반장 출력
		 */
		
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n+1][6]; // n개의 행(r), 5개의 열(c)을 가지는 2차원 배열
		for (int r = 1; r <= n; r++) {
			String[] strs = br.readLine().split(" "); // strs.length == 5
			for (int c = 1; c <= 5; c++) {
				arr[r][c] = Integer.parseInt(strs[c-1]);
			}
		}
		
		// 입력 테스트
//		for (int r = 0; r < n; r++) {
//			for (int c = 0; c < 5; c++) System.out.print(arr[r][c]+" ");
//			System.out.println();
//		}
//		System.out.println(arr[0][1]);
//		System.out.println(arr.length); // 행의 갯수(n)
//		System.out.println(arr[0].length); // 열의 갯수(5)
		
		// 로직
		int max = 0, maxStudnt = 0;
		for (int i = 1; i <= n; i++) { // i번 학생
			int cnt = 0;
			for (int k = 1; k <= 5; k++) { // k학년 때
				for (int j = 1; j <= n; j++) { // j번 학생들
					// arr[i][k]과 arr[j][k]...를 비교하며 cnt++
					if (arr[i][k] == arr[j][k]) cnt++;
				}
			}
			
			// 만약 cnt가 max보다 크면 max에 cnt를, maxStudnt에 i를 저장
			if (cnt > max) {
				max = cnt;
				maxStudnt = i;
			}
		}
		
		// 출력
		System.out.println(maxStudnt);
	}
}
