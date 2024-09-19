package review;

public class Sample2 {
	public static void main(String[] args) {
		Parent c=new Child();
		c.method();
		c.work();
		Parent s=new Student();
		s.work();
		//s.run(); //어떻게 실행시키지?
		
	}//main종료
}//class종료
class Parent{
	int number;
	void method() {
		System.out.println("메서드가 실행되었습니다.");
	}
	void work() {
		System.out.println("자동차 공장을 운영합니다.");
	}
}//Parent종료
class Child extends Parent{
	void work() {
		System.out.println("군대갑니다.");
	}
}
class Student extends Parent{
	void work() {
		super.work();//부모의 기능을 살리면서 자식의 기능은 추가한다
		System.out.println("공부할래");
	}
	void run() {
		
		System.out.println("학교에갑니다.");
	}
}