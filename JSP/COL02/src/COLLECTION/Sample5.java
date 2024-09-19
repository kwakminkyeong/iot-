package COLLECTION;

import java.util.*;

public class Sample5 {
	public static void main(String[] args) {
		ArrayList<String> AL=new ArrayList<String>();
		AL.add("India");
		AL.add("Korea");
		AL.add("Us");
		AL.add("China");
		AL.add("Denmark");
		System.out.println(AL);
		
		//Collections.sort(AL); //오름차순 정렬
		Collections.sort(AL, Collections.reverseOrder()); //내림차순 정렬 오버로드
		System.out.println(AL);
		//주의사항
		//1. 객체를 비교할 때는 다음의 sort를 사용할 수 없다.
		//2. List는 순번이 엄격하기 때문에 정렬된 내용이 영구적으로 반영된다.
		
	}//main 종료
}//class 종료
