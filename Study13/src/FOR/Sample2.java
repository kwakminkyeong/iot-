package FOR;

public class Sample2 {
	public static void main(String[] args) {
		//1~10까지 반복하는 for문을 만들어 출력하시오
		//이중에 홀수만 출력하시오
	
		for(int i=1; i<=10; i++) {
			
			if(i==3) {
				
				continue;
			}
			
			System.out.println(i);
		}//for문 종료
		System.out.println("for문 외부");
	}//main종료
}//classe end

