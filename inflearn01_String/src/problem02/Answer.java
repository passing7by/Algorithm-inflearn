package problem02;

import java.util.Scanner;

public class Answer {
	public String solution(String str) {
		String answer = "";
		
		for(char x : str.toCharArray()) {
			/*
			if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
			else answer += Character.toLowerCase(x);
			*/
			
			// 아스키 코드 이용 (대문자 : 65 ~ 90, 소문자 : 97 ~ 122)
			// 즉, 소문자에서 32를 빼면 대문자가 됨
			if(x>=97 && x<=122) answer += (char)(x-32); // char는 비교연산자 사용시, 정수형으로 비교됨 | 만약 소문자면 
			else answer += (char)(x+32);
			// answer에 덧붙이기 전에 char로 형변환하지 않으면 정수가 덧붙여짐
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Answer A = new Answer();
		
		// 입력
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		// 출력
		System.out.println(A.solution(str));
	}
}
