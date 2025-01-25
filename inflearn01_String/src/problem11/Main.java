package problem11;

import java.util.Scanner;

public class Main {
	// 1. 문자열이 입력됨
	// 2. 같은 문자열이 연속으로 반복되는 경우, [문자+반복순서]의 형태로 출력
	
	// 힌트 : i와 i+1이 같을 때와 같지 않을 때 처리를 다르게 해 줌
	// 같으면 cnt++, 같지 않으면 i의 값+cnt를 answer에 저장
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		
		String answer = "";
		
		int cnt = 1;
		
		for (int i = 0; i < str.length()-1; i++) {
			if (str.charAt(i) == str.charAt(i+1)) {
				if (i <= str.length()-3) cnt++;
				else answer += str.charAt(i) + "" + ++cnt;
			}
			else {
				if (cnt == 1) answer += str.charAt(i);
				else {
					if (i <= str.length()-3) {
						answer += str.charAt(i) + "" + cnt;
						cnt = 1;
					}
					else answer += str.charAt(i) + "" + ++cnt + str.charAt(i+1);
				}
			}
		} //for
		
		System.out.println(answer);
	}
}
