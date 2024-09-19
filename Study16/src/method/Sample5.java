package method;

public class Sample5 {
	public static void main(String[] args) { //공개되어있고 객체화 되어있지 않아도 돌려주지 않는
		Student s1=new Student(); //Student가 들어갈 수 있는 s1상자를 만들어 주라
		
		s1.setScore("곽민경", 80, 60, 100); 
		s1.getScore();
		
		Student s2=new Student();
		s2.setScore("이영준",100,80,95);
		s2.getScore();
		
		Student s3=new Student();
		s3.setScore("배한결", 80, 60, 100);
		s3.getScore();
		
		System.out.println(s1.name);
		System.out.println(s1.math);
		System.out.println(s1.eng);
		System.out.println(s1.kor);
		
	}//main종료
}//class종료
class Student{
	String name; 	//이름
	int math;		//수학점수
	int eng;		//영어점수
	int kor;		//국어점수
	
	
	//성적을 입력해주는 메서드
	//매개변수 : 메서드를 실행할 때 특정 데이터를 메서드 내부로 전달해주기 위한 변수
	//매개변수는 ()내부에 작성한다.
	//매개변수가 있는 메서드는 실행시에 해당 변수타입에 맞는 데이터를 입력해야 한다.
	//들어온 데이터는 메서드 내부{}에서 해당 변수 이름으로 사용할 수 있다.
/*	void setScore(int score) {
//		System.out.println("들어온 데이터 "+score);
//		math=score;
 * */
 
	/*void setScore(String a, int m, int e, int k) { //매개변수가 있는 void 메서드
		name=a;
		math=m;
		eng=e;
		kor=k;
		*/
		
		
		
		void setScore(String name, int math, int eng, int kor) { //매개변수가 변수와 같을때
			this.name=name; //후에 이 설계도로 조립되서 완성될 객체 this필드를 의미함
			this.math=math;
			this.eng=eng;
			this.kor=kor;	
	}//메서드종료
	
	//성적정보를 출력하는 메서드
	void getScore() {
		System.out.println("이름:"+name+"\t 수학:"+math+"\t 영어:"+eng+"\t 국어:"+kor);
	}
	
	
	
	
}//Student class 종료
