package method;

public class Sample2 {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		//객체란 설계도가 조립된 결과물(제품)
		Exam a=new Exam();  //이후 a를 객체라고 부른다
		a.run(); //설계도에 작성되어 있는 객체 a안에 있는 run을 동작 시켜 주세요.
		
	}//main종료
}//class종료

//이름이 Exam인 클래스를 제작해 보세요.
//리턴타입이 void이고 이름이 run인 메서드를 제작해 보세요
//public static void main내부에서 run()메서드를 실행시켜보세요.
class Exam{
	
	/* 메서드 제작법 :  리턴타입 이름(){}   */
	//메서드란 설계도에 작성되어 객체가 수행하는 동작이다.
	//그동안 배워온 제어문(if, for, while, switch)은 메서드 내부에서만 사용 가능하다.
	void run( ) {
		
		for(int i=1; i<=10; i++) {
			System.out.print(i +"\t");
		}
		
		//메서드를 실행 시 "안녕하세요"를 출력하도록 제작해 보세요
		System.out.println("\n"+"안녕하세요" ); //메인 a.run();실행 후 프린트할 수 있다.
		
	}//메서드 종료
	
}//Exam 클래스 종료

//java는 컴퓨터와 소통하기 위한 언어다.
//클래스 : 클래스는 설계도다. 동작을 수행할 수 없다. -> 조립하지 않으면 쓸 수 없다. 조립된 결과물이 객체(object)라 한다.
//메서드(동작)은 클래스(설계도)에 적혀있지만 실행은 조립된 객체(결과물)이 해야 한다.
//객체는 new 생성자() 만들 수 있지만 컴퓨터와 소통하기 위해서는 변수에 담아야 한다. 객체를 담을 변수의 크기가 중요하다.
//객체를 담기 위한 변수는 그 크기 자리에 클래스명을 적어서 크기를 특정한다.
//Exam abc;
//abc=new Exam();



