package problem04;

import java.util.ArrayList;
import java.util.Scanner;

public class Answer {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		
		// StringBuilder를 사용하는 방법
		/*
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			// String : 변경될 시, 새로운 객체가 생성됨
			// StringBuilder : 변경될 시, 기존에 생성했던 객체가 변함
			answer.add(tmp);
		}
		*/
		
		// StringBuilder를 사용하지 않는 방법
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt = 0, rt = x.length()-1; // lt = left, rt = right
			while(lt < rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s); // valueOf() : static 메서드라 [클래스.]으로 접근함
			answer.add(tmp);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Answer A = new Answer();
		
		// 입력
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		for(int i=0; i<n; i++) {
			str[i] = kb.next();
		}
		
		// 출력
		for(String x : A.solution(n, str)) {
			System.out.println(x);
		}
	}
}
