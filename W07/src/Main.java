import java.util.Scanner;

public class Main {
	private static Scanner myScanner=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print(">세 과목 (국어, 영어, 컴퓨터)의 점수를 차례로 입력합니다:");
		int score_Kor=inputScore();
		int score_Eng=inputScore();
		int score_Com=inputScore();
		char grade_Kor, grade_Eng, grade_Com;
		double point_Kor, point_Eng, point_Com;
		double gpa;
		int count4=0, count3=0, count2=0, count1=0, count0=0;
		while(score_Kor>=0 && score_Eng>=0 && score_Com>=0){
			
			if(score_Kor>100 || score_Eng>100 || score_Com>100){
				System.out.println("오류:100이 넘어서, 정상적인 점수가 아닌 것이 있습니다.");
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
				
				System.out.println("[국   어] 점수:"+score_Kor+", 학점:"+grade_Kor+", 평점:"+point_Kor);
				System.out.println("[영   어] 점수:"+score_Eng+", 학점:"+grade_Eng+", 평점:"+point_Eng);
				System.out.println("[컴퓨터] 점수:"+score_Com+", 학점:"+grade_Com+", 평점:"+point_Com);
				System.out.println("이 학생의 평균 평점은"+gpa+" 입니다.");
			}
			System.out.print(">세 과목 (국어, 영어, 컴퓨터)의 점수를 차례로 입력합니다:");
			score_Kor=inputScore();
			score_Eng=inputScore();
			score_Com=inputScore();
			
		}
		System.out.println("음의 정수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("평균평점이 4.0 이상인 학생은 "+count4+"명 입니다.");
		System.out.println("평균평점이 3.0 이상 4.0 미만인 학생은 "+count3+"명 입니다.");
		System.out.println("평균평점이 2.0 이상 3.0 미만인 학생은 "+count2+"명 입니다.");
		System.out.println("평균평점이 1.0 이상 2.0 미만인 학생은 "+count1+"명 입니다.");
		System.out.println("평균평점이 1.0 미만인 학생은 "+count0+"명 입니다.");
		System.out.println("프로그램을 종료합니다.");
		
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
