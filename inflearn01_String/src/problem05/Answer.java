package problem05;

import java.util.Scanner;

public class Answer {
	public String solution(String str) {
		String answer = "";
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length()-1;
		while(lt < rt){
			if(!Character.isAlphabetic(s[lt])) lt++; // 알파벳이 아니면 lt 증가
			else if(!Character.isAlphabetic(s[rt])) rt--; // 알파벳이 아니면 rt 감소
			else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = s[rt];
				lt++;
				rt--;
			}
		}
		// String.valueOf() 로 char[]를 String 으로 변환
		answer = String.valueOf(s);
		
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
