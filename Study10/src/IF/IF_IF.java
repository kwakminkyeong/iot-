package IF;

public class IF_IF {
	public static void main(String[] args) {
		//중첩 if문
		if(true) {
			if(false) {
				System.out.println("두 조건이 모두 만족하여 실행됨");
			}
			else {
				System.out.println("내부 조건이 거짓이므로 실행됨");
			}//내부 if문 종료
			System.out.println("외부 조건이 참이므로 실행됨");
		}
		else {
			System.out.println("외부 조건이 거짓이므로 실행됨");
		}//외부if문 종료
		
		
		int a=1;
		String b;
		b=(a>0)?"양수":"음수";
		System.out.println(b);
		
		if(a>0) {
			b="양수";
		}else {
			b="음수";
		}
		System.out.println(b);
		
	} //main 종료
} //클래스종료
