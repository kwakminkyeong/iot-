package number;

public class Number {
	public static void main(String[] args) {
		//byte : 바이트, 아주 작은 수만 저장할 수 있는 규격
		byte b; 
		b=12; //-128~127까지만 넣을 수 있다.
		System.out.println(b);
		
		//short : 숏, 짧은 수만 저장할 수 있는 규격
		short s;
		s=10000; //중간 정도의 수만 들어간다
		System.out.println(s);
		
		//int : 인티저, 일상적으로 사용하는 대부분의 수를 저장할 수 있는 규격
		int i;
		i=5000000; //+-21억까지 들어간다
		System.out.println(i);
		
		//long : 롱, 긴 수를 저장할 수 있는 규격. 이보다 큰 수를 넣기위해서는 따로 만들어서 사용한다
		long m;
		m=92237203685477580L; //맨 끝에 L자를 넣어준다.숫자가 너무 길어서 제일 뒤에 긴숫자임을 표시하는 소문자 또는 대문자 L을 붙여준다. 
		System.out.println(m);
	}

}
