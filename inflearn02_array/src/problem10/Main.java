package problem10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 입력받아보자
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int nNum = num+2;
		int[] arr = new int[nNum*nNum];
		
		int cnt = 2;
		for (int i = nNum+1; i < arr.length-nNum; i++) { // 두번째 줄 두번째 칸~ 마지막에서 두번째 줄 오른쪽에서 첫번째칸보다 작은 한, 1씩 증가
			if(i == nNum*cnt-1) arr[i] = 0;
			else if(i == nNum*cnt) {
//				System.err.println(cnt+"번째 행 6번째, 7번째 칸 건너뜀");
				arr[i] = 0;
				cnt++;
//				System.out.println(cnt+"번째 행 시작");
			}
			else arr[i] = in.nextInt();
//			System.out.println("i : "+i);
		}
		
		// 입력받은 값 출력
//		for (int i : arr) {
//			System.out.println(i);
//		}
		
		// 봉우리 체크 로직
		int peekCnt = 0;
		for (int i = nNum+1; i < arr.length-nNum; i++) {
			if (arr[i]>arr[i-1] && arr[i]>arr[i+1] && arr[i]>arr[i-nNum] && arr[i]>arr[i+nNum]) {
				peekCnt++;
			}
		}
		
		System.out.println(peekCnt);
	}
}
