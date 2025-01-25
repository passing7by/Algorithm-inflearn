package problem07;

import java.util.Scanner;

// 1. 문자의 개수가 입력됨
// 2. 재점 결과가 한 행에 공백을 사이에 두고 입력됨
// 3. 가산점을 고려한 총점을 출력
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] scores = new int[num];
		for (int i = 0; i < num; i++) {
			scores[i] = sc.nextInt();
		}
		
		// 로직
		// scores 배열을 돌면서, tmpScore를 Tscore에 더해나감
		// 단, score=0 > tmpScore=0 > tmpScore++
		// score=1 > tmpScore을 Tscore에 더함 > tmpScore++
		// 이때, tmpScore의 초기값은 scores[0]
		int tmpScore = scores[0];
		int TScore = 0;
		for (int score : scores) {
			if (score == 0) tmpScore = 0;
			if (score == 1) TScore += tmpScore;
			tmpScore++;
//			System.out.println("TScore : "+TScore);
		}
		System.out.println(TScore);
	}
}
