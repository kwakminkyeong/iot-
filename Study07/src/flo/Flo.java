package flo;

public class Flo {
	public static void main(String[] args) {
		//float :플로트, 짧은 소수점을 저장할 수 있는 규격
		//컴퓨터가 소수점이 있는 수임을 인식할 수 있도록 소문자 또는 대문자 f를 붙여준다.
		float f;
		f=3.14f; //3.14는 3안에 있는 14이므로 소숫점 f를 붙여준다. 컴퓨터가 소숫점을 모른다. 임시저장 저장소가 사이즈가 작기때문에 저장할 수 없다.
		System.out.println(f);
		
		//double : 더블, 긴 소수점을 저장할 수 있는 규격. 세밀하게 섬세하게
		//소문자 또는 대문자 d를 붙여도 되고 안붙여도 된다.
		double d;
		d=1.23456; //기본형이라서 잘 들어간다.
		System.out.println(d);
		}

}
