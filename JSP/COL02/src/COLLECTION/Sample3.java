package COLLECTION;

import java.util.*;

public class Sample3 {
	public static void main(String[] args) {
		ArrayList L=new ArrayList(); //유사배열형태의 여러 자료를 [엄격한 순서]*로 저장하는 규격
		//ArrayList.add(); :데이터를 입력
		L.add("1");
		L.add("2");
		L.add("3");
		L.add("4");
		System.out.println(L);
		
		ArrayList L2=new ArrayList();
		L2.add("A");
		L2.add("B");
		L2.add("C");
		L2.add("D");
		System.out.println(L2);
		
		//ArrayList.addAll(ArrayList) : 기존 어레이리스트에 다른 어레이리스트 내용을 추가
		//ArrayList.add(ArrayList) : 한 요소로 어레이리스트가 2차원형태로 추가
		L.addAll(L2); //addAll 집합자료형으로 요긴하게 사용할 수 있다.
		System.out.println(L);
		
		//ArrayList.add(int, data); : 해당 위치에 특정 데이터를 입력
		L.add(2,"가");
		System.out.println(L); //게시판을 사용할때 3가지 게시판 전체 보기를 할때 사용. 보여주는 게시글 사이에 데이터를 넣을 때
		//ArrayList.addAll(int, ArrahList); : 해당 위치에 특정 어레이리스트 내용을 추가
		
		ArrayList L3=new ArrayList();
		L3.add("I");
		L3.add("O");
		L3.add("T");
		
		L.addAll(6, L3);
		System.out.println(L);
		
		//ArrayList.subList(int, int); : 특정부분의 데이터를 추출하여 서브리스트로 제작 return List;
		List sub=L.subList(3, 9);//index 3~8번까지 출려된다.
		System.out.println(sub);
			
	}
}
