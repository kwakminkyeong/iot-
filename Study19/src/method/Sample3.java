package method;

public class Sample3 {
	public static void main(String[] args) {
		//메서드를 실행하는 방법
		//0.객체를 저장할 수 있는 규격의 변수를 만들어야 한다.
		//1.메서드를 실행 할 객체를 만들어야 한다.
		//2.만들어진 객체를 해당 규격의 변수에 담고
		//3.객체를 통해서 메서드를 실행한다.
		
		Test t;
		t=new Test();
		t.run(); //메서드를 실행 매개변수를 받아오지 않는타입
		t.run(15); //메서드이름이 같으면 매개변수를 변경해서 받는것 메서드오버로드
		t.run("홍길동");
		t.run(200,"홍길동");
		t.run("홍길동",300);
		t.run(true);
		t.run("북부","남부","동부");
		
		//조립방법이 2가지이다. 2개가 같이 실행되지 않는다
		Over a;
		a=new Over();
		System.out.println(a.num);//String으로 받은 생성자 실행
		
		a=new Over(-2000);
		System.out.println(a.num); //int로 받은 생성자 실행
		
		a=new Over("5000");
		System.out.println(a.num); //String으로 받은 생성자 실행
		
	
		
		
		
	}//main종료
}//class종료
class Over{
	//생성자는 이름이 class랑 똑같아야 하기 때문에 오버로드하지 않으면 여러개를 만들 수 없다.
	//*X5,000,000
	String num;
	Over(){
		num="영";
		System.out.println("필드값이 영인 객체를 생성했습니다.");
	}
	Over(int a){
		if(a>0) {
			num="양수";
			System.out.println("필드값이 양수인 객체를 생성했습니다.");
			
		}else if(a<0) {
			num="음수";
			System.out.println("필드값이 음수인 객체를 생성했습니다.");
		}
	}
	Over(String a){
		num=a;
		System.out.println("필드값이 "+num+"인 객체를 생성했습니다.");
	}
	
}//Over class종료
class Test{
	//메서드 오버로드 : 같은 이름을 가진 메서드를 매개변수의 차이를 이용해서 다르게 동작시킴
	//*X5,000,000 : 생성자 오버로드, 메서드 오버라이드와 구별
	void run() {
		System.out.println("런이 실행되었습니다.");//객체가 있어야 동작할 수 있다.객체만들기==객체조립하기
	}//리턴타입void종료
	void run(int a) {
		System.out.println("int데이터를 매개로 받는 런이 실행되었습니다.");
	}
	void run(String b) {
		System.out.println("String데이터를 매개로 받는 런이 실행되었습니다.");
	}
	void run(int a, String b) {
		System.out.println("int, String 받는 런이 실행!!");
	}
	//매개변수의 순서만 다르게 해도 오버로드가 적용된다.
	void run(String a, int b) {
		System.out.println("String, int 받는 런이 실행!!");
	}
	void run(boolean a) {
		System.out.println("boolean받은 런이 실행");
	}
	void run(String a, String b, String c) {
		System.out.println("String 3개를 받은 런이 실행");
	}
	
	
}//Test class종료
