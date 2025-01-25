package problem10;

import java.util.Scanner;

public class Main {
	// 1. 한 행에 문자열 2개가 입력됨
	// 문자열은 소문자로만 이루어짐
	// 범위 : 0? ~100
	// 2. 첫번째 문자열의 각 문자가 두번째 문자와 떨어진 거리를 순서대로 출력
	
	// 강의힌트 : 왼쪽부터 한 번 반복문, 오른쪽부터 한 번 반복문 해서 최소값을 거리로
	
	public String solution(String str, char c) {		
		String answer = "";
		
		int[] dtnts1 = new int[str.length()];
		int[] dtnts2 = new int[str.length()];
		
		// d1
		int d1 = str.length()-1; //거리의 최댓값
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) d1 = 0;
			else d1++;
			
			dtnts1[i] = d1;
		}
		
		// d2
		int d2 = str.length()-1;
		
		for (int i = str.length()-1; i >= 0 ; i--) {
			if(str.charAt(i) == c) d2 = 0;
			else d2++;
		
			dtnts2[i] = d2;
		}
		
		// d1과 d2중 작은 값을 거리로 선택
		int[] dtnts = new int[str.length()];

		for (int i = 0; i < str.length(); i++) {
			if(dtnts1[i] >= dtnts2[i]) dtnts[i] = dtnts2[i];
			if(dtnts1[i] < dtnts2[i]) dtnts[i] = dtnts1[i];
		}
		
		for (int x : dtnts) {
			answer += x+" ";
		}
		
		return answer.trim();
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		Scanner in = new Scanner(System.in);
		System.out.println(m.solution(in.next(), in.next().charAt(0)));
	}
}
