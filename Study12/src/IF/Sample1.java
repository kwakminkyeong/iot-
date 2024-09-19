package IF;

import java.util.*;

public class Sample1 {
	public static void main(String[] args) {
		//위에서부터 순서대로 조건을 보고 하나라도 참이 나오면 아래는 보지 않는다.
		//if-else-if 조건을 짤때는 범위에 주의한다.(좁은범위부터 하나씩 넓게 제작)조건에 순서가 있다.
		Scanner sc=new Scanner(System.in);//System.in프로그램을 new 조립하라
		int score;
		System.out.println("학생 성적을 입력해 주세요");
		score=sc.nextInt();//입력된 수를 가져옵니다.
		System.out.println("입력된 점수는 "+score+"입니다.");
		String grade;//string이 들어갈 수 있는 변수의 상자를 만들어라
		if(score>=80) {
			if(score>=85) {
				grade="A+";
			}else if(score<=83){
				grade="A-";
			}else {
				grade="A";
			}
		}//if문 종료
		else if( score>=90) {
			grade="A-";
		}
		else if(score>=85){
			grade="B+";
		}
		else if(score>=70) {
			grade="B-";
		}
		else if(score>=65) {
			grade="C+";
		}
		else if(score>=60){
			grade="C-";
		}else {
			grade="F";
		}
		System.out.println(grade+ "학점입니다.");
	}//메인종료
}//클래스종료

