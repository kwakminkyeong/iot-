package op;

public class Sample3 {
	public static void main(String[] args) {
		//증감연산자의 전위, 후위 차이점
		//증감연산자가 단독으로 사용될 경우에는 우선순위의 문제가 없음
		//증감연산자가 =과 결합될 경우 전위와 후위의 우선순위 문제가 발생. =와 결합하여 사용하지 않는다.
		
		//전위증감의 경우 증감연산자가 =보다 먼저 계산된다.
		//후위증감의 경우 증감연산자가 =보다 늦게 계산된다.
		int num=5;
		int result;
		result=num++;//후위 result=num++ : num을 집어넣고 ++해라
					//전위 result=++num : ++을하고 num을 집어 넣어라
		
					//num++; result=num;  ++을 =과 같이 사용하지 않는다.
		
		System.out.println(result);
		
		//증감대입 연산자
		// += : a+=b -> a=a+b
		// -= : a-=b -> a=a-b //혼동되지 않도록 주의
		// *= : a*=b -> a=a*b
		// /= : a/=b -> a=a/b
		// %= : a%=b -> a=a%b
		int a=10;
		a+=5;
		System.out.println(a);
		//-= : 
	}
}
