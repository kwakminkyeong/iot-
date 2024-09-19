package label;

import java.awt.*;
import java.awt.event.*;

public class Sample6 {
	public static void main(String[] args) {
		new Test();
		
	}//main종료
}//class종료
//Container : Component를 담을 수 있는 요소로 add메서드를 이용해서 Component를 표현
//Component : 버튼 등 배치되는 요소로 Container에 add되어야 화면에 표시된다.
//Panel :Container이자 Component로 동시에 사용가능한 요소
class Test extends Frame{ //대표적인 Container
	Test(){
		//화면의 구성 기본 모양은 한번만 지정해주면 바꿀 필요가 없으므로
		//단한번 무조건 실행되는 생성자에 넣어서 구현하면 편리하다.
		
		setTitle("label");
		
		Label L=new Label("first");  //글자표현할때 사용 스카치테이프에 글자를 쓰면 글자만 보인다. 투명해서 글자만 보인다.
		L.setBounds(50,100,100,30);
		add(L); //대표적인 Component
		Label L2=new Label("second");
		L2.setBounds(50,150,100,30);
		add(L2);
		Button btn=new Button("click!");
		btn.setBounds(50,200,100,30);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String data=L.getText(); 데이터 가져오는거
				//System.out.println(data);
				//L.setText("IOT ABCDEFGHIJKLMNOPQR");
				String data1=L.getText();
				String data2=L2.getText();
				L.setText(data2);
				L2.setText(data1);
			}
		});
		add(btn);
		
		setSize(400,400);
		setLayout(null);//화면배치규칙을 무규칙으로지정
		setVisible(true);//화면을 눈에 보이도록 지정
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				//System.out.println(e);
				dispose();//창끄는 기능
				
			}
			
		});
	}
}
