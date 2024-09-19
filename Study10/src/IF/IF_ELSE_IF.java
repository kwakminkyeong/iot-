package IF;

public class IF_ELSE_IF {
	public static void main(String[] args) {
		//if-else-if문 : 조건이 여러개인 if문
		//*X5,000,000 if문들 중에서 가장 중요
		//동시에 실행될 수 없다.
		//조건은 위에서부터 순서대로 보기때문에 조건의 범위설정 시 주의해야한다. 표현범위에 대해서 숙지를하고 사용한다.범위는 작은것부터 점차적으로 크게 잡는다.
		//조건은 포함 범위가 작은것부터 순서대로 나열되는 것이 오류를 막을 수 있다.
		/*if(조건1) {
			조건1이 참일 경우 수행할 문장;
		}else if(조건2) {
			조건1이 거짓이고 조건2가 참일 경우 수행할 문장;
		}else if(조건3) {
			조건1과 조건2가 거짓이고 조건3이 참일 경우 수행할 문장;
		}else{
			위의 모든 조건이 거짓일 경우 수행할 문장;
		}
		*/
		
		int num=-10;
		
		if(num>7) {
			System.out.println("num은 7보다 큽니다");
		}else if(num>5){
			System.out.println("num은 5보다 큽니다");
		}else if(num>0) {
			System.out.println("num은 0보다 큽니다");
		}else {
			System.out.println("모든 조건이 거짓입니다");
			
		}
		//if문 종료
	} //메인종료
}//클래스종료
