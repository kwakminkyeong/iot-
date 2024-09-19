package exam;

import java.util.Scanner;

public class Sample3 {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);

		/*System.out.println("학번을 입력해주세요");
		int number=sc.nextInt();
		
		System.out.println("이름을 입력해주세요");
		String name=sc.next();
		
		System.out.println("수학 점수를 입력해주세요");
		int math=sc.nextInt();
		
		System.out.println("영어 점수를 입력해주세요");
		int eng=sc.nextInt();
		
		System.out.println("국어 점수를 입력해주세요");
		int kor=sc.nextInt();
		*/
		Student s=new Student();
		s.sc=sca;
		s.input();
		System.out.println(s);
		
		
		/*Student c=new Student(300,"배한결",60,80,60);
		c.Test();
		c.Test(200, "곽민경");
		c.Test(100, 80, 75 );
		c.Test(300,"배한결",60,80,60);
		System.out.println("학번 : "+c.number+"\n이름 : "+ c.name+"\n수학 : " +c.math+"점\n영어 : " + c.eng+"점\n국어 : " +c.kor+"점");
		System.out.println(c);*/
		
		
		
//		sop("안녕하세요");
		
	
	}//main종료
/*	static void sop(String s) {
		System.out.println(s);
	}
	*/
	
}//class종료
//학생정보를 저장할 수 있는 객체를 만들려고 한다.
//학생은 학번, 이름, 수학점수, 영어점수, 국어점수를 가질 수 있다.
//위 객체를 만들기 위한 class를 작성하고
//하나의 객체를 생성해서
//학번 : 100
//이름 : 홍길동
//수학 : 50
//영어 : 60
//국어 : 70
//위의 데이터를 입력하고 출력하여 확인하시오.
class Student{
	 int number=100;         //학번
	 String name="홍길동";	 //이름
	 int math=50;
	 int eng=60;
	 int kor=70;
	 Scanner sc;
	
	 Student(){
		 
	 }
	 
	 Student(int d, String e, int f, int g, int h){
		 number=d;
		 name=e;
		 math=f;
		 eng=g;
		 kor=h;
	 }
	 
	 
	 
	 void Test() {
		 
//		 System.out.println("학번 : "+number+"\n이름 : "+ name+"\n수학 : " + math+"\n영어 : " + eng+"\n국어 : " +kor);
	 }
	 
	 void Test(int number, String name) {
		 this.number=number;  //this 자기
		 this.name=name;
//		 System.out.println("학번 : "+number+"\n이름 : "+ name);
		 
	 }
	 void Test(int a, int b, int c) {
		 math=a;
		 eng=b;
		 kor=c;
//		 System.out.println("수학 : " + a+"점 \n영어 : " + b+"점 \n국어 : " +c+"점");
	 }
	 void Test(int d, String e, int f, int g, int h) {
		 number=d;
		 name=e;
		 math=f;
		 eng=g;
		 kor=h;
//		 System.out.println("학번 : "+number+"\n이름 : "+ name+"\n수학 : " + math+"점\n영어 : " + eng+"점\n국어 : " +kor+"점");
	 }
	 public String toString() {//오버라이드로 재정의한것임
		 return "학번 : " + number + "\t이름 :" + name+ "\t수학 : " + math+ "점\t영어 : " + eng+"점\t국어 : " +kor+"점"; 
	 }
	 
	 void input() {
		 	System.out.println("학번을 입력해주세요");
			number=sc.nextInt();
			
			System.out.println("이름을 입력해주세요");
			name=sc.next();
			
			System.out.println("수학 점수를 입력해주세요");
			math=sc.nextInt();
			
			System.out.println("영어 점수를 입력해주세요");
			eng=sc.nextInt();
			
			System.out.println("국어 점수를 입력해주세요");
			kor=sc.nextInt();
	 }
	
	 
}

//학번과 이름을 변경하는 메서드, 성적을 변경하는 메서드를 제작한 후 실행하시오.


