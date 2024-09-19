package obj;

public class Sample5 {
	public static void main(String[] args) {
		Test [] arr=new Test[5];
		arr[0]=new Test(1,"홍길동");
		arr[1]=new Test(2,"김철수");
		arr[2]=new Test(3,"이영준");
		arr[3]=new Test(4,"고희선");
		arr[4]=new Test(5,"이진선");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String name1=new String("홍길동");
		String name2=new String("홍길동");
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name1.equals(name2));
		//String데이터는 ==로 비교시 객체이므로 false를 반환하는 경우가 있다.
		//String.equals()를 이용하여 비교해야 값을 기준으로 비교해 볼 수 있다.
	}//main종료
}//class종료

//출력이전에 t.toString()이 실행된 결과를 적고 있다. 상속받은
//object 클래스의 활용
//별도의 extends구문 없는 모든 클래스는 object클래스의 상속을 받는다.
//Object 클래스는 객체를 조립하는 기능을 상속해준다.
//Object.toString() : 출력시 문자열로 변환하는 기능.원하는 데이타를 쉽게 꺼낼 수 있다.
class Test{
	int number;
	String name;
	Test(int a, String b){
		number=a;
		name=b;
	}
	//toString을 오버라이드하면 출력시 주소가 아닌 원하는 정보를 확인할 수 있다.
	public String toString() {//원하는 정보로 가공해서 보기 위해서
		return "번호 :"+number+", 이름 :"+name;
	}
}