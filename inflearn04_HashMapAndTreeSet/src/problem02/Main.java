package problem02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 문자열을 char[]로 바꾸고,
 * char[]의 원소값을 map의 key값으로 주입 / 이때, key는 중복이 제거되어 주입됨
 * 이중 for문 돌아야겠네:
 * for map.keySet -i
 * 	for char[] { -j
 * 	만약 i==j라면
 * 	i라는 key의 val을 가져와서 ++ 한 다음에
 * 	map.put(i, val) 함
 * }
 * ----> 이걸 str1, str2 모두 진행
 * 검증1) keySet 비교...아니면 NO 리턴
 * 검증2) 반복문을 돌며 map1의 값과 map2의 값이 같은지 비교...아니면 NO 리턴
 * YES 리턴
 * 굳이 정렬 안 해도 map끼리 비교하면 됨
 */

public class Main {
	public Map<Character, Integer> strToMap(String str) {
		char[] arr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char c : arr) map.put(c, 0);
		
		for (char mapC : map.keySet()) {
			for (char arrC : arr) {
				if (mapC == arrC) {
					int val = map.get(mapC);
					map.put(mapC, ++val);
				}
			}
		}
		
		return map;
	}
	
	public String isAnagram(String str1, String str2, Main m) {
		Map<Character, Integer> map1 = m.strToMap(str1);
		Map<Character, Integer> map2 = m.strToMap(str2);
		
//		System.err.println(map1);
//		System.err.println(map2);
		
		// 검증
		if(!map1.equals(map2)) return "NO";
		
		return "YES";
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();

		// 로직 및 출력
		System.out.println(m.isAnagram(str1, str2, m));
	}
}
