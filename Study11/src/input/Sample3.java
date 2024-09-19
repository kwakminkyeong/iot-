package input;

import java.util.*;

public class Sample3 {
	public static void main(String[] args) {
		//Integer.parseInt(String) : 숫자모양의 문자데이터를 숫자로 변환
		Scanner sc=new Scanner(System.in);
		int num1;
		int num2;
		int sum;
		System.out.println("첫번째 수를 입력해주세요");
		num1=sc.nextInt();//next()콘솔창에 적은 글자를 가져오는 명령 -> 문자를 숫자로 가져오는 명령어 nextInt() :인티저로 가져와라
//		inum1=Integer.parseInt(num1);//인티저클래스에 문자를 숫자로 변환하여 넣어준다
		System.out.println("두번째 수를 입력해주세요");
		num2=sc.nextInt();
//		inum2=Integer.parseInt(num2);
		sum=num1+num2;
		System.out.println("둘을 합치면" +sum);
		
	} //main종료
} //클래스종료
