package problem06;

import java.util.Scanner;

public class Answer {
	public String solution(String str) {
		String answer = "";
		for(int i=0; i<str.length(); i++) {
//			System.out.println(str.charAt(i)+" "+i+str.indexOf(str.charAt(i)));
			if(i == str.indexOf(str.charAt(i))) answer += str.charAt(i);
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
