package array;

public class ARRAY {
	public static void main(String[] args) {
		//배열 : 한개의 변수에 여러개의 값을 넣는 방법
		//타입[ ] 이름; : 해당 타입의 데이터가 여러개 들어갈 수 있는 배열형태의 변수를 제작
		//이름=new 타입[칸수]; : 지정된 칸수로 분할 된 배열을 만들어달라는 명령
		int[ ] arr; //이름이 arr이고 숫자가 여러개들어 갈 수 있는 변수
		arr=new int[3]; //숫자가 3개 들어갈 수 있는 칸막이를 새로 만들어줘라
		
		//index : 배열생성시 자동으로 부여된 0번부터 시작하는 명칭
		//*X5,000,000 0번부터 시작하므로 지장한 칸수-1까지의 index를 가진다.
		//데이터를 배열에 입력하거나 출력할 경우 index를 통해서 수행해야 한다.
		arr[0]=80;
		arr[1]=60;
		arr[2]=33;
		System.out.println(arr[2]);
	}//main end
}//class end
