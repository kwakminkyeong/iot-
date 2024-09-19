package fin;

public class Fin {
	public static void main(String[] args) {
		//상수는 그 값을 변경할 수 없다. 시리얼넘버 같은 것들
		//변수 : 내부의 데이터를 변경할 수 있는 상자
		//상수 : 내부의 테이터를 변경할 수 없는 상자
		//상수는 final 타입 이름; 을 통하여 제작할 수 있다.
		int a;
		a=3;
		a=5;
		
		final int b; //final을 붙여서 상수로 표현한다
		b=3;
		//b=5;
		
		//덧셈
		System.out.println(10+20);
		System.out.println("가"+(20+30));
	}

}
