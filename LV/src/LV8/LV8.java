package LV8;
import java.util.Scanner;
public class LV8 {
	public static void main(String[] args) {
		//키보드로 값을 입력받아 도형의 면적을 구하는 소스를 완성해 보세요
		//삼각형의 면적은 너비 X 높이 X 1/2 입니다.
		//사각형의 면적은 너비 X 높이 입니다.
		Scanner sc=new Scanner(System.in);
		System.out.println("계산할 도형을 선택하세요. 1:삼각형, 2:사각형");
		int number=sc.nextInt();
		System.out.println("너비를 입력해 주세요");
		int width=sc.nextInt();
		System.out.println("높이를 입력해 주세요");
		int height=sc.nextInt();
		System.out.println("선택사항 :"+number+"너비 :"+width+"높이 :"+height);
		
		
		if(number==1) {
			System.out.println("삼각형의 면적은"+(width*height)/2+"입니다.");
		}else if(number==2){
			System.out.println("사각형의 면적은"+width*height+"입니다.");
		}else {
			System.out.println("안내문을 읽고 입력해 주세요");
		}
		
		
	
	}
}
