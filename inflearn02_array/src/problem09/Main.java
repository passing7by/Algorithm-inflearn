package problem09;

import java.util.Scanner;

// 1. 행(열)의 개수가 입력된다
// 2. 개수만큼 숫자가 한 행에 입력되고, 이것이 개수만큼 반복된다
// 3. 최대합을 출력한다
public class Main {
	public static void main(String[] args) {
		// 대각선의 합은 어떻게 구함..?
		// 개수 = 5일 때
		// [0] + [6] + [12] + [18] + [24] : 0~ 인덱스가 6씩 증가, 5번 더해짐
		// [4] + [8] + [12] + [16] + [20] : 4~ 인덱스가 4씩 증가, 5번 더해짐
		// 모든 행에 대한 합을 어떻게 구하지?
		// loop1 : i는 0부터 num씩 증가하여 i<arr.length인 한 반복
		// loop2 : j는 i부터 1씩 증가하여 j<j+num인 한 반복
		// loop1 : 합 저장
		// 모든 열에 대한 합은?
		// loop1 : i는 0부터 1씩 증가하여 i<num인 한 반복
		// loop2 : j는 i부터 num씩 증가하여 j<arr.length인 한 반복
		// loop1 : 합 저장
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] arr = new int[num*num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		// 로직
		int[] sums = new int[num*2+2];
		int sumCnt = 0;
		
		// 각 행의 합
		for (int i = 0; i < arr.length; i+=num)  {
			for (int j = i; j < i+num; j++) {
				sums[sumCnt] += arr[j];
			}
			sumCnt++;
		}
		
		// 각 열의 합
		for (int i = 0; i < num; i++) {
			for (int j = i; j < arr.length; j+=num) {
				sums[sumCnt] += arr[j];
			}
			sumCnt++;
		}
		
		// 대각선1의 합
		for (int i = 0; i < arr.length; i+=num+1) {
			sums[sumCnt] += arr[i];
		}
		sumCnt++;
		
		// 대각선2의 합
		for (int i = num-1; i < arr.length-1; i+=num-1) {
			sums[sumCnt] += arr[i];
		}
		sumCnt++;

		// 합 로직 확인
//		for (int i : sums) {
//			System.out.println(i);
//		}
//		
//		System.out.println();
		
		int max = 0;
		for (int i = 0; i < sums.length; i++) {
			if (sums[i]>max) max = sums[i];
		}
		System.out.println(max);
	}
}
