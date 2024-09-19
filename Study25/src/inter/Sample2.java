package inter;

public class Sample2 {
	public static void main(String[] args) {
		Test t=new Test();
		Inter1 a=new Test();//인터페이스로는(용도를) 객체를 만들 수 없다.
		Inter2 b=new Test();
		
		a.run();
	}//main종료
}//class종료
class Test implements Inter1, Inter2{
	public void run() {
		
	}
}
interface Inter1{
	//인터페이스는 필드, 메서드, 생성자를 가질 수 없다.
	//메서드를 가질 수 없는 대신 추상메서드를 가질 수 있다.
	//인터페이스가 추상메서드를 가진 경우 이를 구현한 클래스는 반드시 추상메서드의 몸통을 구현해야 한다.
	void run();
}
interface Inter2{
	
}
abstract class ABS implements Inter1{
	public void run() {
		
	}
}
class Normal extends ABS{
	
}

/*		
 			객체 		필드		메서드	생성자	추상메서드	
  일반클래스	o		o		o		o		X
  추상클래스	X		o		o		o		o
  인터페이스	X		X		X		X		o
 
 */
