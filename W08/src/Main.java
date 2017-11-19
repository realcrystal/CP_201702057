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
		System.out.print(">두 과목 (국어, 컴퓨터)의 점수를 차례로 입력하시오 :");
		score_Kor=myScanner.nextInt();
		score_Com=myScanner.nextInt();
		while(score_Kor>=0 && score_Com>=0){
			if(score_Kor<=100 && score_Com<=100){
				scoresKorean[numberOfStudents]=score_Kor;
				scoresComputer[numberOfStudents]=score_Com;
				numberOfStudents++;
			}
			else{
				System.out.println("오류: 100점이 넘어서, 정상적인 점수가 아닙니다.");
			}
			System.out.print(">두 과목 (국어, 컴퓨터)의 점수를 차례로 입력하시오 :");
			score_Kor=myScanner.nextInt();
			score_Com=myScanner.nextInt();
		}
		myScanner.close();
		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("모두 "+numberOfStudents+"명의 성적이 입력되었습니다.");
		System.out.println();
		System.out.println("입력된 성적과 개인 평균은 다음과 같습니다.");
		int count=0;
		while(count<numberOfStudents){
			average[count]=(double) (scoresKorean[count]+scoresComputer[count])/2.0;
			System.out.print("["+count+"] "+scoresKorean[count]+" "+scoresComputer[count]);
			System.out.println(" (평균 "+average[count]+")");
			count++;
		}
		double sum=0;
		count=0;
		while(count<numberOfStudents){
			sum=sum+average[count];
			count++;
		}
		double classAverage=sum/(double) numberOfStudents;
		System.out.println("학급 평균은 "+classAverage+"입니다.");

		count=0;
		int aboveClassAverage=0;
		while(count<numberOfStudents){
			if(average[count]>=classAverage){
				aboveClassAverage++;
			}
			else{
			}
			count++; /* 카운트 if밖에서 세도록 !! 주의 !! */
		}
		System.out.println();
		System.out.println("평균 이상인 학생의 수는 "+aboveClassAverage+"명입니다.");
		System.out.println();
		System.out.println("프로그램을 종료합니다.");

	}

}
