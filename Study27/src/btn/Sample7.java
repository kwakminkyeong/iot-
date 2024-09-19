package btn;

import java.awt.*;
import java.awt.event.*;

public class Sample7 {
	public static void main(String[] args) {
		Test t=new Test();
	}
}//main종료
class Test extends Frame{
	Test(){
		super("button");
		
		Checkbox cb=new Checkbox("java", true); //체크박스가 있으면 체크가 되어있게 
		cb.setBounds(220,50,40,20);
		add(cb);
		
		TextField tf1=new TextField();
		tf1.setBounds(50,50,150,20);
		add(tf1);
		TextField tf2=new TextField();
		tf2.setBounds(50,100,150,20);
		add(tf2);
		TextField tf3=new TextField();
		tf3.setBounds(50,150,150,20);
		add(tf3);
		
		Button b1=new Button("+");
		Button b2=new Button("-");
		b1.setBounds(50,200,50,50);
		b2.setBounds(120,200,50,50);
		
		
		
		ActionListener AL=
				(e) ->{ //람다식 축약식
				System.out.println(cb.getState());
				String a=tf1.getText();
				String b=tf2.getText();
				int num1=Integer.parseInt(a);
				int num2=Integer.parseInt(b);
				//System.out.println(a+", "+b);
				//String data=tf1.getText();
				/*System.out.println(e.getActionCommand());//버튼을 구별할 수 없다.
				System.out.println(e.getSource()); //버튼을 구별할 수 있다.*/
				if(e.getSource()==b1) {
					tf3.setText(""+(num1+num2));
					
				}else if(e.getSource()==b2) {
					tf3.setText(""+(num1-num2));
				}
			}
		;
		
		b1.addActionListener(AL);
		b2.addActionListener(AL);
		
		
		add(b1);
		add(b2);
		
		TextArea ta=new TextArea(); //스크롤처리를 하는 방식
		ta.setBounds(50,280,300,100);
		add(ta);
		
		
		
		
		
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
}//class종료

