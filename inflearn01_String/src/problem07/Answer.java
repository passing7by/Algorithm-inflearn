package problem07;

import java.util.Scanner;

public class Answer {
	public String solution(String str) {
		// 방법1
		/*
		String answer = "YES";

		str = str.toUpperCase();
		int len = str.length();
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i) != str.charAt(len-i-1)) return "NO";
		}
		*/
		
		// 방법2
		String answer = "NO";
		
		String tmp = new StringBuilder(str).reverse().toString();
//		if(str.equals(tmp)) answer = "YES";
		//equals() -> 대소문자를 구분함
		if(str.equalsIgnoreCase(tmp)) answer = "YES";
		//equalsIgnoreCase() -> 대소문자를 구분하지 않음

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
