package test;

public class Sample {
	public static void main(String[] args) {
		//각 변수마다 데이터를 하나씩 넣어보세
		boolean a; //*X5,000,000 :  true, false 
		a=true;
				
		char b; //글자 한글자 들어가는 아주 작은 상자이다. ' ' 단따옴표로 표기해주어야 함. 단따옴표 없이 숫자만 넣으면 유니코드 아스키코드로 문자를 출력하게 된다.
		b='안';
		
		byte c;
		c=127;
		
		short d;
		d=1270;
		
		int e; //*X5,000,000
		e=21000000;
		
		long f;
		f=21000000000L;
		
		float g;
		g=3.14f;
				
		double h; //*X5,000,000
		h=556.22222;
		String i; //*X5,000,000 : " "로 표기해주어야 함
		i="안녕하세요";
		
		
		
		System.out.println(a+", "+b);
		
	}

}
