package cls;

public class Sample1 {
	public static void main(String[] args) {
		Dog a;          //Dog class가 들어갈 수 있는 상자를 만들어줘
		a=new Dog();    //객체를 만들어줘. 인스턴스 연산자 new를 적어주고 생성자를 적어준다.
		Dog b;
		b=new Dog();    //다른객체. 구별된다.개별적으로 동작한다.
		
		a.eat(); //메서드 실행
		
		
	}//main 종료
}//class종료
//클래스:설계도
//클래스는 필드, 메서드, 생성자를 가질 수 있다.
//1. 필드 : 객체가 데이터를 가질 수 있는 공간, 속성, 타 객체와 구별하는 기준으로 사용
//2. 메서드 : 클래스에 작성되어 객체가 수행하는 동작
//3. 생성자 : 객체를 조립하는 기능
//			객체가 조립될 때 무조건 간 한번만 실행된다.
//			리턴타입이 없고 클래스와 이름이 똑같은 메서드처럼 생겼다.	

class Dog{
	String name;  //똘이 출석번호로 우열을 가린다.
	int age;      //9세 우열구별 계산처리해야할 경우 int로 한다. 로얄커리
	int weight;   //몸무게
	int size;     //1.2m 길이
	String race;  //보더콜리
	
	void eat() {
		System.out.println("먹습니다.");
		
	}//리턴값이 없는 void종료
	void sleep() {
		System.out.println("자고있습니다.");
		
	}//리턴값이 없는 void종료
	
	Dog(){
		//생성자는 따로 작성하지 않아도 class내부에 자동으로 안보이게 작성되어있다.
		//개체로 조립한다.
		//무조건 한번만 실행한다.
		//다른 기능을 붙이거나 다른 용도로 붙이고 싶다면 한번 적어서 내부를 작성하여 변경할 수 있다.
		
	}//생성자 종료
}//class종료

