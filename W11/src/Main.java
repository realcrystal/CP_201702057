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
		
		System.out.println("-입력을 종료합니다.");
		System.out.println();

		if(numberOfStudents>0){

			showStudentInfo();
			calcAverage();
			showAverageInfo();
			countStudentsByGrade();
			showGradeInfo();
	
		}
		else {
			System.out.println("입력된 성적이 없습니다.");
		}
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
	}
	
	private static void inputAndStoreStudentInfo()
	{
		moreStudentsExist = inputMoreStudentsExist();
		while (moreStudentsExist && numberOfStudents < MAXSTUDENTS){
			studentNo=inputStudentNo();
			score=inputScore();
			if (score<0 || score>100){
				System.out.println("[오류] 잘못된 점수가 입력되었습니다.");
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
		System.out.print("> 학생 정보를 입력하려면 'Y'를, 입력을 종료하려면 'N'을 입력하시오: ");
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
		System.out.print("-학번을 입력하시오: ");
		String number=scanner.next();
		return number;
	}
	
	private static int inputScore ()
	{
		System.out.print("-점수를 입력하시오: ");
		int score=scanner.nextInt();
		return score;
	}

	private static void showStudentInfo ()
	{
		System.out.println("학생들의 성적 목록입니다.");
		i=0;
		for(i=0;i<numberOfStudents; i++){
			System.out.println("학번 :"+ban1[i].studentNo()+", 점수:"+ban1[i].score()+", 학점:"+ban1[i].grade());
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
		System.out.println("평균은 "+average+"점 입니다.");
		System.out.println("평균 이상의 점수를 받은 학생은 모두 "+aboveAverage+"명 입니다.");
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
		System.out.println("A 학점은 모두"+numberOfGradeA+"명 입니다.");
		System.out.println("B 학점은 모두"+numberOfGradeB+"명 입니다.");
		System.out.println("C 학점은 모두"+numberOfGradeC+"명 입니다.");
		System.out.println("D 학점은 모두"+numberOfGradeD+"명 입니다.");
		System.out.println("F 학점은 모두"+numberOfGradeF+"명 입니다.");
	}
}
