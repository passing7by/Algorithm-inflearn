package problem06;

import java.util.Scanner;

// 32를 뒤집으로 23.... 어떻게 뒤집지?
// 문자열로 뒤집는건 많이 해봤는데..StringBuilder 사용해서
public class Main {
	public static void main(String[] args) {
		// 1. 자연수의 갯수가 입력됨
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		// 2. 자연수들이 입력됨
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = in.nextInt();
		}
		
		
		// 3. 자연수를 뒤집음
		int[] reverse = new int[num];
//		System.out.println("--- 뒤집은 자연수들 ---");
		for (int i=0; i<reverse.length; i++) {
			StringBuilder sb = new StringBuilder();
			int revesed = Integer.parseInt(sb.append(arr[i]).reverse().toString());
			reverse[i] = revesed;
//			System.out.println(revesed);
		}
		// 4. 소수인지 검증
		// 뒤집은 자연수의 최댓값을 구함
		int max = 0;
		for (int x : reverse) if(x > max) max = x;
//		System.out.println("max : "+max);
		
		// 최댓값+1의 크기를 가지는 배열 생성
		boolean[] isPrime = new boolean[max+1];
		// 배열의 초기값을 true로 설정
		for (int i = 2; i <= max; i++) {
			isPrime[i] = true;
		}
//		System.out.println("--- isPrime[] 초기값들 ---");
//		for (boolean x : isPrime) {
//			System.out.println(x);
//		}
		// 에라토스테네스의 체
		for (int i = 2; i*i <= max; i++) {
			if (isPrime[i]) {
				for (int j = i*i; j <= max; j += i) {
					isPrime[j] = false;
				}
			}
		}
		
		// 5. 소수인 것만 출력
		// isPrime이 true이고, revese[]에 존재하면 출력
		for (int i = 0; i < reverse.length; i++) {
			for (int j = 2; j <= max; j++) {
				if (isPrime[j] && j == reverse[i]) System.out.print(j+" ");;
			}
		}
	}
}
