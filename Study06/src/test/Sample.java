package test;

public class Sample {
	public static void main(String[] abcd) { //시작점이므로 하나만 둔다.
		int number;
		number=1205;
		System.out.println(number);
		
		//변수(variable) : 속의 내용물을 언제든지 변경이 가능하다.
		
		Test t=new Test();
		t.make();
	}
}

class Test{
	void make() {
		int A;
		A=30;
	
		System.out.println(A);
	}
}