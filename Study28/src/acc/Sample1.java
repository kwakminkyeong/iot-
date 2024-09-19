package acc;

import exam.Product;

public class Sample1 {
	public static void main(String[] args) {//한개의 public class와 아래 일반 class
		//패키지가 다른 클래스를 사용하기 위해서는 
		//import 패키지명.클래스명; 을 해줘야 한다.
		Product p=new Product();
		//p.price=3000; default는 패키지가 다르면 사용할 수 없다
		p.name="조립식게임pc";
		//p.qty=20; protected는 상속, 패키지내부
		//p.seller="판매자"; geterseter를 달아서 사용한다.
		
		Student s=new Student();
		s.number=10;
		s.name="곽민경";
		s.math=30;
		//s.eng=40;
		s.setEng(40);
		Test t=new Test();
		t.def=10;
		t.pub=20;
		t.pro=30;
		//t.pri=40;
		
		
	}//main 종료
}//class 종료
//접근제한자 : 변수 앞에 특정요소에 접근할 수 있는 범위를 지정하는 문법
//접근제한자는 프로그램을 다른 용도로 사용할 수 없도록 제한하는 역할
//필드 또는 메서드에 사용범위를 지정하는 용도로 개발에 사용한다. 

//default : 아무 접근제한자도 적지 않은 상태
			//같은 패키지 내부에서 접근 가능
//public : 전체공개
			//같은 프로젝트 내부에서 접근 가능
//protected : 보호
			//같은 패키지 또는 상속관계에서 접근 가능
//private : 보안
			//같은 클래스 내부에서만 접근 가능
class Test{
	int def;
	public int pub;
	protected int pro;
	private int pri;
}