package problem01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 1. 한 개의 문자열을 입력받음 (길이 : 0? ~ 100)
		// 2. 특정 문자를 입력받음
		// 3. 출력 : 해당 문자가 입력받은 문자열에 몇 개 존재하는지
		// 대소문자를 구분하지 않음
		
		// 입력
		Scanner in = new Scanner(System.in);
		String UpperStr = in.next().toUpperCase();
		String UpperCh = in.next().toUpperCase();
		
		// 로직
		int cnt = 0;
		for (char strToCh : UpperStr.toCharArray()) {
			if (strToCh == UpperCh.charAt(0)) {
				cnt++;
			}
		} // for
		
		// 출력
		System.out.println(cnt);
	}
}