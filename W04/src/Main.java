import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("N! ����� �����Ϸ��� Y�Ǵ� y�� �Է��Ͻÿ�.");
		Scanner myScanner=new Scanner(System.in);
		char inputString=myScanner.next().charAt(0);

		while(inputString=='Y' || inputString=='y') {
			System.out.print("N! �� ����� ���� N�� ���� �Է��Ͻÿ�.");
			int n=myScanner.nextInt();

			if (n < 0){
				System.out.println("������ ���� ����� ������ �� �����ϴ�.");
			}

			else {

				if (n == 0){
					System.out.println("0! �� ����  1�Դϴ�.");
				}

				else {
					int count=1;
					int factorial=1;

					while(count<=n){
						factorial=factorial*count;
						count= count + 1;
					}
					System.out.println(n+"! �� ���� "+factorial+"�Դϴ�.");
				}
			}
			System.out.println();
			System.out.print("N! ����� �����Ϸ��� Y�Ǵ� y�� �Է��Ͻÿ�.");
			inputString=myScanner.next().charAt(0);
		}
		myScanner.close();
		System.out.println("����� �����մϴ�.");
	}    
}
