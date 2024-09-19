package inter;

public class Sample1 {
	public static void main(String[] args) {
		ITF box1=new A();//설계도A는 ITF에 용도로 사용할 수 있다.
		ITF box2=new B();
		
		
	}//main종료
}//class 종료

//인터페이스 : 인터페이스가 구현된 객체들을 특정 규격으로 저장할 수 있는 방법
//interface 이름{}
//인터페이스는 클래스에 구현해서 객체의 규격을 결정하는 역할을 한다.
//인터페이스는 객체의 용도이므로 다중구현이 가능하다.
interface ITF{
	//필드, 메서드, 생성자를 가질 수 없다.
	//인터페이스는 변수가 아니라 상수를 가진다.
	//int a만 적어도 public static final을 앞에 붙인채 만들어진다.
	int a=10; //초기값을 넣어주면 된다.
	//인터페이스는 메서드를 가질 수 없다. 추상메서드를 가질 수 있다.
	//void run();만 적어도 public abstract가 앞에 붙어서 만들어진다.
	//void run();
	//인터페이스는 생성자를 가질 수 없다.
}//interface종료
class A implements ITF{
	//필드, 메서드, 생성자를 가질 수 있다.
	public static final int a=10;
	void run() {
		
	}
}//A class종료

class B implements ITF{
	
}//B class종료