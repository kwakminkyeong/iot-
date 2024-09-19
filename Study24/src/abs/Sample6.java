package abs;

public class Sample6 {
	public static void main(String[] args) {
		Child c=new Child();
		c.work();
		ITF i=new Child();//인터페이스가 구현된 객체가 들어갈 수 있다.
	}//main종료
}//class종료

//추상클래스가 추상 메서드를 가진 경우
//해당 추상클래스를 상속받은 일반클래스는 반드시 추상메서드의 몸통을 구현하여야 한다.
abstract class GrandParent{
	GrandParent(){
		System.out.println("조부모의 생성자");
	}
	void work() {
		System.out.println("과실영농업");
	}
	abstract void run();
}//GrandParent종료

abstract class Parent extends GrandParent{
	Parent(){
		System.out.println("부모의 생성자");
	}
	abstract void work(); 
	void run() {
		System.out.println("마라톤");
	}
}//Parent종료

class Child extends Parent implements ITF, ITF2{ //부모를 상속받았고 인터페이스
	Child(){
		System.out.println("자식의 생성자");
	}
	void run() {
		
	}
	void work() {
		System.out.println("개발자");
		
	}
	
}//Child종료

interface ITF{
	int number=10; //필드 아님. 원래 모양은 public static final int number=10; ===> 상수를 가질 수 있다.
}// ITF종료

interface ITF2{
	
}// ITF2종료