package problem02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public int solution(List<Integer> heights) {
		int cnt = 1; // 맨 앞의 학생은 무조건 보임
		
		int max = heights.get(0); // 앞에 큰 학생이 있을수록 뒤에는 그 학생의 키보다 크지 않으면 안보임
		for (int i = 1; i < heights.size(); i++) {
			if (heights.get(i) > max) {
				cnt++;
				max = heights.get(i);
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		List<Integer> heights = new ArrayList<>();
		
		while (num>0) {
			heights.add(in.nextInt());
			num--;
		}
		
		System.out.println(m.solution(heights));
	}
}
