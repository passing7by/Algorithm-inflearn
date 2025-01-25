package problem06;

import java.util.ArrayList;
import java.util.Scanner;

public class Answer {
	public boolean isPrime(int num) {
		if (num == 1) return false;
		for (int i = 2; i < num; i++) {
			if (num%i == 0) return false;
		}
		return true;
	}
	
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			int tmp = arr[i];
			// 
			int res = 0;
			while(tmp > 0) {
				int t = tmp%10;
				res = res*10+t;
				tmp = tmp/10;
			}
			if (isPrime(res)) answer.add(res);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Answer A = new Answer();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); // 자연수의 개수를 입력받음
		int[] arr = new int[n];
		// n만큼의 자연수를 입력받음
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for (int x : A.solution(n, arr)) {
			System.out.print(x+" ");
		}

	}
}
