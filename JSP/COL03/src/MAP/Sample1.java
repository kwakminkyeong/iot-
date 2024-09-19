package MAP;

import java.util.*;

public class Sample1 {
	public static void main(String[] args) {
		//Map : 검색어(key)와 데이터(value)가 한쌍으로 연결되어 있는 데이터 구조
		//검색어를 통하여 데이터를 검색할 수 있기 때문에 개발에 편리
		//검색어는 중복될 수 없지만 데이터는 중복될 수 있음
		//Map은 저장 순서가 없음.컴퓨터가 빠르게 검색하기 빠른 순서로 나열한다.
		
		Map<String, String> m=new HashMap<String, String>();
		//Map put(key, value); : 검색어와 값을 한 쌍으로 저장(정류소, 버스_number,time)
		m.put("서울", "02");
		m.put("경기도", "031");
		m.put("인천", "032");
		m.put("강원도", "033");
		m.put("충청남도", "041");
		System.out.println(m);
		
		//Map.get(key); : 검색어를 입력해서 해당하는 값을 얻어냄
		String number=m.get("강원도");
		System.out.println(number);
		//제네릭이 지정되지 않은 데이터의 획득 시 오류가 발생한다면 다음의 방법 중 하나를 선택해서 사용
		//1. 데이터를 담을 변수의 타입을 Object로 변경한다.(다만 데이터의 고유 피드/메서드에 손상이 있어 비추천)
		//2. 데이터를 변수에 담기 전에 해당 타입으로 캐스팅을 진행한다.
		//3. 객체 생성 시 제네릭을 지정하여 데이터 획득 시 오류를 방지한다.
		
		
		/*System.out.println("지역번호를 확인하실 지역명을 입력해주세요");
		Scanner sc=new Scanner(System.in);
		String key=sc.next();
		String value=m.get(key);
		if(value==null) {
			System.out.println("해당하는 지역명이 없습니다.");
		}else {
			System.out.println(key+"의 지역번호는 "+value+"입니다.");
		}*/
		
		//for문을 이용한 운행은 i값이 없어서 뽑아내기 곤란.(i값을 만들어주면 된다.)
		//Collection의 기능 중에는 Map이 가지고 있는 Key, Value중 하나를 선택해서 집합데이터로 뽑아낼 수 있는 기능이 있다.
		Collection values=m.values();
		Collection keys=m.keySet();  //검색어 집합데이터에 인덱스가 없어서 for문 사용 곤란
		Object[] arr=keys.toArray(); //배열로 가동 -> 인덱스가 부여됐음
		System.out.println(keys);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+":"+m.get(arr[i]));
		}
		
		
		/*for(int i=0; i<m.size(); i++) {
			System.out.println(m.get(i));
		}*///===>불가 위와 같이 사용할 수 있다. 개발자 도전의식
		
		
		
		
		
		//향상된 for문의 경우 뽑아낼 데이터의 타입을 특정하기가 곤란.
		//key:value가 한쌍으로 이루어져있는 데이터 타입을 Entry라 한다.
		//Map.Entry 타입의 Set을 만들어서 향상된 for문을 동작하게 만든다.
		Set<Map.Entry<String, String>> set=m.entrySet();
		System.out.println(set);
		for(Map.Entry<String, String> ent:set) {
			System.out.println(ent);
		}
		
		/*for(Object o:m) {
			
		}*/ //===>동작자체를 안함
		
		
		
		//iterator 사용할 수 있을지도 확실치 않음.
		//iterator itr=m.iterator(); ====>iterator 메서드가 아예없다.사용불가
		Iterator itr=m.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry ent=(Map.Entry)itr.next();
			System.out.println(ent);
		}
	
		//하려면 할 수는 있지만 할 이유가 그리 많지 않다.
		
		//기업 업무용 솔류션을 인전할때 사용한다.매크로처럼 편하게 사용할 수 있다.
		
		
		//Map.put(key, value); : 데이터입력
		//Map.get(key); : 데이터출력
		
		
		
		
	}//main종료
}//class종료
