package arr;

public class Sample2 {
	public static void main(String[] args) {
		//배열 : 하나의 변수에 여러개의 데이터를 담는 방법
		/*int[] a; //숫자가 여러개 들어갈 수 있는 상자 이름 a로 만들어 달라.인티저타입의 배열
		a=new int[2]; //숫자2개가 들어갈 수 있는 배열객체를 만들어서 a에 넣어줘라
		a[0]=10;
		a[1]=50;
		System.out.println(a[0]);
		System.out.println(a[1]);*/
		
		Student[] a;
		a=new Student[5]; //객체를 조립해서 넣어줘라
		a[0]=new Student(1, "이영준"); //a상자 0번째에 객체를 안에 넣어준다.
		//a[0].name="이영준"; //필드를 넣어주는 객체는 따로 만들어준다.
		//a[0].number=1;
		//System.out.println(a[0]);개체 파일명을 출력한다
		a[1]=new Student(2, "홍길동");
		a[2]=new Student(3, "김서울");
		a[3]=new Student(4, "주인백");
		a[4]=new Student(5, "고희선");
		a[0].speak();//메서드출력
		a[1].speak();
		
		for(int i=0; i<=4; i++) {
			a[i].speak();
		}//리턴이 없는 void리턴타입 출력
		
		
		/*for(int i=0; i<=4; i++) {
			a[i].speak();
		}//String 리턴타입으로 출력
		*/
		
		
	}//main종료
}//class종료

class Student{
	int number;
	String name;
	
	Student(int x, String y){ //데이터 초기값을 넣기 편하다
		number=x;
		name=y;
	}//생성자 종료
	void speak() {
		
		System.out.println(number+"번 학생인 "+name+"입니다.");
	}
	
	/*String speak1() {
		return number+"번 학생인 "+name+"입니다.";
	}*///리턴타입
}//외부 class종료

