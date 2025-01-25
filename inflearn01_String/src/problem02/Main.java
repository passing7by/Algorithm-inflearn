package problem02;

import java.util.Scanner;

public class Main {
	// 1. 문자열이 입력됨 (길이 : 0? ~ 100)
	// 2. 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력
	
	public String solution(String str) {		
		String answer = "";
		
		// 문자열 안의 문자 하나하나가 대문자인지 소문자인지 체크한 후, 변환하여 answer에 덧붙이기
		for (char x : str.toCharArray()) {
			// if-else
			/*
			if (Character.isUpperCase(x)) { // 만약 대문자라면 소문자로 변환하여 덧붙임
				String lower = (x+"").toLowerCase();
				answer = answer + lower;
			} else { // 만약 소문자라면 대문자로 변환하여 덧붙임
				String upper = (x+"").toUpperCase();
				answer = answer + upper;
			} // if-else
			*/
			
			// 삼항연산자
			boolean isUpper = Character.isUpperCase(x);
			// answer의 값은 기존 answer의 값에 다음과 같은 값이 덧붙음 - isUpper이 참이면 소문자, 거짓이면 대문자
			answer = isUpper ? answer + (x+"").toLowerCase() : answer + (x+"").toUpperCase();
		} // for
		
		return answer;
	} // solution()
	
	public static void main(String[] args) {
		// Main 객체 생성 (solution()을 호출하기 위해)
		Main M = new Main();
		
		// 입력
		Scanner in = new Scanner(System.in);
		String str = in.next();
		
		// 출력
		System.out.println(M.solution(str));
	} // main()
} // Main
