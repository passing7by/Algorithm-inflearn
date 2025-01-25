package problem03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public char solution(int a, int b) {
		switch (a-b){
		case 0: return 'D';
		case -1: return 'B';
		case -2: return 'A';
		case 1: return 'A';
		case 2: return 'B';
		}
		
		return 0;
	}
	public static void main(String[] args) {
		// 가위 1 | 바위 2 | 보 3
		/*
		 a b
		 1 1 >비김
		 1 2 >b -1
		 1 3 >a -2
		 2 2
		 2 1 >a 1
		 2 3 >b -1
		 3 3
		 3 1 >b 2
		 3 2 >a 1
		 */
		Main m = new Main();
		
		// 입력
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		List<Integer> aList = new ArrayList<Integer>();
		List<Integer> bList = new ArrayList<Integer>();
		
		for (int i = 0; i < num; i++) aList.add(in.nextInt());
		for (int i = 0; i < num; i++) bList.add(in.nextInt());

		// 로직
		for (int i = 0; i <num; i++) System.out.println(m.solution(aList.get(i), bList.get(i)));
	}
}
