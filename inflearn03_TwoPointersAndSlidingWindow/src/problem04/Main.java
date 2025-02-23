package problem04;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// 입력
//		int n = 8;
//		int m = 6;
//		int[] arr = {1, 2, 1, 3, 1, 1, 1, 2};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//로직
		int cnt = 0;
		int p1 =0, p2 =0;
		int target = arr[p1];
		while(p1<n && p2<n) {
			if (target == m) {
				cnt++;
				p1++;
				p2 = p1;
				if (p2 < n) {
					target = arr[p2];
				}
			}
			else if(target < m) {
				p2++;
				if (p2 < n) {
					target += arr[p2];
				}
			}
			else {
				p1++;
				p2 = p1;
				if (p2 < n) {
					target = arr[p2];
				}
			}
//			System.err.println(target);
		}
		
		// 출력
		System.out.println(cnt);
	}
}
