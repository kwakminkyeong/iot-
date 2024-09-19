package review;

import java.util.Arrays;
import java.util.Collections;

public class LV10 {
	public static void main(String[] args) {
		//다음의 배열을 내림차순으로 정렬하시오
		Integer[] arr= {50,90,88,72,60,10};
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("내림차순");
		
		for(int k=0; k<arr.length; k++) {
			System.out.println(arr[k]);
		}//for문 종료
		
		System.out.println();
	}//main종료
}// class종료
