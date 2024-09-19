package abs;

public class Sample4 {
	public static void main(String[] args) {
		Child a= new Child();
		
	}//main종료
}//class종료

abstract class ABS{
	int number;
	void method() {
		System.out.println("추상클래스의 메서드");
	}
	ABS(){
		System.out.println("추상클래스의 생성자");
	}
	abstract void add(); //void인데 생성자가 실행됨?
}
class Child extends ABS{
	void add() {
		
	}
}
