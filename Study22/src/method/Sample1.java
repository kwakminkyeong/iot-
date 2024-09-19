package method;

public class Sample1 {
	public static void main(String[] args) {
//		new Test().run(); //한번만 화면을 띄우고 더이상 사용하지 않을 경우 사용한다.재이용이 안되니 좋은 방식은 아니다. 필드값까지 휘발되어 자바를 쓰는 이유가 없어진다.
		Test t;
//		t=new Test();
		t=new Test("다르네");
		
//		t.run("매개변수와 같은 타입의 데이터를 받아야 실행된다.",365);
		t.check();
//		t.run();
		/*new Test().run("아무거나");
		new Test().check();*/
//		위 아래는 서로 다른객체가 된다
		
	}//main종료
}//class종료

class Test{
	//매개변수 : 동작을 수행할 때 특정 데이터를 제공해야 동작하도록 하는 방법
	//매개변수가 있는 경우 해당 매개변수와 동일한 타입의 데이터를 제공해야 동작한다.
	//매개변수는 여러개를 둘 수 있지만 순서와 갯수를 지켜야 한다.
	//매개변수를 이용해 얻은 데이터는 메소드의 종료와 동시에 사라지므로
	//다른 부분에서 사용하기 위해서는 필드를 제작하여 저장해야 한다.
	
	String data; //전역변수
	
	void run(String a, int b) {//지역변수
		System.out.println("run()이 실행되었습니다.");
		System.out.println("매개변수로 받은 데이터 : "+a);
		data=a;
	}
	void check() {
		System.out.println("check()에서 확인한 데이터 : "+data);//필드로 만들어 이관처리를 해줘야한다.
	}
	//메서드 오버로드 : 이름이 똑같은 메서드를 매개변수의 차이로 다르게 사용하는 방법
	void run() {
		System.out.println("매개변수 없는 run()입니다.");
	}
	
	//생성자 : 클래스를 객체로 조립하는 기능
	//       리턴타입이 없고 [이름이 클래스와 똑같은] 메서드의 형태를 띄고 있다.*
	//       무조건 1회만 객체가 생성될 떄 실행된다.*
	//       따로 만들기 않아도 클래스 내부에 미리 안보이게 작성되어 있다.
	//       다른 기능을 추가하려면 별도로 한번 적어줘야 한다.
	//       생성자를 여러개 두는 방법은 오버로드가 유일하다.*X5,000,000
	Test() {
		System.out.println("생성자가 객체를 조립합니다.");
	}//생성자 test종료
	Test(String s){
		System.out.println("다른 방식으로 객체를 조립합니다.");
		data=s;
	}
}//Test class종료