package cha;

public class Cha {
	public static void main(String[] args) {
		//char : 케릭터, 한개의 문자를 저장할 수 있는 규격
		char c;
		c='가'; //' '사람이 쓰는 문자임을 알려주기 위해 단따옴표를 사용한다. 문자는 1개만 들어간다.
		System.out.println(c);
		char d='안'; //단따옴표
		char e='녕';
		char f='하';
		char g='세';
		char h='요';
		System.out.print(d);  //ln을 빼서 나란히 적힌다. 
		System.out.print(e);
		System.out.print(f);
		System.out.println(g);//ln은 출력 후 줄바꿈 기능
		System.out.print(h);
		
		
		//***String : 스트링, 여러개의 문자(문자열)를 저장할 수 있는 규격
		String s;
		s="반갑습니다."; //String 선언을 할때는 쌍따옴표를 넣는다.
		System.out.println(s);
	}

}
