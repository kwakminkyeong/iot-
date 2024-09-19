package study;

public class WHILE {
	public static void main(String[] args) {
		//반복문 while : for문처럼 반복을 수행하는 문법 
		//while문을 의도한대로 사용하기 위해서는 기준점과 증가식을 따로 넣어주어야 한다.
		/*while(조건) { 
			반복시 수행 할 문장;
		}
		*/  //조건이 하나만 들어간다.
		int i=0;
		while(i<3){
			System.out.println("반복중..."+i);
			i++;
		}//while end
		System.out.println("반복종료 : "+i); //반복종료도 꼭 생각한다. 프로그램이 복잡해지면 머리로 계산하는게 빠르다. 상상력 중요!! 재빌드없이 원하는 코드를 머리로 제작한다. 두뇌를 써라
	
		int a=0;
		do {
			System.out.println("반복중...."+a);
			a++;
		}while(3>a);
		System.out.println("반복종료 : "+a);
		//do-while : 조건이 거짓일지라도 한번은 무조건 반복하게 하는 반복문
		
		int b=0;
		System.out.println("반복중..."+b);
		b++;
		while(b<3){
			System.out.println("반복중..."+b);
			b++;
		}//while end
		System.out.println("반복종료 : "+b);
	
	}//main end

}//class end
