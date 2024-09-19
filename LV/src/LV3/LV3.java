package LV3;

public class LV3 {
	public static void main(String[] args) {
		//산술연산자 +-*% 
		//산술연산자는 이항연산이므로 5%3 이런식으로 앞뒤에 뭐가 있어야 계산이 가능하다
		int num=10;
		System.out.println("이렇게"+num+"더합니다.");
		
		//해당 소스코드는 1~100가지의 수 중 홀수를 출력합니다.
		//다음 소스코드가 올바르게 동작하도록 수정해 주세요
		int first=1;
		int last=100;
		for (int i=first; i<=last; i++) {
			if(i%2==1) {
				System.out.println(i+"는 홀수 입니다.");
			}
		}
	}
}
