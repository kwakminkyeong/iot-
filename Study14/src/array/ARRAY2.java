package array;

public class ARRAY2 {
	 public static void main(String[] args) {
		 //타입[] 이름;
		 //배열이름=new 타입[칸수];
		 String[] str; //문자가 많이 들어가는 str 상자를 만들었다.
		 str=new String[5]; //str은 4칸으로 나눈 string상자를 만들어줘. 자동으로 번호를 나눈다
		 
		 str[0]="봄";
		 str[1]="여름";
		 str[2]="가을";
		 str[3]="겨울";
		 str[4]="우기";
		 
		 System.out.println(str[0]);
		 System.out.println(str[1]);
		 System.out.println(str[2]);
		 System.out.println(str[3]);
		 System.out.println(str[4]);
		 
		 //배열형태의 데이터를 순서대로 출력해볼 수 있는 for문
		 for(int a=0; a<str.length; a++) {
			 System.out.println(str[a]);
		 }//기본 배열 형태 for문 종료
		 
		 //집합 데이터를 바로 입력하는 방법
		 int[] score= {100,80,60,22,30,88,92,65,1,6,8};
		 	System.out.println("자동배열 수 : "+score.length); //자동으로 index를 쪼갠다.
		 
		 int sum=0;
		 for(int i=0; i<score.length; i++) {
//		 	System.out.println("score["+i+"]="+score[i]);
		 		sum+=score[i];
		 }//집합배열 형태 종료
		 System.out.println(sum);
	 }//main종료
}//class종료
