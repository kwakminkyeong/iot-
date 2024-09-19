package IF;

public class IF_ELSE {
	public static void main(String[] args) {
		//조건문 if : 조건의 true/false여부에 따라 {}내부를 실행하지 말지 결정하는 문법
		//if-else : 조건의 true/false여부에 어떤 {} 내부를 실행할지 선별하는 문법
		//둘 다 실행되는 경우는 없고, 둘 다 실행되지 않는 경우도 없다.
		
		/*
		 if(조건){
		  	조건이 true일 때 수행될 내용;
		  }else{
		  	조건이 false일 때 수행될 내용;
		  }
		 */
		
		if(10>0 && 5<3) {
			System.out.println("조건이 참이므로 이부분이 실행됩니다.");
		}else {
			System.out.println("조건이 거짓이므로 이부분이 실행됩니다.");
		}
	}	
}
