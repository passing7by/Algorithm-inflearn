package problem02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 오름차순으로 출력하라고 했으니까
 * 투 포인터 알고리즘을 사용하기 전에
 * 각 배열을 오름차순 정렬 해놓아야 함
 */
public class Answer {
	
	public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2){
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int p1 = 0, p2 = 0;
		while(p1<n && p2<m) {
			if(arr1[p1] == arr2[p2]) {
				answer.add(arr1[p1++]);
				p2++;
			}
			else if(arr1[p1] < arr2[p2]) p1++;
			else p2++;
		}
		
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
