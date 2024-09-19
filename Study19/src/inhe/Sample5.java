package inhe;

public class Sample5 {
	public static void main(String[] args) {
		//Object 클래스는 모든 클래스의 조상이므로
		//Object타입의 변수에는 모든 객체를 담을 수 있다.
		Child c=new Child();
		
	}//main종료
}//class종료

//상속 : 자식 클래스가 부모 클래스의 형태를 상속받는 방법
//자식클래스 extends 부모클래스
//자식클래스는 부모클래스의 내용을 가져다 사용할 수 있지만
//부모클래스는 자식클래스의 내용을 사용할 수 없다.
class Parent{
	Parent(){
		System.out.println("부모의 생성자");
	}
	int money=10000000;
	void study() {
		System.out.println("공부를 열심히 합니다");
	}
	void work() {
		System.out.println("가업 공무원"); //가업처럼 상속을 받는다
	}
}//parent종료
class Child extends Parent{
	Child(){
		System.out.println("자식의 생성자");
	}
	String comp="컴퓨터";
	//오버라이드 : 부모에게서 상속받은 메서드를 재정의하여 사용하는 방법
	void study() {
		super.study(); //super부모를 명칭. 부모의 기능을 출력하고
		System.out.println("싫어 게임할꺼야");
	}
	void work() {
		System.out.println("오버라이드 개발자");
	}
}//Child종료
