package CLASS;

public class Start {
	public static void main(String[] args) {
		//class명 이름; class가 조립된 객체가 들어갈 수 있는 크기의 변수제작
//		Sample s;//Sample이 들어갈 수 있는 상자를 만들어 달라. 기본적으로 만들어져 있는게 아니라 블랙문자. 외부 클래스가 있을때만 실행한다.
//		new Sample();//Sample 설계도를 객체로 조립해 달라. 컴퓨터와 소통하려면 변수에 넣어야한다.
		
		Sample s1= new Sample(); 
		Sample s2= new Sample();
		s1.gold=10000;
		System.out.println(s1.gold);
		System.out.println(s1.name);// 필드라고 한다
		
		System.out.println(s2.gold);
		System.out.println(s2.name);
		
		//System.out.println(Sample.name);
		//아직 설계단위이기 때문에 객체가 아니라서 사용이 불가능하다.
	}//main종료
	
}//class종료

//class는  class 이름{}으로 제작할 수 있다. class가 끝난 외부에 만든다.
class Sample{
	//클래스 : 설계도, 객체로 조립하지 않으면 사용할 수 없다.
	//클래스는 필드, 메서드, 생성자를 가질 수 있다. *X5,000,000
	
	//필드 : 객체의 속성을 담을 수 있는 공간, 다른 객체와 비교를 위한 데이터를 담는다. 구별할 수 있는 기준 속성값을 넣는다.
	//메서드 : 객체가 수행할 수 있는 동작
	//생성자 : 객체를 조립하는 방식
	int gold=5000; // 구조코드
	String name="이영준";
}
