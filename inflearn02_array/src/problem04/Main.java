package problem04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public void solution(int num) {
		List<Integer> list = new ArrayList<Integer>();
		int pre = 0;
		int i = 1;
		list.add(i); // 1 저장
		int cnt = 0;
		while (num>1) {
			list.add(list.get(cnt)+pre);
			pre = list.get(cnt);
			cnt++;
			num--;
		}
		
		for (Integer x : list) {
			System.out.print(x+" ");
		}
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		Scanner in = new Scanner(System.in);
		m.solution(in.nextInt());
	}
}
