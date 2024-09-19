package frame;
import java.awt.*;

public class Test1 extends Frame{//Frame은 java.awt.*에 들어있다. extends상속
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.setSize( 1080,800); //화면크기 조정가능
	}//main종료
	//생성자 : 1회만 무조건 객체가 조립될 때 실행
	//기본화면 세팅하는 용도로 아주 좋음
	
	//--->android개발하기 위해서 기반기술이 필요한다 아래기반이 필수
	
	//Component : 화면 내부에 배치되는 요소들(버튼 이미지 메뉴 단품요소들)
	//Container :Component를 배치할 수 있는 기반
	//Panel : component이자 Container인 요소
	//Frame : 가장 외부에 거대한 Container 틀
	
	Test1(){
//		setTitle("제목");     //제목지정
		super("제목"); //부모의 생성자
		
		Button b=new Button("click"); //awt에 들어있는 클래스
		b.setBounds(100,40,100,60);//(가로위치, 세로위치, 가로사이즈, 세로사이즈)
		b.setBackground(Color.BLUE);
		add(b);
		
		setBackground(Color.RED);
		setSize(1080,500); //화면 크기 지정  --> Frame가 갖고있다. 카멜표기법은 메서드
		setLayout(null);  //화면 배치 규칙결정. 무규칙으로 만들어놔야 마음대로 만들 수 있다.
		setVisible(true); //화면이 눈에 보이도록 설정
		}
}//Test1 class종료
