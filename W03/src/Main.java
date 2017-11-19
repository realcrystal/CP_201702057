import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner myScanner=new Scanner(System.in);
		System.out.print("1부터 N까지 합계를 구하려고 합니다. N값을 입력하십시오:");
		int giveN=myScanner.nextInt();
		int count=1;
		int sum=0;
		myScanner.close();
		
		while(count<=giveN){
			sum = sum + count;
			System.out.println("1부터 "+count+"까지의 합은 "+ sum +" 입니다.");
			count = count + 1;
		}

	}
}
