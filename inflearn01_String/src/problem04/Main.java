package problem04;

import java.util.Scanner;

public class Main {
	// 1. 단어의 갯수가 입력됨 (범위 : 3 ~20)
	// 2. 한 줄에 한 단어씩 입력됨
	// 3. 출력 : 한 줄에 한 단어씩 뒤집어 출력
	
	public String solution(String str) {
		String answer = "";
		
		//로직
		for (int i = str.length()-1; i >= 0; i--) {
			answer +=str.charAt(i);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main M = new Main();
		
		//입력
		Scanner in = new Scanner(System.in);
		/*
		for (int i = 0; i < in.nextInt(); i++) {
			System.out.println("i : " + i);
			System.out.println(M.solution(in.next()));
			System.out.println("솔루션 실행 완료");
		}
		System.out.println("for문 빠져나옴");
		*/
		
		int num = in.nextInt();
		
		for (int i = 0; i < num; i++) {
//			System.out.println("i : " + i);
			System.out.println(M.solution(in.next()));
//			System.out.println("솔루션 실행 완료");
		}
//		System.out.println("for문 빠져나옴");
	}
}
