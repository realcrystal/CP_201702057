import java.util.Scanner;

public class Main {
	private static Scanner myScanner=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print(">�� ���� (����, ����, ��ǻ��)�� ������ ���ʷ� �Է��մϴ�:");
		int score_Kor=inputScore();
		int score_Eng=inputScore();
		int score_Com=inputScore();
		char grade_Kor, grade_Eng, grade_Com;
		double point_Kor, point_Eng, point_Com;
		double gpa;
		int count4=0, count3=0, count2=0, count1=0, count0=0;
		while(score_Kor>=0 && score_Eng>=0 && score_Com>=0){
			
			if(score_Kor>100 || score_Eng>100 || score_Com>100){
				System.out.println("����:100�� �Ѿ, �������� ������ �ƴ� ���� �ֽ��ϴ�.");
			}
			
			else{
				grade_Kor=score2Grade(score_Kor);
				grade_Eng=score2Grade(score_Eng);
				grade_Com=score2Grade(score_Com);
				
				point_Kor=grade2Point(grade_Kor);
				point_Eng=grade2Point(grade_Eng);
				point_Com=grade2Point(grade_Com);
				
				gpa=calcGPA(point_Kor, point_Eng, point_Com);
				if(gpa>=4.0){
					count4++;
				}
				else if(gpa>=3.0&&gpa<4.0){
					count3++;
				}
				else if(gpa>=2.0&&gpa<3.0){
					count2++;
				}
				else if(gpa>=1.0&&gpa<2.0){
					count1++;
				}
				else{
					count0++;
				}
				
				System.out.println("[��   ��] ����:"+score_Kor+", ����:"+grade_Kor+", ����:"+point_Kor);
				System.out.println("[��   ��] ����:"+score_Eng+", ����:"+grade_Eng+", ����:"+point_Eng);
				System.out.println("[��ǻ��] ����:"+score_Com+", ����:"+grade_Com+", ����:"+point_Com);
				System.out.println("�� �л��� ��� ������"+gpa+" �Դϴ�.");
			}
			System.out.print(">�� ���� (����, ����, ��ǻ��)�� ������ ���ʷ� �Է��մϴ�:");
			score_Kor=inputScore();
			score_Eng=inputScore();
			score_Com=inputScore();
			
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��������� 4.0 �̻��� �л��� "+count4+"�� �Դϴ�.");
		System.out.println("��������� 3.0 �̻� 4.0 �̸��� �л��� "+count3+"�� �Դϴ�.");
		System.out.println("��������� 2.0 �̻� 3.0 �̸��� �л��� "+count2+"�� �Դϴ�.");
		System.out.println("��������� 1.0 �̻� 2.0 �̸��� �л��� "+count1+"�� �Դϴ�.");
		System.out.println("��������� 1.0 �̸��� �л��� "+count0+"�� �Դϴ�.");
		System.out.println("���α׷��� �����մϴ�.");
		
	}

	private static int inputScore()
	{
		int score=myScanner.nextInt();
		return score;
	}

	private static char score2Grade (int aScore)
	{
		char grade;
		if (aScore>=90 && aScore<=100){
			grade='A';
		}
		else if (aScore>=80 && aScore<90){
			grade='B';
		}
		else if (aScore>=70 && aScore<80){
			grade='C';
		}
		else if (aScore>=60 && aScore<70){
			grade='D';
		}
		else {
			grade='F';
		}
		return grade;
	}
	
	private static double grade2Point(char aGrade)
	{
		double point;
		
		if(aGrade=='A'){
			point=4.0;
		}
		else if(aGrade=='B'){
			point=3.0;
		}
		else if(aGrade=='C'){
			point=2.0;
		}
		else if(aGrade=='D'){
			point=1.0;
		}
		else{
			point=0.0;
		}
		return point;
	}

	private static double calcGPA(double x, double y, double z)
	{
		double gpa=(x+y+z)/3.0;
		return gpa;
	}

}
