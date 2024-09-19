package review;

public class LV6 {
	public static void main(String[] args) {
		//구구단을 다음의 모양으로 출력하시오
		int i=1;
		int j=1;
		
		for(i=2; i<10; i++) {
			System.out.print("<<"+i+">>단	");
			
		}
		System.out.println();
		for(i=1; i<10; i++) {
			for(j=2; j<10; j++){
				int result=j*i;
				System.out.print(j+"x"+i+"="+result+"\t");
				
			}
			System.out.println();
		}
			
		
		
		
	}
}
