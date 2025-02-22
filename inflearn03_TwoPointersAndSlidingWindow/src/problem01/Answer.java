package problem01;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 그냥 두 배열을 합친 다음 정렬해도 되지만
 * 투 포인터 알고리즘을 이용해 효율적으로 해결 가능
 */
public class Answer {
	
	public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2){
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		int p1 = 0, p2 = 0;
		while(p1<n && p2<m) {
			if (arr1[p1] < arr2[p2]) answer.add(arr1[p1++]);
			// arr1[p1]가 리스트에 추가된 다음 p1이 1 증가함
			else answer.add(arr2[p2++]);
		}
		
		while(p1 < n) answer.add(arr1[p1++]);
		while(p2 < m) answer.add(arr2[p2++]);
		
		return answer;
	}
	
	public static void main(String[] args) {
		Answer A = new Answer();
		
		Scanner kb = new Scanner(System.in);
		
		// 입력
		int n = kb.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = kb.nextInt();
		}
		
		int m = kb.nextInt();
		int[] arr2 = new int[m];
		for (int i = 0; i < m; i++) {
			arr2[i] = kb.nextInt();
		}
		
		// 출력
		for(int x : A.solution(n, m, arr1, arr2)) System.out.print(x+" ");
	}
}
