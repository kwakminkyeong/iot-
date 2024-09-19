package COLLECTION;

import java.util.*;

public class Sample4 {
	public static void main(String[] args) {
		ArrayList<String> AL=new ArrayList<String>();//데이터타입이 String만 넣겠다.
		AL.add("IOT");
		AL.add("java");
		AL.add("SQL");
		AL.add("JAVASCRIPT");
		AL.add("HTML");
		AL.add("CSS");
		System.out.println(AL);
		
		//ArrayList.get(int) : 해당 순번의 데이터를 참조
		System.out.println(AL.get(3)); //index 3번이 뽑힌다.
		//ArrayList.set(int, data) : 해당 순번의 데이터를 변경
		AL.set(1, "JSP"); //index 1번을 "JSP"로 변경
		System.out.println(AL);
		
		//일반 for문을 이용하는 방식, 배열운행은 .length, 어레이리스트운행은 .size()사용
		/*for(int i=0; i<AL.size(); i++) {
			System.out.println(AL.get(i));
		}*/
		
		//[향상된 for문]을 이용하는 방식.====> 다른언어에서 for each라고 사용한다. 자바의 for each는 다른언어의 for each랑은 다르다.
		//세부적으로 조작할 수 없다.
		/*for(String str:AL) {
			System.out.println(str);
			
		}*/ 
		
		//while문을 이용하는 방식 기준점을 줄 수 있다.
		/*int i=0;
		while(i<AL.size()) {
			System.out.println(AL.get(i));
			i++;
		}*/
		
		//iterator를 이용하는 방식
		//Iterator.next() : 현재위치 바로 뒤 데이터를 반환한 뒤 자신의 위치를 이동
		//Interator.hasNext() : 현재위치 바로 뒤에 데이터가 있는지 여부를 확인
		/*Iterator itr=AL.iterator();
		  itr.next(); //반환하고 자기 위치를 바꾼다
		  itr.next();
          System.out.println(itr.hasNext());*/
		
		Iterator itr=AL.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		
		}
		
		//어레이리스트를 제작하자마자 값을 넣어두는 방법
		ArrayList<Integer> AL2=new ArrayList<Integer>(Collections.nCopies(10,3));
		System.out.println(AL2);
		
		
		
	}//main종료
}//class종료
