package cls;

public class Sample1 {
	public static void main(String[] args) {
	
		//new : 인스턴스 연산자
		Test t;
		t=new Test();  //조립하는것이 생성자이다.
//		t.a=150;
//		t.s="스트링";
//		System.out.println(t.a);
//		System.out.println(t.s);
		t.run(); //메서드
	}//main종료
}//class종료

//클래스 : 설계도-이해하기 위해서는 여러가지 생각을 해야한다.
//클래스 자체로는 기능할 수 없고, 클래스를 조립한 객체를 통해서 수행해야 한다.
//클래스는 필드, 메서드, 생성자를 가질 수 있다.

class Test{
	//필드 : 클래스 내부에 만드는 변수, 후에 객체가 데이터를 저장하는 용도로 사용
	//필드는 원하시는 수 만큼 제작할 수 있지만 class밖에 만들면 사용할 수 없다.
	//필드에는 초기값을 넣을 수도 있고 넣지 않을 수도 있다. 초기값을 넣으면 그 값으로 정해진다.
	//필드에 초기값을 넣으면 생성된 객체는 해당 값을 가진 채로 제작된다.
	//필드에 초기값을 헌지 않았다면 가장 0에 가까운 값을 기본값으로 넣어준다.
	int a;
	String s;
	
	//메서드 : 클래스 내부에 작성되어 후에 객체가 수행하는 동작
	/*
	 리턴타입 이름(){}
	*/
	void run() {
		System.out.println("메서드가 실행되었습니다.");
		
	}//void return종료
	
	
}//test class종료