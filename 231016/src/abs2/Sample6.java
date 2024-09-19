package abs2;

public class Sample6 {
	public static void main(String[] args) {
		//GrandParent a=new GrandParent();
		//a.work();
	}//main종료
}//class종료
abstract class GrandParent{
	GrandParent(){
		System.out.println("조부모의 생성자");
	}
	void work() {
		System.out.println("과실영농업");
	}
}
