package COLLECTION;

import java.util.*; //자바 컬렉션은 이 경로에 들어있습니다.

public class Sample1 {
	public static void main(String[] args) {
		//자바컬렉션은 interface형태로 구현되어 있어서 바로 객체로 만들어 사용할 수 없다.
		//사용자가 별도로 implements하지 않아도 사용할 수 있도록 class가 미리 마련되어 있다.
		List L=new ArrayList();
		//List.add(Data); : 해당 데이터를 다음 순서로 입력
		L.add(1);
		L.add(99);
		L.add(2);
		L.add(3);
		L.add(4);
		L.add(3);
		System.out.println(L);
		
		
		Set s=new HashSet();
		//Set.add(Data); :해당데어터를 입력, 순서가 엉망임, 중복데이터는 삭제됨. 이터레이터를 기준으로하는 인덱스가 없다
		s.add("gray");
		s.add("red");
		s.add("blue");
		s.add("orange");
		s.add("yellow");
		s.add("green");
		s.add("blue");
		System.out.println(s);
		
		Map m=new HashMap();
		//Map.put(key, value); : 해당 데이터를 입력, 순서가 엉망임, 키가 중복될 경우 중복제거. 여러단어들어가는 홈페이지의 html이 이렇게 사용된다.
		m.put("red", "빨강");//중복되었을때 앞의 데이터가 소거되었다.
		m.put("blue","파랑");
		m.put("green","초록");
		m.put("red","레드");
		m.put("purple","레드");//value 값으로 구분한다
		System.out.println(m);
	}//main종료
}//class종료

