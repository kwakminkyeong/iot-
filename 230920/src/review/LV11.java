package review;

import java.util.Comparator;
import java.util.Arrays;


public class LV11 {
	public static void main(String[] args) {
		//다음 학생들을 학번 순으로 오름차순 나열한 후 출력하시오
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		Student s5=new Student();
		
		s1.number=22; s1.name="홍길동";
		s2.number=19; s2.name="이순신";
		s3.number=61; s3.name="김세종";
		s4.number=13; s4.name="박혁거세";
		s5.number=77; s5.name="왕건";
		
		s1.study();
		s2.study();
		s3.study();
		s4.study();
		s5.study();
		
		int result=s1.Student();
		s2.Student();
		s3.Student();
		s4.Student();
		s5.Student();
		System.out.println("result");
		for(int i=0; i<5; i++) {
			System.out.println(result+"정렬");
		}
		
		
		
			 
		 
		
		
	}//main종료
}//class종료
class Student{
	int number;
	String name;
	

	void study() {
		System.out.println(name+"공부를합니다");
		
	}
	int test() {
		return 10;
	}
	
}//외부 class종료
