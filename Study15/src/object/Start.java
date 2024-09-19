package object;

public class Start {
	public static void main(String[] args) {
		
		Student a;
		a=new Student();
		
		a.number=1;
		a.name="이영준";
		a.address="서울시";
		a.math=50;
		a.eng=70;
		System.out.println(a.name+","+a.address);
		
		Student b=new Student();
		
		b.number=2;
		b.name="고희선";
		b.address="서울시";
		b.math=80;
		b.eng=70;
		System.out.println(b.name+","+b.address);  //같은구조로 같은 설계도로 만들지만 객체가 다르게 들어간다
		
		a.study();
		b.study();
		
		int result=a.test();
		b.test();
		System.out.println(result);
		
	}//main 종료
}//class 종료

class Student{
	//필드(field) : 객체가 가질 수 있는 속성정보로 다른 객체와 구별을 위해 사용 , 객체마다 필드의 내용은 다른값과 같은값을 가질 수 있다.
	int number;     //학번, 기준 1번부터 시작합니다. 2023.09.19 이영준제작_왜 만들었는지 모르겠으면 연락하라는 표시
	String name;    //이름, 동명이인 주의
	String address; //주소
	int math;       //수학점수
	int eng;        //영어점수
	
	//private int number; 의도하지 않은 방법으로 개발하지 않도록
	//public int number; 공개된 public static void main
	
	//메서드(method) : 객체가 수행할 수 있는 동작
	//설계도에 명시되어 객체가 수행하는 동작
	
	/*
	 리턴타입 이름() {실행시 수행할 문장;}
	 */
	 
	void study() {
		System.out.println(name+"이 공부를 합니다.");
	}
	int test() {
		return 10; //실행을 했으나 받지않음 .받을면 변수를 만들어주어야함 int result
	}
}//외부 class종료
