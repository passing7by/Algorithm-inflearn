package problem06;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	// 1. 문자열이 입력됨 (범위 : 0? ~100)
	// 2. 중복문자를 제거하고 출력
	public String solution(String str) {
		String answer = "";
		
		Set<Character> set = new LinkedHashSet<>();
		
		for (char x : str.toCharArray()) set.add(x);
		
		for (Character x : set) answer += x;
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		
		// 입력 및 출력
		Scanner in = new Scanner(System.in);
		
		System.out.println(m.solution(in.next()));
	}
}
