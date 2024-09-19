package method;

public class Sample1 {
	public static void main(String[] args) {
		TV 티비1=new TV();
		티비1.전원();
		티비1.전원();
		System.out.println(티비1.상태);
		티비1.채널변경(25);
		티비1.채널변경();
//		티비1.방송국2(5);
		System.out.println(티비1.채널);
	}//main종료
}//class종료

//메서드
class TV{
	int 일련번호;
	String 색상;
	int 가격;
	int 채널;
	boolean 상태=false;
	
	void 전원() {
		//TV객체의 상태값을 반전시킨다.처음만들면 꺼진 상태로 출고된다.
		상태=!상태;
		if(상태==true) {
			System.out.println("전원이 켜졌음. 화면나옴");
			
		}else {
			System.out.println("전원이 꺼졌음. 화면 안나옴");
		}
		
	}//전원 메서드 종료
	
	//1. 0번 채널에서 시작해서 하나씩 채널이 증가하는 메서드
	//2. 10번 채널에서 증가하면 0번으로 돌가아는 기능 추가
	//3. 채널을 입력받아서 해당 채널로 이동하는 기능 추가
	
//	void 방송국() {
////		int 채널=0;
//		for(채널=0; 채널<=10; 채널++) {
//			System.out.print(채널+"\t");
//		}
//		System.out.println();
//		for(채널=10; 채널>=0; 채널--) {
//			System.out.print(채널+"\t");
//		}
//		System.out.println();
//	}//채널메서드종료
//	
//	void 방송국2(int 채널) {
//		if(채널==채널) {
//			System.out.println("채널"+채널+"로 이동");
//		}
//		
//	}//채널매개변수메서드종료
	
	void 채널변경() {
		채널++;
		if(채널>=11) {
			채널=0;
		}
	}//채널변경메서드종료
	
	void 채널변경(int a) {
		채널=a;

	}
	
	
}//tv class종료