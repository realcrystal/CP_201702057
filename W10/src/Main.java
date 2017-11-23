import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student student=new Student();
		GPACounter gpaCounter=new GPACounter();
		System.out.print("세 과목 (국어, 영어, 컴퓨터)의 점수를 차례대로 입력합니다:");
		int score_Kor=inputScore();
		int score_Eng=inputScore();
		int score_Com=inputScore();
		while(score_Kor>=0&&score_Eng>=0&&score_Com>=0){
			if(score_Kor>100||score_Eng>100||score_Com>100){
				System.out.println("오류: 100이 넘어서, 정상적인 점수가 아닌 것이 있습니다.");
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
				System.out.println("[국   어] 점수:"+score_Kor+", 학점:"+gradeKor+", 평점:"+pointKor);
				System.out.println("[영   어] 점수:"+score_Eng+", 학점:"+gradeEng+", 평점:"+pointEng);
				System.out.println("[컴퓨터] 점수:"+score_Com+", 학점:"+gradeCom+", 평점:"+pointCom);
				System.out.println("이 학생의 평균평점은 "+gpa+"입니다.");
			}
			System.out.print("세 과목 (국어, 영어, 컴퓨터)의 점수를 차례대로 입력합니다:");
			score_Kor=inputScore();
			score_Eng=inputScore();
			score_Com=inputScore();
		}
		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("평균평점이 3.0 이상인 학생은 "+gpaCounter.numberOfGPA3()+"명 입니다.");
		System.out.println("평균평점이 2.0 이상 3.0 미만인 학생은 "+gpaCounter.numberOfGPA2()+"명 입니다.");
		System.out.println("평균평점이 1.0 이상 2.0 미만인 학생은 "+gpaCounter.numberOfGPA1()+"명 입니다.");
		System.out.println("평균평점이 1.0 미만인 학생은 "+gpaCounter.numberOfGPA0()+"명 입니다.");
		System.out.println("프로그램을 종료합니다.");

	}
	
	private static Scanner myScanner = new Scanner(System.in);
	
	private static int inputScore()
	{
		int score=myScanner.nextInt();
		return score;
		
	}

}