package arr;

public class Sample9 {
	public static void main(String[] args) {
		//배열의 주소참조 특성 때문에
		//배열을 복사할 경우 하나만 변경되어도 따라서 다 바뀌는 현상이 생길 수 있다.
		//개발시 유사 오류가 발생한 경우 배열의 주소를 확인해야 한다.
		
		/*
		 * int[] A= {50,150,200};
		 
		int[] B= {50,150,200};
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i]+"\t");
	
		}//1.for종료
		
		System.out.println(); //엔터키
		
		for(int i=0; i<B.length; i++) {
			System.out.print(B[i]+"\t");
			
		}//2.for종료
		*/
		
		int[] A= new int[3];
		A[0]=50;
		A[1]=150;
		A[2]=200;
		
		int[] B;
		B=A;
		A[2]=3000;
		
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i]+"\t");
	
		}//1.for종료
		
		System.out.println(); //엔터키
		
		for(int i=0; i<B.length; i++) {
			System.out.print(B[i]+"\t");
			
			
		}//2.for종료
		System.out.println();
		System.out.println(A);
		System.out.println(B);
		
		//이차원배열
		//배열 내부의 한 요소가 배열의 형태로 만들어져 있는 경우
		int[] arr1= {1,2,3}; //일차원배열
		int[][] arr2= {//이차원배열
						{1,2,3},
						{4,5,6},
						{7,8,9}
						};
		System.out.println(arr2[1][2]); //클래스로 만들어서 사용한다. 자바스크립트에서 많이 사용된다.
		
	}//main종료
}//class종료
