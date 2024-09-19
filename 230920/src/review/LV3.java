package review;

public class LV3 {
	public static void main(String[] args) {
		//해당 소스코드는 1~100까지의 수 중 홀수를 출력합니다.
		//다음 소스코드가 올바르게 동작하도록 수정해 주세요.
		int first=1;
		int last=100;
		
		for(int i=first; i<=last; i++) {
			if(i%2==1) {
				System.out.println(i+"는 홀수 입는다");
			}//if문 종료
			
		}//for문 종료
	}//main종료
}//class종료
