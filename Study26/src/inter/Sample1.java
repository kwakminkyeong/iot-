package inter;

public class Sample1 {
	public static void main(String[] args) {
		Test t=new Test();
		Exam e=new child();
		t.run(e);
		//new Test().run(new Exam());
		
		
	}//main 종료
}//class 종료
class Test{//객체를 먼저 만듭니다.생성자를 호출하는 것입니다. 이것을 변수에 담아서 사용합니다.
	void run(Exam a){//메서드란 클래스 내부에 작성되어 객체가 수행되는 것이다.
		System.out.println("실행확인!");
	}//void run 종료
}//class Test 종료

//추상클래스는 객체로 조립할 수 없다.
//추상클래스를 상속받은 일반클래스가 객체로 조립되어야 한다.
//상속에서 자식객체는 부모객체가 들어갈 수 있는 타입에 들어 갈 수 있다.

interface Exam{
	public abstract void method();
	
	
}//추상class Exam 종료

//추상클래스를 상속받은 일반클래스는 반드시 추상클래스가 가진 추상메서드이 몸통을 구현해야 한다.
//인터페이스의 추상메서드를 구현하는 경우에는 앞에 public을 붙여주어야 한다.

class child implements Exam{
	 public void method() {
		 
	 }

}