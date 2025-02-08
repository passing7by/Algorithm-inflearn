package problem01;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 1. 첫 번째 배열의 크기가 입력됨 (1~100)
 * 2. 배열의 원소가 오름차순으로 입력됨
 * 3. 두 번째 배열의 크기가 입력됨
 * 4. 배열의 원소가 오름차순으로 입력됨
 * 각 리스트의 원소는 int형 변수의 크기를 넘지 않음 => int 타입 배열 써라
 * 출력 : 오름차순으로 정렬된 배열 출력
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력
		// 첫 번째 배열
		int n = sc.nextInt();
		int[] arrN = new int[n];
		for (int i = 0; i < n; i++) {
			arrN[i] = sc.nextInt();
		}
		// 두 번째 배열
		int m = sc.nextInt();
		int[] arrM = new int[m];
		for (int i = 0; i < m; i++) {
			arrM[i] = sc.nextInt();
		}
		
		// 로직
		/*
		 * 
		 */
		// 배열 생성
		int[] arrT = new int[n+m];
		// arrN의 값 넣기
		for (int i = 0; i < n; i++) {
			arrT[i] = arrN[i];
		}
		// arrM의 값 넣기
		for (int i = 0; i < m; i++) {
			arrT[i+n] = arrM[i];
		}
		// 확인
//		System.out.println(arrT.length);
//		for (int i = 0; i < arrT.length; i++) {
//			System.out.print(arrT[i]+" ");
//		}
		// 정렬
		Arrays.sort(arrT);
		
		// 출력
		for (int i = 0; i < arrT.length; i++) {
		System.out.print(arrT[i]+" ");
		}
	}
}
