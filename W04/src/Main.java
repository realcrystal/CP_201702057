import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("N! 계산을 실행하려면 Y또는 y를 입력하시오.");
		Scanner myScanner=new Scanner(System.in);
		char inputString=myScanner.next().charAt(0);

		while(inputString=='Y' || inputString=='y') {
			System.out.print("N! 을 계산할 정수 N의 값을 입력하시오.");
			int n=myScanner.nextInt();

			if (n < 0){
				System.out.println("음수에 대한 계산을 실행할 수 없습니다.");
			}

			else {

				if (n == 0){
					System.out.println("0! 의 값은  1입니다.");
				}

				else {
					int count=1;
					int factorial=1;

					while(count<=n){
						factorial=factorial*count;
						count= count + 1;
					}
					System.out.println(n+"! 의 값은 "+factorial+"입니다.");
				}
			}
			System.out.println();
			System.out.print("N! 계산을 실행하려면 Y또는 y를 입력하시오.");
			inputString=myScanner.next().charAt(0);
		}
		myScanner.close();
		System.out.println("계산을 종료합니다.");
	}    
}
