package obj;

public class Sample5 {
	public static void main(String[] args) {
		Test a=new Test(11, "곽민경");
		System.out.println(a);
	}//main종료
}//class종료

class Test{
	int number;
	String name;
	Test(int a, String b){
		number=a;
		name=b;
	}
	public String toString() {//toString은 a.toString으로 System.out.println에서 실행시킨다
		return "번호 :"+number+", 이름 :"+name;
	}
}