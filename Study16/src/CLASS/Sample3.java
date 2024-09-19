package CLASS;

public class Sample3 {
	public static void main(String[] args) {
		//메인메서드: static때문에 동작만 하고 있다
		Car c=new Car();
		System.out.println(c.number);//빈상자를 출력하면 0이나온다
		c.name="이영준";
		System.out.println(c.name);
		System.out.println(c.error);
		//객체는 형상을 갖추고 있어야 하기 때문에
		//필드 내부에 아무 데이터를 넣지 않아도 가장 0에 가까운 기본값을 가진다.
		//run(); 앞에 아무것도 없어서 동작하지 않음
		c.run();
		int a=c.test();
		//리턴타입이 있는 메서드의 경우 return값과 리턴타입, 데이터를 담을 변수타입
		//모두가 일치해야 한다.
		System.out.println(a);
		
		
		
	}//main 종료
}//class종료


class Car{
	//필드==변수
	int number; //값이 들어간채 만들어지면 곤란한 상황들이 있다 그래서 빈상자로 만들어달라
	String name;
	boolean error;
	
	//메서드 : 클래스(설계도) 내부에 작성되어 객체가 수행하는 동작. 설계도를 먼저 조립되어야한다.
	/*
	리턴타입 메서드이름(정의) {
		동작수행시 실행할 내용;
	}
	*/
	//리턴타입 : 동작을 수행한 이후 반환할 결과물의 규격
	//        void : 아무것도 반환하지 않는 경우
	//        void가 아닌 리턴타입 : 수행 이후 해당 타입의 데이터를 반환
	//							return 뒤에 돌려줄 데이터를 적어야한다.
	void run() { //메서드. 컴퓨터와 사람이 약속하는 말. 합의는 됐으나 아무것도 없다
		int data; //변수
		System.out.println("차량이 주행합니다.");
	}//void 메서드 끝
	
	
	int test() {                  //void가 아니면 에러 뭘 가져올지 정확하게 짚어줘야한다. 뭘 가져올지를 같이 적어줘야한다. 숫자를 돌려주는 동작이다.
		System.out.println("test()동작이 실행되었습니다.");
//		int[] arr= {100,200}; //return 값이 여러개일때 배열로 만들어 준다
		return 100;				  // 돌려줘야하는 값을 넣어줘야한다. 타입이 맞지않으면 오류가 난다.
		//System.out.println("test()동작이 끝났습니다."); 숫자를 돌려주는 것이 목적이다.할일 다했으니 더이상 할 일이 없으므로 애러가 뜬다.
		//메서트에서 return이 등장하면 그 이후로는 다른 명령을 내릴 수 없다.
		
	 }// test 메서드 끝
	//System.out.println();//실행될 시점이 없어서 못한다고 에러가 난다
	
}//Car class 종료
