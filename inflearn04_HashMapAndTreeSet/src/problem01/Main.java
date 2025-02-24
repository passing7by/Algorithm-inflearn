package problem01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 1. 학생 수가 입력됨(범위 : 5~50)
 * 2. 학생 수만큼의 길이를 가지는 알파벳(A/B/C/D/E) 문자열이 입력됨
 * 3. 가장 많이 나온 알파벳을 출력함
 */
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String result = sc.next();
		
		char[] resultArr = result.toCharArray();
//		System.out.println(resultArr.length);
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 65; i <= 69; i++) {
			map.put((char)i, 0);
		}
		
		for (char c : resultArr) {
			// switch 문의 case 블록은 break 문이 없으면 일치한 case 이후의 모든 코드가 실행되므로 주의
			switch (c) {
				case 'A': {
					int val = map.get('A');
					val++;
					map.put('A', val);
					break;
				}
				case 'B': {
					int val = map.get('B');
					val++;
					map.put('B', val);
					break;
				}
				case 'C': {
					int val = map.get('C');
					val++;
					map.put('C', val);
					break;
				}
				case 'D': {
					int val = map.get('D');
					val++;
					map.put('D', val);
					break;
				}
				case 'E': {
					int val = map.get('E');
					val++;
					map.put('E', val);
					break;
				}
			}
		}
		
		int max = 0;
		char student = 0;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			
			if (val > max) {
				max = val;
				student = key;
			}
			
//			System.out.println(key+" "+val);
		}
		
		// 결과 출력
		System.out.println(student);
	}
}
