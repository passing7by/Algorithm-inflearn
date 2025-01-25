package problem05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	// 1. 자연수가 입력됨 (범위 : 2 ~200,000)
	// 2. 소수의 개수 출력
	// 소수란? 자연수 1을 제외하고, 약수가 1과 그 자신밖에 없는 수
	// 약수가 1과 그 자신밖에 없다는 걸 어떻게 알지?
	/*
	 앞의 수들(1제외)로 나눴을 때, 몫이 1 이상이면 소수가 아님
	 그렇다면 이중반복문을 돌려야겠네?
	 왜?
	 5라는 자연수가 입력되면
	 1~5를 배열에 저장하고
	 (잠깐, 1을 저장할 필요가 있나? 어차피 소수가 아니고 나눌 수도 아닌데)
	 2~5를 배열에 저장하고
	 반복문1) 반복문 안에서 2~5까지 이동
	 반복문2) i 값 당 아래를 반복 :
	 0~i-1 값 모두로 나눠서 나머지가 0이면, 바로 반복문 2를 나감
	 위에 해당되지 않으면 반목문2 모두 반복 후, cnt++;
	 */
	
	// 내가 작성한 로직 -> 작동하지만, time out
	/*
	public static void main(String[] args) {
		// 자연수의 개수 입력
//		int num = 20;
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		// 로직
		List<Integer> numList = new ArrayList<>();
		for (int i = 1; i <= num; i++) numList.add(i); // 자연수를 list에 저장 (size : num)
//		System.out.println(numList.size());
		int cnt = 0; // 소수의 갯수
		for (int i = 1; i < numList.size(); i++) { // 인덱스 1(값 : 2)부터 탐색 시작
//			System.out.println("get(i) : "+numList.get(i));
			boolean isDecimal = true;
			for (int j = 1; j <= i-1; j++) {
//				System.out.println("get(j) : "+numList.get(j));
				if (numList.get(i)%numList.get(j) == 0) {
					isDecimal = false;
					break;
				}
			}
//			if (isDecimal) System.out.println(numList.get(i));
			if (isDecimal) cnt++;
		}
		
		// 소수의 갯수 출력
		System.out.println(cnt);
	}
	*/
	
	// 에라토스테네스의 체 알고리즘 사용
	/*
	 에라토스테네스의 체
	 수학자 에라토스테네스가 개발한 소수 판별 알고리즘
	 2부터 n까지의 범위에서 소수를 구할 때 반복적으로 배수를 제거하여 소수만 남김
	 핵심 아이디어 : 소수의 배수는 모두 소수가 아니다
	 */
	public static void main(String[] args) {
		// 1. 자연수의 범위 입력
		int num = 20; // 입력받은 자연수의 범위를 20이라고 가정
		
		// 2. 소수인지 검증할 자연수들을 인덱스로 가지는 boolean 배열 생성
		boolean[] isPrime = new boolean[num+1];
		// 왜 배열의 크기를 num 대신 num+1으로 설정했는가?
		// num으로 설정 시 인덱스의 범위 : 0 ~19
		// num+1으로 설정 시 인덱스의 범위 : 0 ~20
		// => '인덱스 값 = 소수인지 검증할 값' 으로 로직을 구현할 수 있어 효율적 
		for (int i = 2; i <= num; i++) isPrime[i] = true;
		// 모든 숫자를 소수라고 가정
		
		// 3. 에라토스테네스의 체 적용
		for (int i = 2; i*i <= num; i++) {
		// 이 때, <나 <=나 결과는 같으나 로직의 명확성과 일관성을 위해 <=를 사용하는 것이 좋음
			if (isPrime[i]) {
			// 소수라면 (인덱스 순서가 오지 않은 수 or 에라토스테네스의 체에 걸리지 않은 수)
			// 아래의 코드를 실행
				for (int j = i*i; j <= num; j += i) isPrime[j] = false;
				// i의 배수부터 시작
				// 실행문을 한 번 거칠 때마다 i씩 증가
				// num보다 작거나 같을 때까지만 실행
			}
		}
		
		// 4. 소수의 개수 구하기
		int cnt = 0;
		for (int i = 2; i <= num; i++) {
			if (isPrime[i]) cnt++;
		}
		
		// 5. 소수의 갯수 출력
		System.out.println(cnt);
	}
}
