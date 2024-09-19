package op;

public class Sample3 {
	public static void main(String[] args) {
		//단항연산자
		//이항연산자
		//삼항연산자
		
		//산술연산
		//논리연산 : 계산의 결과가 true 또는 false로만 나온다. 조건으로 사용
		
		//대입연산자 : 이항연산자
		int a=3; // = 대입연산자. 오른쪽껄 왼쪽에 얺어라
		
		//부정연산 : 단항연산자
		System.out.println(!true);  // ! 부정연산자
		
		//증감연산자
		a++; // =와 같이 나올때는 전위와 후위로 나뉜다
		
		//산술연산자
		int b= a+5;
		
		//비교연산자 :< > <=  >= == !=  논리연산이므로 int에 집어 넣을 수 없다
		boolean result=(a<=b);
		
		//논리연산자 : && ||
		result = true || false;
		
		//비트연산자 : & | ^ 산술연산 계산결과가 숫자로 나온다
		//시프트연산자 : >> << 논리연산 자릿수
		//삼항연산자 : ?:  조건?참일때:거짓일때  ==>if로 완전 대체 가능하다.
		result=(a>3) ? true:false;
		System.out.println(result);
		
	}//main종료
}//class종료