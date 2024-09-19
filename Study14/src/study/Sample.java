package study;

public class Sample {
	public static void main(String[] args) {
		int number=0;
		if(number>20) {
			System.out.println("조건1이 참일 경우 실행되는 부분"); //단점은 만들려고하는 서비스를 연상해서 실제 서비스와 연관시켜야한다. if문은 실행할지 말지를 결정할 때 사용한다.
		}else if(number>15){
			System.out.println("조건1과 거짓이고 조건2이 참일 경우 실행");
		}else if(number>10) {
			System.out.println("조건1과 2가 거짓이고 조건3이 참일 경우 실행");
		}else {
			System.out.println("위에 나온 모든 조건에 거짓일 경우 실행");
		}//if end
		
		
		
		/*
		switch(number) {
			case 10 : break;
		}
		*/ //switch end
		
		for(int i=0; i<5; i++) {
			System.out.println("반복중....");
			System.out.println("이것도 반복중...."+i);
		}//for end
		System.out.println("이 분분은 for문이 종료된 이후에 실행");
			
		System.out.println("*");
		System.out.println("**");	
		System.out.println("***");	
		System.out.println("****");	
		System.out.println("*****");
		
		String star="*";
		for(int a=0; a<5; a++) {
			System.out.println(star);
			star+="*";
		}
			
			
	}//main end
	
	
}//class end
