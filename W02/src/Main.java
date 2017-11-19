
public class Main {

	public static void main(String[] args) {
		int sum = 1; //sum 변수, 자료형은 정수형
		System.out.println("1부터 1까지의 제곱의 합은 "+sum+"입니다.");
		sum = sum + 2*2;
		System.out.println("1부터 2까지의 제곱의 합은 "+sum+"입니다.");
		sum = sum + 3*3;
		System.out.println("1부터 3까지의 제곱의 합은 "+sum+"입니다.");
		sum = sum + 4*4;
		System.out.println("1부터 4까지의 제곱의 합은 "+sum+"입니다.");
		sum = sum + 5*5;
		System.out.println("1부터 5까지의 제곱의 합은 "+sum+"입니다.");
		sum = sum + 6*6;
		System.out.println("1부터 6까지의 제곱의 합은 "+sum+"입니다.");
		sum = sum + 7*7;
		System.out.println("1부터 7까지의 제곱의 합은 "+sum+"입니다.");
		sum = sum + 8*8;
		System.out.println("1부터 8까지의 제곱의 합은 "+sum+"입니다.");
		sum = sum + 9*9;
		System.out.println("1부터 9까지의 제곱의 합은 "+sum+"입니다.");
		sum = sum + 10*10;
		System.out.println("1부터 10까지의 제곱의 합은 "+sum+"입니다.");	
	}
	//덧셈 9회, 곱셈 9회, 저장 10회, 모두 28회의 연산.
	//연산 횟수를 줄이기 위해 "sum=0; sum=sum+1;" 의 연산을 "sum=1;" 으로 변경.

}
