package abs;

public class Sample4 {
	public static void main(String[] args) {
		//ABS a=new ABS(); 추상클래스는 객체로 조립이 안된다.
	}//main종료
}//class종료

//추상 클래스 : 고도로 추상화되어 객체를 연상할 수 없게된 클래스
//추상클래스는 객체를 조립할 수 없다. 상속을 통해 구체화 되어야만 객체가 될 수 있다.
//추상클래스는 필드, 메서드, 생성자, 추상메서드를 가질 수 있다.
abstract class ABS{
	int number;
	void method() {
		System.out.println("추상클래스의 메서드");
	}
	ABS(){
		System.out.println("추상클래스의 생성자");
	}
	abstract void add(int a, int b); //추상클래스는 중괄호사용 안함
	
}//ABS 종료
//추상클래스는 상속을 통하여 일반클래스로 구체화하여 사용한다.
//추상클래스가 추상메서드를 가진 경우 이를 상속받은 일반클래스는 반드시
//추상메서드의 몸통을 구체화하여야 한다.
class Child extends ABS{
	void add(int x, int y) {
		
	}
}