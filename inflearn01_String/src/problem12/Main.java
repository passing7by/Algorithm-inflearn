package problem12;

import java.util.Scanner;

public class Main {
	public String unlockPwd(String pwd) {
		// 문자열>이진수
		String binary = "";
		for (char x : pwd.toCharArray()) {
			if (x == '#') binary += 1;
			if (x == '*') binary += 0;
		}
//		System.err.println("이진수로 변환한 결과 : " + binary);
		
		// 이진수>십진수>아스키문자
		int start = 0, end = 7;
		
		String unlocked = "";
		
		while(end<=binary.length()) {
//			System.err.println("7자리씩 자름 : " + binary.substring(start, end));
//			System.err.println("문자로 변환 : " + (char)Integer.parseInt(binary.substring(start, end), 2));
			unlocked += (char)Integer.parseInt(binary.substring(start, end), 2);
			start += 7;
			end += 7;
		}
		return unlocked;
	}
	
	public static void main(String[] args) {
		// 1. 정수가 입력됨 (범위 : 0 ~10)
		// 2. 정수*7 만큼의 길이를 가지는 문자열이 입력됨
		// # 혹은 *로만 이루어져 있음
		// 3. 출력 : 문자열>2진수>아스키문자화 한 문자들로 이루어진 문자열
		
		// 2진수를 10진수로...?
		int test = Integer.parseInt("1000001", 2);
//		System.out.println(test);
		
		// 숫자를 아스키문자화
		char test2 = (char)test;
//		System.out.println(test2);
		
		Main m = new Main();
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		System.out.println(m.unlockPwd(in.next()));
	}
}
