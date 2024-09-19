package LV5;

public class LV5 {
	public static void main(String[] args) {

		for(int i=1; i<10; i++) {
			for(int a=0; a<9-i; a++) {
				System.out.print(" ");
			}
			for(int k=0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
