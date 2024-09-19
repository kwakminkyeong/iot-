package input;

/*import java.io.BufferedReader; //BufferedReader 설계도를 가져오라는 명령
import java.io.InputStreamReader; //InputStreamReader 설계도를 가져오라는 명령
import java.io.IOException;*/
 
import java.io.*; //모든 설계도를 가져오라는 명령

public class Sample1 {
	public static void main(String[] args) throws IOException {
		//외부입력

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //BufferedReader 설계도가 들어갈 수 있는 변수를 만들어서 설계도를 조립하여 상자에 넣어달라 인스턴스를 객체로 조립하라 (부품)생성자의 매개변수
		System.out.println("성함을 입력해주세요");
		String name; //이름이 name 상자를 만들어라
		name=br.readLine();//데이터를 입력할 수 있도록 동작을 정지시킨다.
		System.out.println("입력받은 내용: "+name);
	}

}
