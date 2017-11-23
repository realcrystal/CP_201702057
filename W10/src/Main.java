import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student student=new Student();
		GPACounter gpaCounter=new GPACounter();
		System.out.print("�� ���� (����, ����, ��ǻ��)�� ������ ���ʴ�� �Է��մϴ�:");
		int score_Kor=inputScore();
		int score_Eng=inputScore();
		int score_Com=inputScore();
		while(score_Kor>=0&&score_Eng>=0&&score_Com>=0){
			if(score_Kor>100||score_Eng>100||score_Com>100){
				System.out.println("����: 100�� �Ѿ, �������� ������ �ƴ� ���� �ֽ��ϴ�.");
			}
			else{
				student.setScoreKor(score_Kor);
				student.setScoreEng(score_Eng);
				student.setScoreCom(score_Com);
				char gradeKor=student.gradeKor();
				char gradeEng=student.gradeEng();
				char gradeCom=student.gradeCom();
				double pointKor=student.pointKor();
				double pointEng=student.pointEng();
				double pointCom=student.pointCom();
				double gpa = student.gpa();
				gpaCounter.count(gpa);
				System.out.println("[��   ��] ����:"+score_Kor+", ����:"+gradeKor+", ����:"+pointKor);
				System.out.println("[��   ��] ����:"+score_Eng+", ����:"+gradeEng+", ����:"+pointEng);
				System.out.println("[��ǻ��] ����:"+score_Com+", ����:"+gradeCom+", ����:"+pointCom);
				System.out.println("�� �л��� ��������� "+gpa+"�Դϴ�.");
			}
			System.out.print("�� ���� (����, ����, ��ǻ��)�� ������ ���ʴ�� �Է��մϴ�:");
			score_Kor=inputScore();
			score_Eng=inputScore();
			score_Com=inputScore();
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��������� 3.0 �̻��� �л��� "+gpaCounter.numberOfGPA3()+"�� �Դϴ�.");
		System.out.println("��������� 2.0 �̻� 3.0 �̸��� �л��� "+gpaCounter.numberOfGPA2()+"�� �Դϴ�.");
		System.out.println("��������� 1.0 �̻� 2.0 �̸��� �л��� "+gpaCounter.numberOfGPA1()+"�� �Դϴ�.");
		System.out.println("��������� 1.0 �̸��� �л��� "+gpaCounter.numberOfGPA0()+"�� �Դϴ�.");
		System.out.println("���α׷��� �����մϴ�.");

	}
	
	private static Scanner myScanner = new Scanner(System.in);
	
	private static int inputScore()
	{
		int score=myScanner.nextInt();
		return score;
		
	}

}