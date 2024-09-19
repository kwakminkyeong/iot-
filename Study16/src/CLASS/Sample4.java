package CLASS;

public class Sample4 {
	public static void main(String[] args) {
		Product p1=new Product();
		p1.name="찹쌀도너츠";
		p1.setPrice(-20000);
		p1.qty=20;
		int result=p1.getPrice();
		System.out.println(result);
		
	}//main종료
}//class종료
class Product{
	String name;   //상품명
	private int price;	   //가격	 private 보안
	int qty;       //재고량
	
	//get : 데이터를 가져오다
	//set : 데이터를 입력하다
	int getPrice() {
		return price;
	}
	void setPrice(int a/*매개변수페라미터*/) {
		if(a<0) {
			System.out.println("가격입력이 잘못되었습니다.");
			price=10000;
		}else {
			price=a;
		}
	}//메서드 종료
	//int bugasae;   //부가세 .알아보기 쉽게 적는다.
	
}//product클래스 종료