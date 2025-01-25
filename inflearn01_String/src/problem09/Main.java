package problem09;

import java.util.Scanner;

public class Main {
	// 1. 숫자 포함 문자열이 입력됨 (범위 : 0? ~100)
	// 2. 숫자를 뽑아내 자연수로 만들어서 출력
	
	public int solution(String str) {
		String answer = "";

		for (char x : str.toCharArray()) {
			if (Character.isDigit(x)) answer += x;
		}

		return Integer.parseInt(answer);
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		
		Scanner in = new Scanner(System.in);
		System.out.println(m.solution(in.next()));
	}
}
