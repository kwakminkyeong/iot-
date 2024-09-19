package review;

public class LV13 {
	public static void main(String[] args) {
		int[] nums= {11,12,13,14,15,16};
		String[]  names= {"홍길동", "김세종", "김철수", "왕건", "아지태", "허준"};
		Students st=new Students(nums, names);
		School sc=new School(st);
		sc.print();
	}//main종료
}// class 종료
class School{
	Student students;
	School(Students s){
		Students=s;
	}
	void print() {
		Student[] arr=students.sts;
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].num+"번 학생의 이름은"+arr[i].name+"입니다. ");
		}
	}
}//외부1 class 종료
class Student{
	int num;
	String name;
	Student(int a, String b){
		num=a;
		name=b;
	}
	
	
}//외부2 class종료