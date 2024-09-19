package var;

public class Sample5 {
	public static void main(String[] args) {
		//캐스팅 : 강제형변환. 형태를 무언가 입혀서 바꾸다(도금)
		//어느정도의 데이터 유실 또는 변조는 각오해야한다.
		//캐스팅 이후에 변조된 값을 보고 감당할 수 있는 수준인지 판단하여 사용한다.
		//(목적형태)변환할자료;
		float f=1.1234f;
		int a=(int)f;
		System.out.println(a);
		
		byte b=120;
		int i=b;
		System.out.println(i);
		b=(byte)i;
		System.out.println(b);
		
		
	}//main종료
}//class 종료
