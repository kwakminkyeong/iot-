package getset;

public class Sample3 {
	public static void main(String[] args) {
		Animal[] a=new Animal[5];
		a[0]=new Dog();
		a[1]=new Penguin();
		a[2]=new Dog();
		a[3]=new Penguin();
		a[4]=new Dog();
		for(int i=0; i<a.length; i++) {
			a[i].move();
		}
		
	}//main종료
}//class종료
abstract class Animal{
	abstract void move(); //추상메서드
	abstract void eat(); 
	
}//Animal class종료
//추상클래스가 추상메서드를 가진 경우 이를 상속받은 일반클래스는 추상메서드의 몸통을 구현해야한다.
class Dog extends Animal{
	void move() {
		System.out.println("네발로 뜁니다.");
	}
	void eat() {
		System.out.println("맛있게먹습니다.");
	}
	
}
abstract class Bird extends Animal{
	abstract void move(); 
	void eat() {
		System.out.println("부리로 먹습니다.");
	}
}
class Penguin extends Bird{
	void move() {
		System.out.println("두발로 뜁니다.");
	}
}
