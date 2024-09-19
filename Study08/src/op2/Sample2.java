package op2;

public class Sample2 {
	public static void main(String[] args) {
		//비트연산자 : 2진수를 통해서 결과값을 만들어내는 연산자.2진수로 변환하여 자릿수별로 예산하는 방법 
		// & : and, 두개가 모두 1이어야만 1
		// | : or, 두개 중 하나라도 1이면 1
		// ^ : xor(익스플루십 or, 둘이 서로 다르면 1
		//실개발에서 잘 사용하지 않는다, 다만 && ||와 혼동하면 안된다.
		int first=3;
		int second=5;
		int result;
		result=first ^ second;
		System.out.println(result);
		
		//시프트연산자 : 2진수로 변환하여 자릿수를 이동시키는 연산이다.
		// << : 2진수로 변환하여 자릿수를 우측 숫자만큼 증가시킨다. 
		// >> : 2진수로 변화하여 자릿수를 우측 숫자만큼 감소시킨다.
		//실개발에서 잘 사용하지 않는다, 다만 <와>와 혼동하면 안된다.
		first=3;
		second=2;
		result=first << second;
		System.out.println(result);
	}

}
