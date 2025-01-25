package problem08;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 1. 점수의 개수가 입력됨
// 2. 한 행에 점수가 입력됨
// 3. 각 점수의 등수를 출력 (점수가 입력된 순서대로)
// 같은 점수가 여러개인 경우, 동일하게 높은 등수로 출력


public class Main {
	public static void main(String[] args) {
		// 같은 점수가 여러개일 때의 처리를 어떻게 해야 할까?
		// 50 50 40 > 1 1 3
		// 40 40 50 > 2 2 1
		// 점수가 높은 순으로 정렬
		// 등수 변수인 rank의 초기값은 1
		// rank를 출력 > preScore에 현재 점수 저장
		// preScore == score 이면 rank 출력
		// 아니면 rank++ > rank 출력 > preScore에 현대 점수 저장
		
		// 이 방법은 입력 순으로 출력할 수 없고, 그렇게 수정한다고 하더라도 매우 복잡해질 것 같음
		/* 
		int num = 5;
		Integer[] scores = {87, 89, 92, 100, 76};
		Arrays.copyOf(scores, 5);
		// Collections.reverseOrder() : int와 같은 Primitive Type의 경우 사용이 안됨
		System.out.println("--- 내림차순 정렬 결과 ---");
		for (int x : scores) {
			System.out.println(x);
		}
		int rank = 1;
		int preScore = scores[0];
		System.out.println("--- 등수 출력 ---");
		for (int i = 0; i < num; i++) {
			if (preScore != scores[i]) {
				rank++;
				preScore = scores[i];
			}
			System.out.println(rank);
		}
		*/
		
		// 이중for문 써야되나?
		// loop1 : scores[]
		// loop2 : scores[]를 돌면서, scores[i]보다 크면 rank++
		// 이때, rank의 초기값 = 1
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] scores = new int[num];
		for (int i = 0; i < num; i++) {
			scores[i] = in.nextInt();
		}
		
		// 로직
		for (int i : scores) {
			int rank = 1;
			for (int j : scores) {
				if (j > i) rank++;
			}
			System.out.print(rank+" ");
		}
	}
}
