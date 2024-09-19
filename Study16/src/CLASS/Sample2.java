package CLASS;

public class Sample2 {
	public static void main(String[] args) {
		//int a; //숫자가 들어갈 수 있는 크기로 상자를 만들어주세요.
        //Test a; //테스트가 들어갈 수 있는 크기로 상자를 만들어주세요.
        //a=new Test(); //새로 test설계도를 조립해주세요.
		//new : 인스턴스 연산자, 새로 뭔가 만들어내라는 뜻
		//클래스명() : 생성자, 설계도(class)를 객체(object)로 조립하는 기능
		
		Test a=new Test();
		a.number=10;
		a.name="이영준";
		a.exam=false;
		System.out.println(a);
		System.out.println(a.number+"\t"+a.name+"\t"+a.exam); //a안에 있는 number+ a안에 있는 name+ a안에 있는 exam을 출력해달라.
		a.data=new Data();
		//객체 내부의 데이터를 확인/입력시 내부의 필드명 명시 필요
		
		
	}//main종료
}//class종료

class Test{
	//class는 설계도다->객체를 만드는 용도로 사용된다.
	//class는 필드, 메서드, 생성자(컨스트럭터)를 가질 수 있다. *X5,000,000
	//필드 : 객체가 가질 수 있는 속성을 저장할 공간, 다른 객체와의 구별용도 사용
	//	    필드는 통상적으로 변수로 제작된다.
	//메서드 : 객체가 수행할 수 있는 동작을 정의하는 공간, 클래스에 적혀서 객체가 수행
	//생성자 : 객체를 제작하는 방법
	int number;
	String name;
	boolean exam;
	Data data; //클래스 데이터가 들어갈 상자 data를 만들어줘
	//필드는 반드시 기본형을 사용할 필요는 없고, 다른 클래스의 타입으로도 지정가능
	
}//Test class종료
class Data{
	//복합되는 값이 들어가야만 의미있는 설계도.자료형을 만들어 사용한다.객체구현을 잘해야한다.개념적으로 잘 풀어야 밑바탕이 잘 다져진다.
	double x;
	double y;
	
}//Data class 종료