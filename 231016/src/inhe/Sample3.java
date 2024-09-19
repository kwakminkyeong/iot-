package inhe;

public class Sample3 {
	public static void main(String[] args) {
		Child c=new Child();
		
	}//main종료
}//class종료
class Parent{
	Parent(){
		System.out.println("일반 부모의 생성자");
	}
	Parent(String s){
		System.out.println("String을 받는 부모의 생성자");
	}
}//Parent종료


class Child extends Parent{
	Child(){
		super("스트링");
		System.out.println("자식의 생성자");
	}
	
}
