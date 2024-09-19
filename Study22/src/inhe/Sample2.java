package inhe;

public class Sample2 {
	public static void main(String[] args) {
		Parent c=new Child();
		c.work();
		Parent s=new Student();
		s.work();
		
	}//main종료
}//class종료

//상속 : 클래스끼리 부모로부터 자식에게 필드, 메서드 등이 상속되는 것
//상속이 이루어지면 부모의 필드, 메서드를 자식이 사용할 수 있다.
//부모타입의 변수에 자식타입의 객체를 저장할 수 있다.
//부모는 여러 자식을 둘 수 있지만, 자식은 반드시 하나의 부모만 둘 수 있다.*X5,000,000 
class Parent{
	int number;
	void method() {
		System.out.println("메서드가 실행되었습니다.");
	}//method void종료
	void work() {
		System.out.println("자동차 공장을 운영합니다.");
	}//work void종료
}//Parent class종료

class Child extends Parent{
	//클래스 명 뒤에 extends 부모클래스명을 적어서 상속받음을 표기한다.
	void work() {
		System.out.println("군대갑니다.");
	}
	
}//Child종료

class Student extends Parent{
	//오버라이드 : 상속관계에서 부모의 메서드를 재정의하여 사용하는 방법 *X5,000,000
	//부모의 메서드를 매개변수, 리턴타입, 이름까지 동일하게 작성한 뒤 다른 내용을 적는다.
	//오버라이드시 부모 메서드의 기능이 전부 재정의되어 되려 불편할 수 있다.
	//이 경우에는 오버라이드된 메서드 내부에서 부모의 메서드를 실행시켜서 해소 가능하다.
	void work() {
		super.work();//오버라이드 되지 않은 원본을 실행
		System.out.println("공부할껍니다."); //부가된 추가내용을 실행
	}
	void run() {
		System.out.println("학교갑니다.");
	}
}//Student 종료

class child2 extends Parent{
	
}