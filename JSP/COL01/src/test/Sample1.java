package test;

import java.util.*; //컬렉션은 여기 들어있음

public class Sample1 {
	public static void main(String[] args) {
		//자바 컬렉션 : 자료를 이용하기 위해 구현된 일종의 프레이 워크
		//사용방법이 딱 정해져 있음.
		//*X5,000,000 컬렉션의 기본형은  interface이므로 객체로 생성해서 사용할 수 없다.
		//미리 impements가 되어있는 class들이 존재함, 이 class들을 객체로 생성해서 기능을 구현
		
		//List : 순서가 엄격히 존재, 중복 데이터를 허용, 개발자가 지정한 순번이 엄격하게 지켜진다.
		//	Vector, Stack, LinkedList, ArrayList 등......
		//			Stack : 후입선출 ,컵안에 물건을 뺄때를 상상,구닥다리
		//			Vector : 사설채팅방을 만들때 사용.배열 기본으로 만들어준다 .10-20-30-40 length(사용배열)와 캐퍼시트(전체배열/여백)를 갖는다.낭비가 생긴다.
		//			*ArrayList : 데이터가 들어올때마다 하나씩 만든다.
		//			LinkedList : 데이터가 연결되어 링크가 만들어져 있다.첫값과 끝값을 찾는데 특화되어있다.사용자가 입력한 순서가 변동되지 않는다. 순서를 바꿀 수 없다
		//Set : 순서가 없음, 중복 데이터를 허락하지 않음
		//	HashSet, SortedSet, TreeSet 등.....
		//			Hash : 용량을 규정지어서 읽는다.빠르다. 고속이다. 순서가 없다.
		//			*HashSet : 대단히 빠르다
		//			SortedSet : 내부의 값을 기준으로 정렬처리한다. 마음대로 바꿀 수 없다. 회원목록 게시판 정렬에는 맞지 않는다.
		//			TreeSet : SortedSet가 원형. 데이터가 자동정렬된다. 데이터를 검색한느데 높은 비율를 차지한다. 인공지능개발에 많이 쓰인다.
		//Map : {key:value} 쌍으로도니 데이터, key는 중복불가, value는 중복가능.속도가 느리다 그중 HashMap을 사용한다
		//	HashMap, SortedMap, TreeMap 등.....
		//			*HashMap :
		//			SortedMap :
		//			TreeMap :
		List L=new ArrayList(); // ArrayList는 누군가 만들어 놓은 것이다.
	}//main종료
}//class종료
