package problem08;

import java.util.Scanner;

public class Main {
	// 1. 문자열이 입력됨 (0? ~100)
	// 2. 출력 : 팰린드롬이면 YES, 아니면 NO
	// 팰린드롬인지 아닌지는 알파벳으로만 판단
	
	public String solution(String str) {
		String answer = "YES";
		
		char[] tmp = str.toUpperCase().toCharArray();
		
		int lt = 0, rt = tmp.length-1;
		
		while (lt < rt) {
			if (!Character.isAlphabetic(tmp[lt])) lt++;
			else if (!Character.isAlphabetic(tmp[rt])) rt--;
			else if (tmp[lt] != tmp[rt]) {
				answer = "NO";
				break;
			}
			else {
				lt++;
				rt--;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		Scanner in = new Scanner(System.in);
		System.out.println(m.solution(in.nextLine()));
	}
}
