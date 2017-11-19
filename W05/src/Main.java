
public class Main {

	public static void main(String[] args) {
		int n=1;
		double x, y;

		System.out.println("<<Sine 값 출력 프로그램을 시작합니다.>>");
		System.out.println();
		while(n >= 1 && n <= 180){
			x= (double) n *(3.141592/180.0);
			y=Math.sin(x);
			System.out.println("Sine("+n+"도) 는"+y+"입니다.");
			n ++;
		}
		System.out.println();
		System.out.println("<<Sine 값 출력 프로그램을 종료합니다.>>");
	}

}
