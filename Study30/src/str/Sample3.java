package str;

public class Sample3 {
	public static void main(String[] args) {
		String s="Hello, Java!";
		char c=s.charAt(11); //글자하나마다 0부터 숫자를 붙여놓았다.
		System.out.println(c);
		
		char[ ] arr=new char[12];
		for(int i=0; i<arr.length; i++ ) {
			arr[i]=s.charAt(i);
		}//배열에 String 내부 데이터를 입력하는 for문
		for(int a=arr.length-1; a>=0; a--) {
			System.out.print(arr[a]); 
		}//String내부에 저장된 배열 내부의 데이터를 콘솔창에 출력하는 for문
		System.out.println("");
		boolean b=s.startsWith("Hel");
		b=s.endsWith("a");
		b=s.equalsIgnoreCase("hello, java!");
		int i=s.indexOf("J");
		i=s.length();
		System.out.println(i);
		
		System.out.println(s);
		String msg=s.substring(1,8);
		msg=s.toLowerCase();//소문자로 만들기 위해서는 문자에 32를 더한값으로 아스키코드문자가 출력된다.if문을 사용해서 소문자 대문자를 구별한다.
		System.out.println(msg);
		msg=s.toUpperCase();
		System.out.println(msg);
		//substring의 번호는 해당 문자 앞에있는 커서를 기준으로 한다
		int number='가';
		System.out.println(number);
		number++;
		number++;
		char ch=(char)number; //강제변환
		System.out.println(ch);
	
		
		
	}//main종료
}//class종료
//String은 다른 사람이 만들어준 클래스이다.
//String객체는 메서드를 가지고 있다.
//String.charAt(int) : 특정 문자를 추출하는 기능 return char
//String.startsWith(String) : 문자열이 무엇으로 시작하는지 확인 return boolean
//String.endsWith(String) : 문자열이 무엇으로 끝나는지 확인 return boolean 한글검색용으로는 그렇게좋지 않다
//String.equalsIgnoreCase(String) : 대소문자 구별없이 비교 return boolean 한글서비스에서는 
									//equals 둘이똑같다 Ignore 무시핟 Case 문자를 소문자 대문자 처리를 할때 메소드 카멜기법
//String.indexOf(문자열): 해당 문자열이 최초로 등장하는 위치를 확인 return int 필터링.
//String.length() : 해당 문자열의 길이를 계산 return int 이터레이터
//String.substring(int, int) : 특정 위치의 문자열을 추출 return String 몇글자만 뽑아내는 용도로 사용된다.순번계산하는 방법. 인터넷 번역기 추출
//String.toLowerCase(): 해당 문자열을 전부 소문자로 변경
//String.toUpperCase(): 해당 문자열을 전부 대문자로 변경