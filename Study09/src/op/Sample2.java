package op;

public class Sample2 {
	public static void main(String[] args) {
		//단항연산자 : 항이 하나만 있어도 연산이 가능한 연산자
		
		//증감연산자 : 데이터를 한 단위 줄이거나 늘리는 용도로 사용, 문자에도 사용된다. 반복연산자에서 많이 사용된다
		//++ : 데이터를 한 단위 증가
		//-- : 데이터를 한 단위 감소
		
		//부정연산자 : true와 false를 반전
		//!
		int num=3;
		num--;
		
		System.out.println(num);
		
		boolean t=!true;
		System.out.println(t);
		
		//삼항연산자 : 항이 세개가 있어야 연산이 가능한 연산자 if문으로 대체한다
		// 조건?식1:식2
		int i; //숫자가 들어갈 수 있는 상자 i를 만들어달라
		String s; //문자열이 들어가는 s상자를 만들어라
		i=-10;
		s=(i>=0)?"양수":"음수"; //결과값을 s에 넣어준다.
		System.out.println(s);
	}

}
