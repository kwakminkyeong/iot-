package op4;

public class Sample4 {
	public static void main(String[] args) {
		//논리연산자 : true, false를 가지고 true 또는 false의 결과를 계산해내는 연산
		// && : and, 두 조건이 모두 true이면 true
		// || : or, 두 조건 중 하나라도 true이면 true
		//계산의 결과가 true 또는 false로 반환된다.
		
		boolean t=3 < 5; //참 또는 거짓만 들어갈 수 있는 상자를 만들어주고 3이 5보다 작냐 --> 참 
		boolean f=3 > 5; //참 또는 거지만 들어갈 수 있는 상자를 만들어주고 3이 5보다 크냐 --> 거짓
		boolean result;
		result= t || f;
		System.out.println(result);
		
		//{} : 블락, 설계도의(class)의 부분을 나누는 기능
		//블락 내부에서 생성된 변수는 블락 외부에서 사용할 수 없다.
		int test;
		{
		   // 이 안에서만 설계도를 만들 수 있다. 중괄호를 벗어나면 소멸한다
			int number;
		}
		test=10;
		
	}

}
