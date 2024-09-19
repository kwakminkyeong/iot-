package FRAME;

import java.awt.*;
import java.awt.event.*; //마우스클릭했을때 받아들이는 기능이 들어있다. 전부 인터페이스이다

public class Sample1 {
	public static void main(String[] args) {
		new TestFrame();
		
		
	} //main 종료
} //class종료
class TestFrame extends Frame{
	//기본화면은 보이지 않는 것이 원칙, X를 눌러도 꺼지지 않는 것이 원칙(어떤방식으로 꺼질지 선택하는 방식)
	TestFrame(){ //화면객체
		//객체가 조립될 때(화면이 뜰때) 무조건 단한번 실행된다. 크기나 배치조건, 눈에 보일지 여부, 제목
		//한글이 깨질 수 있음. MS949타입에서 정상동작(스윈 안드로이드 자바스크립트)
		
		//기본화면의 권장사양
		super("Title"); 		//setTitle(String)로 대체가능 제목을 입력해주는 부분
		
		Button b=new Button("click");
		b.setBounds(100,40,100,60); //요소에 등장 위치와 크기 지정(x좌표,y좌표, 너비, 높이)
		TestEvent te=new TestEvent();
		b.addActionListener(te);
		
		/*b.addActionListener(new ActionListener() {//ActionListener의 생성자를 만든다 이것을 익명클래스라고한다. 추상메서드의 몸통 넣어준다.클래스를 만들수 없는 환경에서 만들어준다.
			public void actionPerformed(ActionEvent e) {
				System.out.println("클릭확인!");
			}
			
		}); //매개변수가 인터페이스 타입을 갖는다. 클래스를 만들어준다 */
		
		
		//Component.addActionListener(ActionListener) : 특정 요소에 동작을 인식할 수 있는 기능 부여
		add(b);
		
		setSize(300,500); 	//가로, 세로 크기
		setLayout(null);	//화면 배치규칙, 배치규칙은 모든 배치에 우선하므로 무규칙 권장->권장규격이다.
		setVisible(true);	//화면이 눈에 보일지 여부
		
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				//dispose(); //현재 켜있는 현재 창을 끄는 기능
				System.exit(0); //모든 프로그램 종료
			}
		}); //익명클래스 동작을 입력하면 나오는 모양
		
	}
	
} //class TestFrame 종료

class TestEvent implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println("클릭확인!");
	}
}// TestEvent종료

/*
 이것은 자바스크립트 코드로 위 코드와 비교할 목적으로 적어두었습니다.
var btn=document.getElementById("btn");
 
btn.addEventListener("click", function(){
	console.log("동작확인");
});
*/