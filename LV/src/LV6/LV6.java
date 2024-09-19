package LV6;

public class LV6 {
	public static void main(String[] args) {
		
		/*for(int b=0; b<10; b++) {
			for(int i=2; i<10; i++) {
				if(b==0) {
					System.out.print("<<"+i+">>단 \t");
				}else {
					System.out.print(i+"*"+b+"="+(i*b)+"\t");
				}
				
			}
			System.out.println( );
		}*/
		
		
		//구구단 만들기
		int i=2;
		int k=1;
		
		for(i=2; i<10; i++) {
			System.out.println("<<"+i+">>단");
			for(k=1; k<10; k++) {
				System.out.println(i+"X"+k+"="+(i*k));
			}
		}
		
		
	}//main종료
}//class종료
