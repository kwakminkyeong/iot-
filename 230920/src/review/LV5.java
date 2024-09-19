package review;

public class LV5 {
	public static void main(String[] args) {
		//다음의 모양이 출력되도록 작성하시오
		for(int i=10; i>0; i--) {
			
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=10; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}//for문 종료
	}//main종료
}//class종료
