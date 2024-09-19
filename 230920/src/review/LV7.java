package review;

public class LV7 {
	public static void main(String[] args) {
		//다음을 만족하는 number를 찾으시오
		int number=1111;
		
		if(number>1000) {
			
			if(number%2==0) { //2의 배수가 아닌것
				
			}
			else if(number%3==0) {//3의배수가 아닌것
				
			}
			else if(number%5!=0) {//5의 배수가 아닌거
					if(number%7!=0) {//7의 배수가 아닌거
						if(number%11!=0 && number%13!=0) {
						//11의 배수도 아니고 13의 배수도 아닌 수
						}
						else {
						System.out.println(number);
					}
				}
			}
		}//첫번째 if문 종료
		
		
	}//main종료
}//class 종료
