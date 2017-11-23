import java.util.Scanner;

public class Main {
	
	private static Student[] ban1;
	private static boolean moreStudentsExist;
	private static Student currentStudent = null;
	private static String studentNo;
	private static int score;
	private static int numberOfStudents=0;
	private static double average;
	private static int i;
	private static int aboveAverage=0;
	private static int numberOfGradeA;
	private static int numberOfGradeB;
	private static int numberOfGradeC;
	private static int numberOfGradeD;
	private static int numberOfGradeF;
	
	private static Scanner scanner = new Scanner (System.in);

	private static final int MAXSTUDENTS = 50 ;
	
	public static void main(String[] args) {
		ban1 = new Student[MAXSTUDENTS];
		
		inputAndStoreStudentInfo();
		
		System.out.println("-�Է��� �����մϴ�.");
		System.out.println();

		if(numberOfStudents>0){

			showStudentInfo();
			calcAverage();
			showAverageInfo();
			countStudentsByGrade();
			showGradeInfo();
	
		}
		else {
			System.out.println("�Էµ� ������ �����ϴ�.");
		}
		System.out.println();
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	private static void inputAndStoreStudentInfo()
	{
		moreStudentsExist = inputMoreStudentsExist();
		while (moreStudentsExist && numberOfStudents < MAXSTUDENTS){
			studentNo=inputStudentNo();
			score=inputScore();
			if (score<0 || score>100){
				System.out.println("[����] �߸��� ������ �ԷµǾ����ϴ�.");
			}
			else{
				currentStudent = new Student();
				currentStudent.setStudentNo(studentNo);
				currentStudent.setScore(score);
				ban1[numberOfStudents]=currentStudent;
				numberOfStudents++;
			}
			moreStudentsExist = inputMoreStudentsExist();
		}
	}
	
	private static boolean inputMoreStudentsExist ()
	{
		System.out.print("> �л� ������ �Է��Ϸ��� 'Y'��, �Է��� �����Ϸ��� 'N'�� �Է��Ͻÿ�: ");
		char userAnswer = scanner.next().charAt(0);
		if (userAnswer == 'Y' || userAnswer == 'y'){
			return true;
		}
		else {
			return false;
		}
	}
	
	private static String inputStudentNo ()
	{
		System.out.print("-�й��� �Է��Ͻÿ�: ");
		String number=scanner.next();
		return number;
	}
	
	private static int inputScore ()
	{
		System.out.print("-������ �Է��Ͻÿ�: ");
		int score=scanner.nextInt();
		return score;
	}

	private static void showStudentInfo ()
	{
		System.out.println("�л����� ���� ����Դϴ�.");
		i=0;
		for(i=0;i<numberOfStudents; i++){
			System.out.println("�й� :"+ban1[i].studentNo()+", ����:"+ban1[i].score()+", ����:"+ban1[i].grade());
		}
		System.out.println();
	}
	
	private static void calcAverage ()
	{
		int sum=0;
		for(i=0; i<numberOfStudents; i++){
			sum=sum+ban1[i].score();
		}
		average=(double)sum/(double)numberOfStudents;	
		for(i=0; i<numberOfStudents; i++){
			if((double) ban1[i].score() >average){
				aboveAverage++;
			}
		}
	}
	
	private static void showAverageInfo ()
	{
		System.out.println("����� "+average+"�� �Դϴ�.");
		System.out.println("��� �̻��� ������ ���� �л��� ��� "+aboveAverage+"�� �Դϴ�.");
	}
	
	private static void countStudentsByGrade ()
	{
		char currentGrade;
		for (i=0; i<numberOfStudents; i++){
			currentGrade=ban1[i].grade();
			if(currentGrade=='A'){
				numberOfGradeA++;
			}
			else if(currentGrade=='B'){
				numberOfGradeB++;
			}
			else if(currentGrade=='C'){
				numberOfGradeC++;
			}
			else if(currentGrade=='D'){
				numberOfGradeD++;
			}
			else {
				numberOfGradeF++;
			}
		}
	}
	
	private static void showGradeInfo ()
	{
		System.out.println();
		System.out.println("A ������ ���"+numberOfGradeA+"�� �Դϴ�.");
		System.out.println("B ������ ���"+numberOfGradeB+"�� �Դϴ�.");
		System.out.println("C ������ ���"+numberOfGradeC+"�� �Դϴ�.");
		System.out.println("D ������ ���"+numberOfGradeD+"�� �Դϴ�.");
		System.out.println("F ������ ���"+numberOfGradeF+"�� �Դϴ�.");
	}
}
