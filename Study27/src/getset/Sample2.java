package getset;

public class Sample2 {
	public static void main(String[] args) {
		
	}//main종료
}//class종료
class Student{
	private int number;
	private String name;
	/*public void setNumber(int number) { //변수 이름 지을때 필드와 같게한다면 this를 사용한다
		this.number=number; 
	}
	public int getNumber() {
		return number;
	}*/
	//오른쪽 마우스 source Generate Getters and Setters로 자동완성된다.이건 껍데기이다. if문을 개발자의 입맛에 맞게 만든다. 꺼내고 싶을 때 toString으로 프린트해본다.

	

	
	



	public int getNumber() {
		return number;
	}




	public void setNumber(int number) {
		this.number = number;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "이름 :"+name+", 학번 :"+number;
	}

	
}
