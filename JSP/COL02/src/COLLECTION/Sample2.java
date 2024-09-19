package COLLECTION;

import java.util.*;

public class Sample2 {
	public static void main(String[] args) {
		//Stack : 데이터가 순서대로 입력되고 역순으로 빠져나오는 자료형_컴안에 데이터를 꺼낸다고 생각하면된다. 후입선출 LIFO(Last In First Out)
		//Vector : 데이터가 순서대로 입력되고 용량이 자동 증가하는 자료형
		
		Stack L=new Stack();
		//Stack.push() : 데이터를 입력
		//Stack.pop() : 데이터를 출력
		L.push("A");
		L.push("B");
		L.push("C");
		System.out.println(L);
		Object data=L.pop();
		System.out.println(data);
		System.out.println(L);
		System.out.println("================================================================");
		
		Vector v=new Vector();  //데이터가 더 들어오면 용량을 늘리는 배열이다.
		//Vector.add() : 데이터를 입력
		//Vector.get(index)  데이터를 출력
		v.add(1);
		v.add(2);
		for(int i=3; i<=25; i++) {
			v.add(i);
		}
		System.out.println(v);
		//Vector.capacity() : 벡터의 용량을 확인
		//Vector.size() : 벡터의 데이터 길이를 확인
		System.out.println("벡터의 용량 :"+v.capacity());
		System.out.println("벡터의 크기 :"+v.size());
		System.out.println("10번 데이터 출력 "+v.get(10));
	}
}
