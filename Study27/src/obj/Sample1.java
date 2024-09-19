package obj;

public class Sample1 {
	public static void main(String[] args) {
		Animal a1=new Animal(11,"멍멍","개");
		a1.setAge(-100); //의도하지 않는 값을 막기위해 if문을 사용한다.
		//내용을 변조할때 의도하지 않은 코드를 막아준다 접근제한자로 막아준다 private으로 막으면 중괄호를 벗어나면 사용이 안된다. 의도하지 않는 데이타를 막는다.
		//a1.age=16; privat을로 막아서 사용안된다.
		/*a1.sound="멍멍";//매개변수 생성자를 만들어 객체를 조립하면 이들은 필요가 없다
		a1.race="개";
		a1.age=15;*/ 
		//a1.number=20; 상수정보는 값을 변동시킬 수 없다.
		Animal a2=new Animal(15,"야옹","고양이");
		/*a2.sound="야옹";
		a2.race="고양이";
		//a2.number=30;*/
		
		int dog_age=a1.getAge();
		System.out.println(dog_age);
		//System.out.println(a1.race); //일일이 타이핑하면 시간이 많이 걸린다. 소스가 길어지면 객체안에 있는 내용물을 toString오버라이드해서 사용한다.
	}//main종료
}//class종료

//extends가 붙어있지 않은 모든 class는 extends Object로 본다.
//Object클래스는 toString이라는 메서드를 가지고 있다. 객체의 내용을 String으로 변경하는 기능을 가지고 있다.->전기 전산신호를 사람이 읽을 수 있는 글자로 변환하는 용도로 사용된다.
//toString은 System.out.println로 출력해본다. 
class Animal{
	//필드를 작성한다. 필드(속성)에 대한 정보들이 동물을 구별한다
	//필드!=변수. 상수는 (final int number=10;)들어가면 값이 바꿀수 없기때문에 사용하지 않는다->구별이 안된다.
	
	private int age;		//나이
	String sound;	//울음소리
	String race;	//종족정보
	final int number=10; //상수로는 객체간에 구별되는 속성을 저장할 수 없다. 제한적으로 사용된다.변수로 만들어놓고 값을 바꾸지 않으면 상수로 사용된다. 색상정보는 final이 사용된다.
	//객체를 조립하는 방법
	Animal(int a, String b, String c){//초기값이다.
		//필드!=변수
		age=a;
		sound=b;
		race=c;
	}
	//헥스코드#ff0000 static final Color.red; 있는 상수를 사용하게 된다.
	public String toString() {
		return "나이 :"+age+", 울음소리 :"+sound+", 종족 :"+race;
	}
	
	public void setAge(int a) {//setAge의 내용을 세팅할때 쓰겠다. 
		if(a<1) {//게터세터 개발방식이다. DTO오브젝트를 전송할때 쓰는 방식이다.
			System.out.println("나이는 1살이상을 적어야 합니다.");
			age=1;
		}else {
			age=a;
		}
		age=a;
	}
	public int getAge() { //
		return age;
	}
}

//초기값을 생성자로