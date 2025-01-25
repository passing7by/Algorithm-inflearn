package problem09;

import java.util.Scanner;

public class Answer {
	public int solution(String str) {
		// 아스키코드 이용
		/*
		int answer = 0;
		
		for(char x : str.toCharArray()) {
			if(x>=48 && x<=57) answer = answer*10 + (x-48);
		}
		
		return answer;
		*/
		
		// 메서드 이용
		String answer = "";
		
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) answer += x;
		}
		
		return Integer.parseInt(answer);
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
