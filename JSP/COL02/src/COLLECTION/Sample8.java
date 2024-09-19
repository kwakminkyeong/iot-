package COLLECTION;

import java.util.*;
import java.util.function.*;

public class Sample8 {
	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		//Set은 순서가 없다. 중복데이터를 허용하지 않는다. for 문을 돌리기 어렵다.
		s.add("apple");
		s.add("mango");
		s.add("grape");
		s.add("orange");
		s.add(null);  //데이터가 없다는 의미의 공백
		s.add("0"); //String타입의 null이라는 문자열 ["null" 이라는 문자는 가급적 저장하지 않는다.defult"0"을 넎는다
		System.out.println(s);
		//Set.add() : return bloolean, 값이 없어서 잘 들어가면 true, 값이 있어서 안들어가면 false
		s.add("apple");
		boolean result=s.add("orange");
		System.out.println(result);//오렌지는 있어서 안들어갔음 false
		result=s.add("dog");
		System.out.println(result);
		
		
		
		//Set.clear() : Set안에 들어있는 모든 자료를 소거
		//s.clear();
		System.out.println(s);
		
		//Set은 순서가 없기 때문에 index에 해당하는 값을 참조할 수 없다. int i이 무용지물이다.
		//배열로 변경해서 for문으로 출력하는 방법
		String[] arr=new String[s.size()]; //Set과 동일한 크기의 배열 생성
		s.toArray(arr);					   //만들어진 배열에 Set을 변환하여 저장
		for(int i=0; i<arr.length; i++) {  //일반 배열 for 문으로 출력
			System.out.println(arr[i]);
		}
		
		//List 타입으로 변경해서 출력하는 방법
		List<String> L=new ArrayList<String>(s);	//Set과 동일한 내용을 가진 ArrayList생성
		for(int i=0; i<L.size(); i++) {
			System.out.println(L.get(i));
		}
		
		//향상된 for문을 이용하면 변환없이 바로 출력가능하다. 다른언어의 for each와 같다.
		for(String str:s) {
			System.out.println(str);
		}
		
		//iterator를 이용하는 방법도 Set에서 바로 사용가능하다.
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//위쪽 방식, 특히 향상된 for사용법이 잘 숙지되신 분들은 아래의 방법도 사용해 보세요.
		
		//Set이 가지고 있는 forEach를 사용하는 방법
		//forEach(Consumer c) : Consumer 인터페이스를 구현한 객체를 매개변수로 사용하는 방법
		s.forEach(new Consumer<String>(){
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		s.forEach((str)->{System.out.println(str);});
		//LinkdeHashSet : 데이터의 입력 순서를 기억하면서도 중복되는 데이터의 입력을 방지해야 하는 경우 사용, 데이터가 연결되어있을뿐 index는 없다.
		LinkedHashSet LHS=new LinkedHashSet();
		LHS.add(500);
		LHS.add(100);
		LHS.add(50);
		LHS.add(1500);
		LHS.add(60);
		LHS.add(500);
		System.out.println(LHS);
		
		
	}
}
