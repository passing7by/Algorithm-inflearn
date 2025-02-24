package problem05;

import java.util.Scanner;

/*
 * 1. 양의 정수 n이 입력됨(범위 : 7~999)
 * 2. 2개 이상의 연속된 자연수의 합으로 정수 n을 표현할 수 있는 가짓수 출력
 * 로직 어떻게 짜지..
 * 1(lt)부터 1씩 증가된 수(rt)를 더해 나갈때마다 sum == n 검증
 * 더한 다음 sum == n 면 cnt++
 * 더한 다음 sum > n 이면 맨 앞에 더해진 수(lt)를 빼고 다시 검증.(sum > n 가 참인 한 계속 반복적으로)
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 7~999
		int tmpSum = 0, cnt = 0;
		int lt = 1;
		for (int rt = 1; rt <= (n/2)+1; rt++) {
			tmpSum += rt;
//			System.err.println(tmpSum);
			
			while(tmpSum > n) {
				tmpSum -= lt++;
//				System.err.println(tmpSum);
			}
			if (tmpSum == n) cnt++;
		}
		
		System.out.println(cnt);
	}
}
