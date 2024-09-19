package review;

public class LV4 {
	public static void main(String[] args) {
		//다음의 모양이 출력되도록 작성하시오
		
		
		
		for(int i=10; i>0; i--) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}//오른쪽공백 종료
			for(int j=i; j>0; j--) {
				
				System.out.print("*");
				for(j=1; j>i; j++) {
					System.out.print(" ");
				}//왼쪽공백종료
			}//* 종료
			
			System.out.println();
		}//forend
		
		
	
		
	}//mainend
}//classend
