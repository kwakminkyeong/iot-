package cond;

public class Sample7 {
	public static void main(String[] args) {
		
		/*for(int i=0; i<3; i++) {
			System.out.println(i);
		}//for 종료
		*/
		
		//while은 기준점, 조건, 변경식이 다 갖추어지지 않으면 무한반복의 우려가 있다.
		int a=0;
		while(a<3) {
			System.out.println(a);
			a++;
		}//while종료
	}//main종료
}//class종료
