package problem07;

import java.util.Scanner;

public class Main {
	// 1. 문자열이 입력됨 (범위 : 0? ~100)
	// 2. 회문 문자열이면 YES, 아니면 NO를 출력함 (대소문자를 구분하지 않음)
	
	public String solution(String str) {
		String answer = "YES";
		
		char[] tmp = str.toUpperCase().toCharArray();
		
		int lt = 0, rt = tmp.length-1;
		
		while (lt<rt) {
			if (tmp[lt] != tmp[rt]) answer = "NO";
			
			lt++;
			rt--;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		
		// 입력 및 출력
		Scanner in = new Scanner(System.in);
		
		System.out.println(m.solution(in.next()));
	}
}
