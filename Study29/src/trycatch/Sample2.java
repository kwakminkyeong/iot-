package trycatch;

import java.util.Scanner;
import java.util.InputMismatchException;



public class Sample2 {
	public static void main(String[] args) {
		/*int[] arr=new int[3];
		arr[0]=0;
		arr[1]=10;
		arr[2]=20;
		try {
			for(int i=0; i<4; i++) {
				System.out.println("배열내부 데이터 확인중...");
				System.out.println(arr[i]);
				System.out.println("배열내부데이터 하나 확인완료...");
			}
		}catch(Exception e) {
			System.out.println("배열내부 확인 중 오류 확인");
		}
		System.out.println("배열내용 확인 완료! 다음 내용을 수행합니다.");
		*/
		
		Scanner sc=new Scanner(System.in);
		int[]array=new int[2];
		System.out.println("숫자를 입력해 주세요.");
		try {
			array[1]=70;
			int i=sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("안내문을 잘 읽도록 합시다.");
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 크기를 벗어나면 여기가 수행");
		}
		System.out.println("예외가 발생해도 프로그램은 수행됩니다.");
	
		
		
		
	}//main종료
}//class종료
