package SWITCH;

public class Sample2 {
	public static void main(String[] args) {
		//제어문 중 분기문이라고 부르는 switch
		//프로그램을 어디에서부터 실행시킬지 분기를 만드는 문법
		/*
		 switch(변수){
		 	case 값 : 수행할 문장;break;
		 	default: case중 해당하는 값이 없는 경우 실행할 문장;
		 }
		 */
		int score=99;
		switch(score){//분기만하지 선별을하지 않는다.멈추지않고 그 밑으로 모두 실행한다.
			case 98:case 99:case 100:System.out.println("100점 부분이 실행");break;
			case 200:System.out.println("200점 부분이 실행");break;//아래로 내려가는 속성을 멈춘다
			case 300:System.out.println("300점 부분이 실행");
			default:System.out.println("해당하는 값이 없습니다.");
		}//스위치종료
		if(score==100) {
			System.out.println("100점부분");
		}else if(score==200) {
			System.out.println("200점부분");
		}else {
			
		}//if종료
		
		//반복문 for
		//*X5,000,000
		/*
		 for(시작점; 조건; 증감){
		 	 반복할 문장;
		 }	 
		  */
		//반복문의 단위인 i는 iterator의 약자이다.
		for(int i=0; i<3; i++) {//포 반복 인터저 아이인 상자를 만들어서 참이면 실행한후 한단위 증가.거짓이면 종료
			System.out.println("반복중...");
		}//for문 종료
		
		
	}//메인종료 
}//클래스종료
