package problem01;

import java.util.ArrayList;
import java.util.Scanner;

public class Answer {
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>(); // 출력될 숫자들을 담을 ArrayList 생성
		answer.add(arr[0]); // 첫 번째 숫자는 무조건 출력됨
		for(int i=1; i<n; i++) {
			if(arr[i]>arr[i-1]) answer.add(arr[i]);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Answer A = new Answer();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=kb.nextInt();
		}
		for (int x : A.solution(n, arr)) {
			System.out.print(x+" ");
		}
	}
}
