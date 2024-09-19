package method;

public class Sample {
	public static void main(String[] args) {
		
		Exam e=new Exam();
		
		Parent p=new Child();
		e.run(p);
		
	}//main종료
}//class종료

//추상클래스는 객체로 조립할 수 없다.*
//추상클래스는 일반클래스에게 상속해서 객체로 조립하여야 한다.*
//부모클래스 타입의 변수에는 자식 객체가 들어갈 수 있다.*
//추상클래스를 상속받은 일반클래스 객체는 추상클래스 타입의 변수에 들어갈 수 있다.
abstract class Parent{
	
}

class Child extends Parent{
	
}

class Exam{
	void run(Parent p) {
		System.out.println("동작확인");
	}
}