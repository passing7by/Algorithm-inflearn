package problem08;

import java.util.Scanner;

public class Answer {
	public String solution(String str) {
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		// ^A-Z : 대문자 A부터 Z까지가 아니면 빈문자화 시켜버리라는 뜻의 정규식
//		System.out.println(str);
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) answer = "YES";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Answer A = new Answer();
		
		// 입력
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		
		// 출력
		System.out.println(A.solution(str));
	}
}
