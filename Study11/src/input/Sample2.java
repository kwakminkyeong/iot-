package input;

import java.util.Scanner;

public class Sample2 {
	public static void main(String[] args) {
		//*X5,000,000
		//암기해두면 공부를 편하게 할 수 있다.
		Scanner sc=new Scanner(System.in);//이름이 sc 상자를 만든다. 설계도대로 조립을하며 Scanner에 들어갈 수 있게 만들어라//String s=new String(); 원래는 이래 생겼는데 String s로 사용된다
		System.out.println("성함을 입력하고 엔터키를 쳐주세요"); //사용자가 알 수 있도록 안내문을 꼭 설정한다.
		String name;
		name=sc.next();
		sc.close();
		System.out.println("입력받은 내용 : " +name);
	}

}
