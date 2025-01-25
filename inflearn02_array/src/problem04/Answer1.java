package problem04;

import java.util.Scanner;

public class Answer1 {
	public int[] solution(int n) {
		int[] answer=new int[n]; // n 크기의 배열 선언 및 생성
		// 1 두 개는 항상 출력됨 : 맨 처음 1, 그 다음은 1+0=1
		answer[0]=1;
		answer[1]=1;
		// 세 번째로 출력되는 숫자부터 계산 시작
		/*
		 궅이 왜?
		 i=0부터 시작하면 arr[0]는 앞의 두 수의 합(arr[-1] + arr[-2])이여야 하는데,
		 배열의 index 범위를 벗어남
		 이럴 경우, arr[0]과 arr[1]에는 출력하지 않을 숫자를 넣어 두고 arr[2]부터 출력할 값을 저장하는 방법 사용 가능
		 하지만 이 문제에서, 어차피 맨 앞의 두 수는 값이 고정이니 i=2부터 시작하면 됨 
		 */
		for(int i=2; i<n; i++) answer[i]=answer[i-2]+answer[i-1];
		
		return answer;
	}
	
	public static void main(String[] args) {
		Answer1 A = new Answer1();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt(); // 출력할 숫자의 갯수를 입력받음
		for(int x :A.solution(n)) System.out.println(x+" ");
	}
}
