package problem10;

import java.util.Scanner;

public class Answer {
	public int[] solution(String str, char c) {
		int[] answer= new int[str.length()];
		int p = 1000;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == c) p=0; // int 배열의 기본값은 0이므로, 굳이 배열에 0 값을 넣을 필요 없이 p값만 초기화
			else {
				p++;
				answer[i]=p;
			}
		}
		
//		p=1000; // 다시 초기화해줄 필요 없음
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i) == c) p=0;
			else {
				p++;
				answer[i]=Math.min(answer[i], p); // 기존값과 p값 중에서 작은 값을 배열의 값으로 초기화
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Answer A = new Answer();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		for(int x : A.solution(str, c)) {
			System.out.print(x + " ");
		}
	}
}
