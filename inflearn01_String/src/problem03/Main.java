package problem03;

import java.util.Scanner;

public class Main {
	// 1. 한 개의 문장이 입력됨 (길이 : 0? ~100)
	// 2. 가장 긴 단어 출력. 단, 긴 단어가 여러개일 경우 가장 앞에 위치한 단어 출력
	/*
	 문장 앞뒤의 공백 제거
	 공백을 기준으로 문장을 배열로 만듦
	 배열 안에 있는 단어들의 길이를 확인한 후,
	 기존의 길이의 최댓값보다 크면 최댓값과 최댓값에 해당하는 단어 갱신
	 최댓값에 해당하는 단어 반환
	 */
	
	public String solution(String str) {
		// 단어 길이 최댓값을 저장하는 변수
		int max = 0;
		// 최댓값에 해당하는 단어를 저장하는 변수
		String answer = "";
		
		// 문장 앞뒤의 공백 제거
		// 공백을 기준으로 문장을 배열로 전환
		// 배열을 돌며 단어 길이 확인
		for (String x : str.trim().split(" ")) {
			if (x.length() > max) {
				max = x.length();
				answer = x;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// solution() 호출 위해 Main 객체 생성
		Main M = new Main();
		
		// 입력
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		// 출력
		System.out.println(M.solution(str));
	}
}
