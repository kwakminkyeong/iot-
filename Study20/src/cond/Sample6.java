package cond;

public class Sample6 {
	public static void main(String[] args) {
		//제어문
		//조건문 *if
		//분기문 switch
		//반복문 *for, while
		
		//if : 조건에 따라 {}내부를 실행할지 말지를 결정하는 문법
		//if-else : 조건에 따라if{}를 실행할지 else{}를 실행할지 결정하는 문법
		//if-else if : 여러 조건을 '순서대로' 확인하여 실행할 부분을 결정
		//             조건의 순서때문에 좁은 범위부터 나열해야 함
		int a=3;
		int b=5;
		
		/*if(a==b){
			System.out.println("조건이 참이므로 실행");
			System.out.println("조건만 맞으면 몇개든 실행");
			
		}//if종료
		else {
			System.out.println("조건이 거짓이므로 실행");
		}//else종료
		System.out.println("{}를 멋어난 부분은 if와 무관하게 실행");
		*/
		
		if(a>=3){ //조건의 범위가 크기때문에 아래조건은 실행되지 않는다.
			System.out.println("a가 3보다 큽니다");
			
		}//if종료
		else if(a>=5){
			System.out.println("a가 5보다 큽니다");
		}
		else if(a>=10){
			System.out.println("a가 10보다 큽니다");
		}
		else {
			System.out.println("모든 조건이 거짓입니다.");
		}//else종료
		System.out.println("{}를 멋어난 부분은 if와 무관하게 실행");
		
		//1. switch는 하나만 골라서 실행하는 기능이 아니다.
		//2. ()안에는 변수명이 들어간다.
		
		a=5;
		switch(a) {
			case 2:System.out.println("2번 분기 사용");break;
			case 3:System.out.println("3번 분기 사용");break;
			case 4:System.out.println("4번 분기 사용");break;
			default : System.out.println("해당하는 분기 없음");
	
		}//switch종료
		
	}//main종료
}//class종료
