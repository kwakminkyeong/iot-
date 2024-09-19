package study;

public class exam {
	public static void main(String[] args) {
		//1~100까지 반복하는 for문을 만들어 보세요
		//그 중에서 짝수만 출력해 보세요
		//짝수 중에서 30~40까지만 출력
		//3의 배수만 출력
		//369 출력 짝이라고 출력
		
		for(int a=1; a<=100; a++) {
			System.out.println(++a);
		}//for end 짝수만 출력
		
		for(int b=2; b<=100; b++) {
			System.out.println(b++);
		}//for end 짝수만 출력
		
		for(int c=30; c<=40; c++) {
			System.out.println(c);
		}//for end 30~40만 출력
		
		for(int d=0; d<27; d++) {
			d+=3;
			System.out.println(d);
			d-=1;
		}//for end 3의배수 출력
		
		String hand="짝";
		
		for(int a=0; a<100; a++) {
				if(a==3 || a==13 ||a==23 ||a==33) {
					System.out.println(a+ " : "+hand);
				}
				
			
			
			
			
		}//for end 369 짝
		
	}//main method end
}//class end
