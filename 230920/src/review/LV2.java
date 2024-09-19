package review;

public class LV2 {
	public static void main(String[] args) {
		//다음 소스코드에서 잘못된 부분을 확인하시오.
		
		int num=20;
		if(/*조건;*/ num<30) {
			int num1=30; 
			num=40; //int num=40; 변수명 선언 중복
		}
		int num1=50; //num1=50; if문에서 선언한 변수명은 그 안에서 사라진다
		int num2=60;
		System.out.println(num1);
	}//mina 종료
}//class종료
