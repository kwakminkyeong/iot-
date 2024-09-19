package event;

import java.awt.*;
import java.awt.event.*;

public class Sample02 {
	public static void main(String[] args) {
		new View();	//단발적으로 사용할 때에는 사용 가능하나, 여러 창을 사용할 때는 새로운 변수 이름을 지정하는 것이 좋다.
	}
}
class View extends Frame{
	int number=0;
	View(){
		super("Test");
		
		TextField tf=new TextField("ID를 입력하세요");
		tf.setBounds(50,50,150,20);
		add(tf);
		
		TextField tf1=new TextField("PW를 입력하세요");
		tf1.setBounds(50,70,150,20);
		add(tf1);
		
		Button b=new Button("click!");
		b.setBounds(50,100,60,30);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//e : 해당 동작이 촉발된 원인
				System.out.print(tf.getText()+"\t");
				System.out.println(tf1.getText());
				tf.setText("ID를 입력해봅시다.");
				number++;
				tf1.setText(""+number);
			}
		});
		add(b);
		
		
		setSize(400,400);	//화면 사이즈 (없으면 bar만 나옴)
		setLayout(null);	//화면 배치규칙(무규칙)
		setVisible(true);	//화면 눈에 보이게
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				// System.out.println("X 버튼 클릭!");	으로 수정하면 Console에 X 버튼 클릭이라는 글자가 콘솔에 작성된다.
			}// 소스코드를 작성하였을 때 Override가 작동하면 추상클래스, implement가 작동하면 인터페이스 
		});	//추상클래스인 것
	}//생성자 끝
	
}