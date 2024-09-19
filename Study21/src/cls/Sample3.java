package cls;

public class Sample3 {
	public static void main(String[] args) {
		Dog a=new Dog();
		a.run();
		String c=a.test();
		System.out.println(c);
		int i=a.add();
		System.out.println(i);
		a.sum(100,300);
		
		
	}//main종료
}//class종료

class Dog{
	//이름이 run()이고 console에 "멍멍"을 출력하는 메서드를 제작하시오.
	//이름이 test()이고 console에 "왈왈"을 출력한 뒤 "콜라"를 반환하는 메서드를 제작
	//두 메서드를 실행한 뒤 test()의 결과값을 변수에 저장하고 console에 출력하시오
	//이름이 add이고 숫자 999를 반환하는 메서드를 제작하시오.

	void run() {
		System.out.println("멍멍");
	}
	
	String test() {
		System.out.println("왈왈");
		return "콜라";
	}
	
	int add() {
		return 999;
	}
	//매개변수가 있는 메서드.외부에서 들어오는 데이터를 가공하는 메서드
	//메서드 선언시 ()내부에 변수를 두어 후에 줄 데이터가 메서드에 이용될 수 있도록 함
	//해당 변수는 메서드 내부에서 변수처럼 사용 가능하다.
	//매개변수가 있는 메서드는 호출 시 해당 타입의 데이터를 주어주지 않으면 동작할 수 없다.
	void sum(int n, int m) {
		System.out.println(n+m);
	}
	
}//dog class 종료
