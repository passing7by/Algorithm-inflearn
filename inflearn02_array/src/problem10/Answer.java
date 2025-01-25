package problem10;

import java.util.Scanner;

public class Answer {
	// arr[x][y] 지점의 상하좌우를 체크하기 위해 만든 배열
	// x, y에 각각 dx, dy를 더하여 위치를 상하좌우로 이동함
	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, 1, 0, -1};
	// [x, y] 지점에 dx[index]와 dy[index]값을 더했을 때,
	// index = 0 이면 [x-1, y] 지점 즉, [x, y] 지점의 왼쪽(<)
	// index = 1 이면 [x, y+1] 지점 즉, [x, y] 지점의 아래쪽
	// index = 2 이면 [x+1, y] 지점 즉, [x, y] 지점의 오른쪽(>)
	// index = 3 이면 [x, y-1] 지점 즉, [x, y] 지점의 위쪽(^)
	
	public int solution(int n, int[][] arr){
		int answer = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// 봉우리면 true, 아니면 false
				boolean flag = true;
				
				// [i, j] 위치의 상하좌우 값 체크
				for (int k = 0; k < 4; k++) {
					int nx = i+dx[k];
					int ny = j+dy[k];
					
					// 경계선 처리
					if (nx>=0 && nx<n && ny>=0 && ny<n) {
						// 현재 위치의 상하좌우에 현재 위치의 값보다 크거나 같은 게 하나라도 있으면 봉우리 X
						if (arr[nx][ny]>=arr[i][j]) {
							flag = false;
							break;
							// 봉우리가 아니면 바로 loop3을 빠져나옴
						}
					}
				}
				
				if(flag) answer++;
				// loop3이 끝난 후에도 flag == true 이면 봉우리 갯수 증가
			}
		}
		
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
