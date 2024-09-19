package COLLECTION;

import java.util.*;
public class Sample6 {
	public static void main(String[] args) {
		ArrayList<Student> AL=new ArrayList<Student>();
//		Student s1=new Student(100,"홍길동",15);
		AL.add(new Student(100,"홍길동",45));
		AL.add(new Student(105,"홍길순",25));
		AL.add(new Student(200,"이영준",15));
		System.out.println(AL);
		
		/*for(int i=0; i<AL.size(); i++) {
			System.out.println(AL.get(i));
		}*/
		
		//향상된 for 문으로 출력해 보시오
		//for(변수:집합자료){}
		
		for(Student st:AL) {
			System.out.println(st);
		}
		//Collections.sort(AL);//기준점이 없어서 sort가 안된다. implements Comparable로 정렬처리 해줘야한다 
		Collections.sort(AL);
		System.out.println(AL);
		
		
		
		
	}//main종료
}//class종료
class Student implements Comparable{
	int number;
	String name;
	int age;
	Student(int a, String b, int c){
		number=a;
		name=b;
		age=c;
	}
	public String toString() {
		return "학번 :"+number+" 이름 :"+name+" 나이 :"+age;
	}
	public int compareTo(Object o) {
		int cage=((Student)o).age;
		return this.age-cage;
		//리턴값이 0이라는건 두값이 서로같음
		//리턴값이 0보다 크면 비교전 값이 비교 후보다 크다
		//리턴값이 0보다 작으면 비교전 값이 비교 후보다 작다
	}
	
	//공부할때는 temp변수 잡으셔서 if문으로 비교하고 아래방식을 사용해 본다. 프레임웍
	//Collections.sort(AL, Student.ageComp); 기준별로 정렬처리가 가능하다.
	public static Comparator<Student> ageComp=new Comparator<Student>() {
		public int compare(Student o1, Student o2) {
			int age1=o1.age;
			int age2=o2.age;
			return age1-age2;
			
			}
		};
	
}
