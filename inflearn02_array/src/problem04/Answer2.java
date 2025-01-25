package problem04;

import java.util.Scanner;

// 배열을 사용하지 않을 경우의 코드
public class Answer2 {
	public void solution(int n) {
		int a=1, b=1, c;
		System.out.print(a+" "+b+" "); // 맨 처음 1 두 개는 반드시 출력되므로 계산 없이 바로 출력
		for(int i=2; i<n; i++) {
			c=a+b; // 세 번째 숫자부터의 값은 앞의 두 숫자의 합
			System.out.println(c+" ");
			// 세 번째 숫자부터의 값을 출력한 뒤, a와 b의 값 초기화
			a=b;
			b=c;
		}
	}
	
	public static void main(String[] args) {
		Answer2 A = new Answer2();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt(); // 출력할 숫자의 갯수를 입력받음
		A.solution(n);
	}
}
