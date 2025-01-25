package problem03;

import java.util.Scanner;

public class Answer {
	public String solution(String str) {
		String answer = "";
		
		// split() 사용
		/*
		int m = Integer.MIN_VALUE; //MIN_VALUE¿¿

		String[] s = str.split(" ");
		for(String x : s) {
			int len = x.length();
			if(len > m) {
				m = len;
				answer = x;
			}
		}
		*/
		
		// substring() 사용
		int m = Integer.MIN_VALUE, pos;
		// int 형 변수 m 선언 & 초기화, 변수 pos 선언
		// Integer.MIN_VALUE : java에서 정수형(int)으로 표현할 수 있는 가장 작은 값 (-2147483648)
		
		while((pos = str.indexOf(' ')) != -1) { // 띄어쓰기가 발견되는 한 실행문을 반복
		// 변수 pos 초기화
		// indexOf(' ')
		// 띄어쓰기의 위치를 리턴
		// 띄어쓰기를 발견하지 못하면 -1을 리턴함
			String tmp = str.substring(0, pos); // 0부터 pos 전까지 자름
			int len = tmp.length();
			if(len > m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos+1); // pos+1의 앞부분은 자르고, pos+1부터 끝까지 남김
		} // while
		
		// while문에서 빠져나오면 마지막으로 남은 단어를 검증하는 로직 추가
		if(str.length() > m) answer = str;
		// 앞의 단어와 공백들을 자르다 보면, 마지막에는 단어만 남음(띄어쓰기 없음)
		// 따라서, while문을 빠져나오고, 마지막 단어는 while문의 실행문에 의한 검증에서 제외됨
		
		return answer;
	}
	
	public static void main(String[] args) {
		Answer A = new Answer();
		
		// 입력
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		
		// 출력
		System.out.println(A.solution(str));
	}
}
