package method;

public class Sample6 {
	public static void main(String[] args) {
		//Calc내부에 숫자 두개(150,250)를 받아 더하는 메서드를 제작하고
		//그 결과를 출력하시오
		Calc c=new Calc();
		c.sum(150,250);
		int result=c.plus(150,250);
		System.out.println("두번째 방법의 결과"+result);
		c.duhagi(150,250);
		//실행되면 1~100까지 출력하도록 메서드를 제작하시오
		c.bbag(50,90);
		
		
		
	}//main종료
}//class종료


class Calc{
	/*리턴타입 이름() {
		
	}
	*/
	int first;
	int second;
	
	void sum(int a, int b) {
		System.out.println("결과는"+(a+b));
	}
	
	int plus(int num1, int num2) {
		return num1+num2;
	}
	
	void duhagi(int x, int y) {
		first=x;
		second=y;
		System.out.println(first+second);
	}
	
	void bbag(int a, int b) {
		for(int i=50; i<=90; i++) {
			System.out.println(i);
		}
		
	}
	
}//Calc종료