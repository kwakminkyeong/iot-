package method;

//import java.util.*;

public class Sample1 {
	public static void main(String[] args) {
		Test t; //Test가 조립되어 들어갈 수 있는 상자 t를 만들어라
		t=new Test(); //새로 Test를 조립해줘 객체가 t
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("아이디를 입력해 주세요");
//		String id=sc.next(); //스캐너안에 만들어 놓은 객체이름
//		t.yep(id);
		t.java();
		//String msg="반갑습니다 자바";
		//t.hi();
		String msg=t.hi();
		System.out.println(msg);
		
		
//		t.run(); //객체안에 있는run을 실행
//		t.yep(); //테스트가 조립된 객체가 실행해야합니다.
		
	}//main종료
}//class종료

class Test{
	//메서드는 클래스 내부에 작성되어 객체가 수행한다.
	void run() {
		System.out.println("메서드가 실행되었습니다"); //run실행해 하지만 아무것도 나오지 않는다
	}
	//"안녕하세요"라고 출력하는 메서드를 만들고 실행시켜 보세요
	
	void yep(String user){
		System.out.println(user+"님 접속을 환영합니다!!");
	}
	
	//"반값습니다. 자바"라고 출력하는 메서드를 만들고 실행시켜 보세요.
	void java() {
		System.out.println("반갑습니다. 자바");
	}
	
	
	
	String hi() {
		System.out.println("메서드 내부에는");
		System.out.println("몇 개의 명령어를 넣어도 순서대로 실행됩니다.");
		return "반갑습니다 자바";
	}
	
	/*
	리턴타입 이름(매개변수) {
		
	}
	*/
	
	
}//test종료
