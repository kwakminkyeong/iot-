package COLLECTION;

import java.util.*;

public class Sample7 {
	public static void main(String[] agrs) {
		//전반적인 성능은 ArrayList가 우월하다.
		LinkedList<String> L=new LinkedList<String>();
		//어레이리스트와 사용법은 동일
		//데이터간에 연결링크가 남아있는 형태로 구현되어 인근값의 검색이 빠르고
		//첫값(first)와 끝값(last)을 찾아내는데 특화된 기능을 가지고 있다.
		
		L.add("A");
		L.add("B");
		L.add("C");
		L.add("D");
		L.add("E");
		L.add("F");
		System.out.println(L);
		L.addFirst("G");
		L.addLast("H");
		L.removeFirst();
		L.removeLast();
		System.out.println(L);
	}
}
