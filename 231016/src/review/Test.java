package review;

public class Test {
	public static void main(String[] args) {
		Test1 t;
		t=new Test1("다르네");
		t.check();
		t.run();
		
	}// main종료
}//class종료
class Test1{
	String data;
	void run(String a, int b) {
		System.out.println("run()이 실행되었습니다.");
		
	}//void종료
	void check() {
		System.out.println("check()에서 확인한 데이터 : "+data);
	}
	void run() {
		System.out.println("매개변수 없는 run()입니다.");
	}
	Test1(){
		System.out.println("생성자가 객체를 조립합니다.");
	}
	Test1(String s){
		System.out.println("다른 방식으로 객체를 조립합니다.");
		data=s;
	}
	
}//Test class종료

//매개변수 : 동작을 수행할 때 특정 데이터를 제공해야 동작하도록 하는 방법
//매개변수가 있는 경우 해당 매개변수와 동일한 타입의 데이터를 제공해야 동작한다.
//매개변수는 여러개를 둘 수 있지만 순서와 갯수를 지켜야 한다.
//다른 부분에서 사용하기 위해서는 필드를 제작하여 저장해야 한다.