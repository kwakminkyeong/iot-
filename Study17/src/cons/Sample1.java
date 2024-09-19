package cons;

public class Sample1 {
	public static void main(String[] args) {
		Test a=new Test("홍길도",150 ); //Test();--->생성자, 컴퓨터 안에 자동으로 있다
		Test b=new Test("이영준",300);  //무조건 데이터를 넣어야한다. 유령데이터의 발생을 막는다.
		
		
		
	}//main종료
}//class종료

class Test{
	//클래스는 필드, 메서드, 생성자를 가질 수 있다.
	//필드 : 변수로 제작되어 객체가 데이터를 저장해둘 수 있는 공간
	//메서드 : 클래스 내부에 작성되어 객체가 수행하는 '동작'
	//생성자 : 클래스를 객체로 조립하는 '동작'
	//		 따로 제작하지 않아도 클래스 내부에 안보이게 자동으로 제작되어 있다.
	//		 다른 기능을 추가하거나 별도의 조립방법을 추가하기 위해서는 따로 명시해야 한다.
	//		 객체를 조립하면서 필드의 데이터를 바로 입력하는 기능 등을 수행한다.->객체의 초기화 초기값을 지정하는 역할
	//*X5,000,000
	//		[객체가 조립될 때 무조건 단 한번만 실행됨]		
    //		[리턴타입이 없고 클래스와 이름이 똑같은 메서드의 형태로 제작된다.]
	
	/*클래스와 같은 이름(){
		
	}
	*/
	String name;
	int number;
	
	Test(String a, int b){//매개변수가 생겼다는 것은 별도의 조립방법을 추가한것이다.
		//생성자
		name=a;
		number=b;//초기값을 지정하는 역할
		System.out.println(name+" 객체가 생성되었습니다.");
	}//생성자종료 객체를 조립한다. 데이터베이스커넥션에서 사용됨
	

}