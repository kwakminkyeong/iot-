package arr;

public class Sample4 {
	public static void main(String[] args) {
		//try-catch : 오류가 발생하더라도 프로그램을 종료하지 않고 다른 부분은 실행되도록 하는 문구 통신처리에서 사용된다.
		//*X5,000,000
		System.out.println("배열을 만듭니다.");
		try {//오류가 발생할지도 모르는 부분을 넣는다
		int[] a=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;//오류가 발생하자마자 catch 오류처리로 간다
		System.out.println("이 부분은 실행되지 않습니다.");
		}catch(Exception e) {//오류가 발생했을 때 실행할 부분 catch문을 여러개 달아서 사용할 수도있고 if문을 이용하기도한다.통신
		System.out.println("처리도중 오류가 발생했습니다.");
		System.out.println("###Sample4.java::18 이영준###"+e);//###Sample4.java::18 이영준### 본인의 오류를 찾기위해 표식을 한다.단서를 구현할 수 있는 Stystem.out.println을 사용하는것을 추천함
		e.printStackTrace();
		}
		System.out.println("배열처리가 끝났습니다."); //스캐너로 입력받았을때 변수타입이 잘못되었을때 오류를 띄워준다
		
	}
}
