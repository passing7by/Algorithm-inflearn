package problem02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 1. 집합 A의 크기가 입력됨(1~30,000)
 * 2. N개의 원소가 입력됨(원소는 중복되지 않음)
 * 3. 집합 B의 크기가 입력됨(1~30,000)
 * 4. M개의 원소가 입력됨(원소는 중복되지 않음)
 * 원소는 1,000,000,000 이하의 자연수 => int 타입 써라
 * 출력 : 두 집합의 공통 원소를 오름차순 정렬하여 출력
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력
		int n = sc.nextInt();
		int[] arrN = new int[n];
		for (int i = 0; i < n; i++) {
			arrN[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] arrM = new int[m];
		for (int i = 0; i < m; i++) {
			arrM[i] = sc.nextInt();
		}
		// 로직
		/*
		 * 이중for문 가능?
		 * 연산횟수가 최대 900,000,000가 되는데..
		 * 연산횟수를 줄이기 위해 이진탐색으로
		 */
		Arrays.sort(arrN);
		Arrays.sort(arrM);
		// 확인
//		for (int i : arrN) {
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		for (int i : arrM) {
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		System.out.println();
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) { // arrN
			int left = 0, right = m-1;
			while (left <= right) { // arrM
				int mid = left+(right-left)/2;
				int target = arrN[i];
//				System.out.print(i+": "+target+", "+mid+": "+arrM[mid]);
//				System.out.println();
				if (target == arrM[mid]) {
					list.add(arrM[mid]);
					break;
				}
				else if (target > arrM[mid]) left = mid+1;
				else right = mid-1;
			}
		}
		// 확인
//		System.out.println(list);
		Collections.sort(list);
		
		// 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
	}
}
