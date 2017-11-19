import java.util.Scanner;
public class Main {

	private static final int MAX_SIZE=100;

	public static void main(String[] args) {
		int score_Kor, score_Com;
		int[] scoresKorean=new int[MAX_SIZE];
		int[] scoresComputer=new int[MAX_SIZE];
		double[] average=new double[MAX_SIZE];
		int numberOfStudents=0;
		Scanner myScanner=new Scanner (System.in);
		System.out.print(">�� ���� (����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ� :");
		score_Kor=myScanner.nextInt();
		score_Com=myScanner.nextInt();
		while(score_Kor>=0 && score_Com>=0){
			if(score_Kor<=100 && score_Com<=100){
				scoresKorean[numberOfStudents]=score_Kor;
				scoresComputer[numberOfStudents]=score_Com;
				numberOfStudents++;
			}
			else{
				System.out.println("����: 100���� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			System.out.print(">�� ���� (����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ� :");
			score_Kor=myScanner.nextInt();
			score_Com=myScanner.nextInt();
		}
		myScanner.close();
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��� "+numberOfStudents+"���� ������ �ԷµǾ����ϴ�.");
		System.out.println();
		System.out.println("�Էµ� ������ ���� ����� ������ �����ϴ�.");
		int count=0;
		while(count<numberOfStudents){
			average[count]=(double) (scoresKorean[count]+scoresComputer[count])/2.0;
			System.out.print("["+count+"] "+scoresKorean[count]+" "+scoresComputer[count]);
			System.out.println(" (��� "+average[count]+")");
			count++;
		}
		double sum=0;
		count=0;
		while(count<numberOfStudents){
			sum=sum+average[count];
			count++;
		}
		double classAverage=sum/(double) numberOfStudents;
		System.out.println("�б� ����� "+classAverage+"�Դϴ�.");

		count=0;
		int aboveClassAverage=0;
		while(count<numberOfStudents){
			if(average[count]>=classAverage){
				aboveClassAverage++;
			}
			else{
			}
			count++; /* ī��Ʈ if�ۿ��� ������ !! ���� !! */
		}
		System.out.println();
		System.out.println("��� �̻��� �л��� ���� "+aboveClassAverage+"���Դϴ�.");
		System.out.println();
		System.out.println("���α׷��� �����մϴ�.");

	}

}
