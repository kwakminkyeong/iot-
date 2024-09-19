package study;

public class Sample2 {
	public static void main(String[] args) {
		//중첩 for문
		//for문 사용시 기준점과 조건이 서로 다르면 무한반복의 위험이 있다.
		for(int i=0; i<3; i++) {
			System.out.println("외부 for문이 반복할때만 실행");//상상으로 생각한다
			for(int j=0; j<2; j++) {
				System.out.println("i="+i+", j="+j);
			}//내부for end
			System.out.println("외부 for문이 반복할때지만 내부 for문의 반복 종료");//상상으로 생각한다
		}//외부for end
	}//main end
}//class end
