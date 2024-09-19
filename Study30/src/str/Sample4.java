package str;

import java.io.*;
import java.util.*;

public class Sample4 {
	public static void main(String[] args) /*throws IOException /*try catch*/ {
		/*InputStreamReader isr=new InputStreamReader(System.in); //파스칼코드 클래스
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //매개변수를 받는 생성자 파일업로드로 받아서 읽어서 시스템에 반영하는것.
		System.out.println("문자열을 입력해 주세요");
		String msg=br.readLine();
		System.out.println(msg);
		*/
		
		//Scanner sc=new Scanner(System.in);
		//String data=sc.next();
		
		StringBuffer sb=new StringBuffer("기본값"); 	//기본값
		sb.append("추가데이터"); 						//append추가 => 기본값추가데이터
		sb.deleteCharAt(3);							//deleteCharAt(3) 배열 3번째 글을 제거 => 기본값가데이터
		sb.insert(5, "반갑습니다.");                   //5번째에 반갑습니다를 삽입 => 기본값가데반갑습니다.이터
		sb.replace(3, 8, "교체");						//3번째에서 8번째 앞에까지 교체=>기본값교체니다.이터
		sb.reverse();								//터이.다니체교값본기
		int size=sb.length();
		System.out.println(sb);
		
	}//main 종료
}//class 종료

//StringBuffer :글자를 원본으로 유지해주는 기능
//문자열에 값을 더하거나 빼기 편리하게 구현된 String객체
//StringBuffer.append(String) : 뒤쪽에 문자열을 추가
//StringBuffer.deleteCharAt(int):해당 순번의 문자를 제거
//StringBuffer.insert(int, String) : 해당 순번에 해당 문자열을 추가
//StringBuffer.length() : 현재 버퍼 내부에 존재하는 문자열의 길이를 반환 return int
//StringBuffer.reverse() : 해당문자열을 거꾸로 변환
//StringBuffer.replace(int, int, String) : 해당 순번의 문자열을 교체
