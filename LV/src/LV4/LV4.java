package LV4;

public class LV4 {
	public static void main(String[] args) {
		//1에서 10까지를 출력하는 for문을 작성하시오
		
		
	

		/*for(int i=1; i<=10; i++) {
			
			System.out.println("*");
		}
		
		for(int j=10; j>=1; j--) {
			System.out.println(" *");
		}*/
		
		
		for(int i=0; i<10; i++) {
			for(int a=0; a<9-i; a++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		
		
	}
}
