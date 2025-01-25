package problem05;

import java.util.Scanner;

public class Answer {
	public int solution(int n) {
		int cnt=0;
		int[] ch = new int[n+1];
		for (int i = 2; i <= n; i++) {
			if (ch[i]==0) {
				cnt++;
				for (int j = i; j <= n; j=j+i) ch[j]=1;
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		Answer A = new Answer();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt(); // 자연수의 범위를 입력받음
		System.out.println(A.solution(n));
	}
}
