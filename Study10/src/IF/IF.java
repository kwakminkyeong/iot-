package IF;

public class IF {
	public static void main(String[] args) {
		//제어문 if : 조건에 따라 실행여부를 결정하는 문법
		//if(조건){실행할 문장;}
		//*X5,000,000
		//if가 조건을 통하여 실행을 결정하는 부분은 {}로 한정된다. {}를 벗어난 명령어는 if문과 상관없이 실행된다.
		//if문에 {}치지 않는다면 처음나오는 ;까지를 if의 범위로 본다.
		
		System.out.println("if보다 앞에서 실행");
		if(10>5) {//괄호안의 조건을 확인한다.
			System.out.println("조건이 참이므로 실행함");
			System.out.println("명령어가 몇개든 실행됨");
			
		} //if 종료     // 중괄호가 큰역할을 한다. 참일때 중괄호안의 내용을 실행한다.
		System.out.println("if종료 후 실행");
	}//main 종료

}//클래스종료
