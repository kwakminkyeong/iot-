package GENE;

public class GENERIC {
	public static void main(String[] args) {
		//제네릭 : 클래스를 객체로 조립하는 과정에서 클래스 내부의 타입을 지정할 수 있는 문법
		//제네릭의 자료형은 변수기본형으로 사용할 수 없고 클래스 타입으로 지정해야 한다.
		//기본자료형을 사용하고자 하는 경우 정식명칭을 사용해야 한다.*X5,000,000
		//제네릭이 지정된 클래스를 객체로 조립할 때 제네릭타입을 특정하지 않으면 Object타입이 된다.
		//제네릭이 지정되어 있는 Collection을 사용할 때 타입을 특정하지 않으면 오류의 원인이 될 수 있다.
		Test<Integer> t=new Test<Integer>(1234);
		int msg=t.run(); //기본형 int로 받아준다.
		System.out.println(msg);
		
		//자바 컬렉션
		//*X5,000,000 반드시 암기
		//Set : 순서가 없는 자료형, 중복데이터 저장 불가
		//List : 순서가 엄격히 존재하는 자료형, 중복데이터 저장 가능
		//Map : 검색어와 데이터가 1:1로 매칭되어있는 자료형, 검색어는 중복불가, 데이터는 중복가능
		
	}
}//class종료


//class Normal{
//	int a;
//	Normal(int str){
//		a=str;
//	}
//	int run() {
//		return a;
//	}
//}

//제네릭이 구현된 클래스
//제네릭을 구현하기 위해서는 명칭을 지정해야 한다
class Test<Type>{
	Type a;
	Test(Type str){
		a=str;
	}
	Type run() {
		return a;
	}
}