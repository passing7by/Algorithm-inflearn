package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		List<String> list = new ArrayList<String>();
		
		// Set에 추가/삭제 시간 측정
		long startTime = 0;
		long endTime = 0;
		
		startTime = System.nanoTime(); // 코드 실행 전의 시간
		set.add("강아지");
		set.add("고양이");
		set.add("햄스터");
        endTime = System.nanoTime(); // 코드 실행 후의 시간
        System.out.println("set 추가 시간 (n/s) : "+(endTime-startTime));
        System.out.println("set : "+set);
        
        startTime = System.nanoTime(); // 코드 실행 전의 시간
		set.remove("강아지");
		set.remove("고양이");
		set.remove("햄스터");
		endTime = System.nanoTime(); // 코드 실행 후의 시간
        System.out.println("set 삭제 시간 (n/s) : "+(endTime-startTime));
        System.out.println("set : "+set);
        
        System.out.println();
        
		// List에 객체 추가/삭제 시 실행 시간 측정
        startTime = System.nanoTime(); // 코드 실행 전의 시간
		list.add("강아지");
		list.add("고양이");
		list.add("햄스터");
		endTime = System.nanoTime(); // 코드 실행 후의 시간
        System.out.println("list 추가 시간 (n/s) : "+(endTime-startTime));
        System.out.println("list : "+list);
        
        /*
        startTime = System.nanoTime(); // 코드 실행 전의 시간
		list.remove(2);
		list.remove(1);
		list.remove(0);
		endTime = System.nanoTime(); // 코드 실행 후의 시간
        System.out.println("list 삭제 시간 (n/s) : "+(endTime-startTime));
        System.out.println("list : "+list);
        */
        
        startTime = System.nanoTime(); // 코드 실행 전의 시간
		list.remove("강아지");
		list.remove("고양이");
		list.remove("햄스터");
		endTime = System.nanoTime(); // 코드 실행 후의 시간
        System.out.println("list 삭제 시간 (n/s) : "+(endTime-startTime));
        System.out.println("list : "+list);
	}
}
