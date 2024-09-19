package esc;

public class sample1 {
	//메인 메서드
	public static void main(String[] args) {
		//이스케이프 문자
		//명령 기호로 사용되는 문자 또는 표기가 어려운 문자를 
		//\역슬러시를 이용하여 표현하는 방법 
		//*X5,000,000 : 본인 프로그램 만드실때 필요할꺼임
		//\t : 탭키, 문자의 길이에 따라 적당히 거리를 벌려주는 문자
		//\n : 엔터키, 문자열 사이에 줄바꿈을 해주는 기능
		
		System.out.println("쌍따옴표\"는 꼭 쌍을 맞춰야 한다.");
		System.out.println("문자열은 \"이렇게\"표현해야 한다.");
		System.out.println("\t탭키");
		System.out.println("이영준"+"\t"+"102"+"\t"+"서울특별시");
		System.out.println("영준"+"\t"+"1020"+"\t"+"부산");
		System.out.println("영준\t1020\t부산");
		
		System.out.println("동해물과\n백두산이\n마르고\t닳도록");
		
		System.out.print("일반 print는 \n");
		System.out.print("줄바꿈이 이루어지지 않습니다.");
		
	}//main종료
}//class종료
