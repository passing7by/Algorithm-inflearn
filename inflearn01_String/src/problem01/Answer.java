package problem01;

import java.util.Scanner;

public class Answer {
	public int solution(String str, char c) {
		// 대소문자를 구분하지 않으므로 문자열과 문자열 모두 대문자로 변환
		str = str.toUpperCase();
		c = Character.toUpperCase(c);
		
		// 대문자 변환 확인
//		System.out.println(str + " " + c);
		
		int answer = 0;
		
		// 문자열의 문자 하나하나를 인덱스로 접근
		/*
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == c) answer++;
		} // for
		*/
		
		// foreach로 접근
		for(char x : str.toCharArray()) {
			if(x == c) answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Answer A = new Answer();
		
		// 입력
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		
		// 출력
		System.out.println(A.solution(str, c));
	}
}
