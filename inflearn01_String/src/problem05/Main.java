package problem05;

import java.util.Scanner;

public class Main {
	// 1. 문자열이 입력됨 (특문 + 영어, 범위 : 0? ~100)
	// 2. 출력 : 특수문자는 제자리에 그대로 있고, 영어만 순서를 반대로 하여
	
	public String solution(String str) {
		String answer = "";
		
		char[] array = str.toCharArray(); // 입력받은 문자열을 문자 배열로 변환
		String[] newArray = new String[array.length]; // array와 같은 길이를 가지는 문자열 배열 생성 : answer이 될 것임
		String[] numArray = new String[array.length]; // array와 같은 길이를 가지는 문자열 배열 생성 : 알파벳이 있는 인덱스를 저장
		
		int numArrayIdx = 0;
		
		for (int i = 0; i < array.length; i++) {
			// 단어 배열에서 특문이 있으면, 특문의 인덱스를 기억했다가, 새로 만든 문자 배열의 해당 인덱스에 해당 특문을 삽입한다
			if (!(Character.isUpperCase(array[i]) || Character.isLowerCase(array[i]))) newArray[i] = array[i]+"";
			else {
				numArray[numArrayIdx] = i+"";
				numArrayIdx++;
			}
		}
		
		for (String x : numArray) {
			if (x != null) {
				for (int i = newArray.length-1; i >=0 ; i--) {
					if (newArray[i] != null) continue;
					newArray[i] = array[Integer.parseInt(x)]+"";
					break;
				}
			}
		}
		
		// 문자열 배열을 String 형태로 변환
		for (String x : newArray) {
			answer += x;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {		
		// 특수문자인지 아닌지 어떻게 검증함?
		// 대문자 소문자 둘 다 아니면 특수문자?
		/*
		char ch1 = 'i';
		char ch2 = '*';
		System.out.println("ch1 : " + (Character.isUpperCase(ch1) || Character.isLowerCase(ch1)));
		System.out.println("ch2 : " + (Character.isUpperCase(ch2) || Character.isLowerCase(ch2)));
		*/
		
		// 특정 문자만 제자리에 있게 하고 다른 문자들은 순서를 반대로..? 어떻게..?
		/*
		 단어를 문자 배열로 바꾼다
		 단어 길이만큼의 문자 배열을 만든다
		 단어 배열에서 특문이 있으면, 특문의 인덱스를 기억했다가, 새로 만든 문자 배열의 해당 인덱스에 해당 특문을 삽입한다
		 단어 배열에서 특문이 아니면, 순서를 바꿔 삽입한다
		 	즉, 문자 배열의 해당 인덱스의 값이 null인 한 문자를 삽입한다 
		 */
		
		// 로직 테스트
		/*
		String str = "a#b!GE*T@S"; // 입력받은 문자열
		char[] array = str.toCharArray(); // 문자열을 문자 배열로 변환
		char[] newArray = new char[str.length()];
		
		for (int i = 0; i < array.length; i++) {
			// 단어 배열에서 특문이 있으면, 특문의 인덱스를 기억했다가, 새로 만든 문자 배열의 해당 인덱스에 해당 특문을 삽입한다
			if (!(Character.isUpperCase(array[i]) || Character.isLowerCase(array[i]))) newArray[i] = array[i];
			// 단어 배열에서 특문이 아니면, 순서를 바꿔 삽입한다
			// 원래의 인덱스가 0 => 반대순서 인덱스는 단어길이-1
			// 원래의 인덱스가 1 => 반대순서 인덱스는 단어길이-2
			else newArray[array.length-1-i] = array[i];
		}
		
		System.out.println(newArray);
		*/
		
		// Main 객체 생성
		Main m = new Main();
		
		// 입력과 출력
		Scanner in = new Scanner(System.in);
		
		System.out.println(m.solution(in.next()));
	}
}
