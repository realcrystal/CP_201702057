import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner myScanner=new Scanner(System.in);
		System.out.print("1���� N���� �հ踦 ���Ϸ��� �մϴ�. N���� �Է��Ͻʽÿ�:");
		int giveN=myScanner.nextInt();
		int count=1;
		int sum=0;
		myScanner.close();
		
		while(count<=giveN){
			sum = sum + count;
			System.out.println("1���� "+count+"������ ���� "+ sum +" �Դϴ�.");
			count = count + 1;
		}

	}
}
