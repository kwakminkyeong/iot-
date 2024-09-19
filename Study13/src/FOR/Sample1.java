package FOR;

public class Sample1 {
	public static void main(String[] args) {
		//for문 : 특정 동작을 반복하여 수행하도록 하는 문법
		//*X5,000,000
		/*
		  iterator의 약자인 i를 주로 사용한다.(데이터를 읽는 기준처리기)
		  for(시작점; 조건; 증감식) {
			
		}*/
		int i=3;
		for(i=3; i<=9; i++) { //컴퓨터가 for문을 만나면 이름이i인 상자를 만들어 0을놓고 i<3 조건을 보고 System.out.println를 실행하고 i++로 간다.
			
			System.out.println("반복중..."+i);
		}
		System.out.println("반복종료: "+i);
	}

}
