package problem01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public void solution(int i, int pre) {
		if (i > pre) System.out.print(i + " ");
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		
		Scanner in = new Scanner(System.in);
		
		int caseNum = in.nextInt();
		List<Integer> nums = new ArrayList<>();
		
		while (caseNum > 0) {
			nums.add(in.nextInt());
			caseNum--;
		}
		
		for (int i = 0; i < nums.size(); i++) {
			if (i == 0) System.out.print(nums.get(i) + " ");
			else m.solution(nums.get(i), nums.get(i-1));
		}
	}
}
