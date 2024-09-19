package op;

public class Sample1 {
	public static void main(String[] args) {
		//연산자 : 계산기호
		//단항연산자 : 계산할 때 항이 하나 필요한 연산자, 증감연산자
		//이항연산자 : 계산할 때 항이 두개 필요한 연산자, 나머지 
		//삼항연산자 : 계산할 때 항이 세개 필요한 연산자, 삼항연사자
		
		//대입연산자 : =, 왼쪽에다 오른쪽의 내용을 집어 넣는다.
		//연산 우선순위가 상당히 늦다.
		int a; //숫자가 들어가는 규격의 상자를 만들어라
		a=3; //임시저장소에 넣었다가 꺼내놓는다
		System.out.println("결과는 "+a+" 입니다."); //괄호안에 있는 변수를 콘솔에 적어줘
		
		//산술연산자 : 계산의 결과가 특정값으로 표현되는 연산자  논리연산자_true or false
		// + : 더하
		// - : 빼기
		// * : 곱하기
		// / : 나누기, int끼리의 나눗셈은 몫이 반환한다.
		// % : 나머지, 나누기가 이루어진 이후 나머지를 반환한다.
		
		int first=10;
		int second=3;
		int result;
		
		result=first % second; 
		System.out.print(result);
	}

}
