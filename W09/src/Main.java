import java.util.Scanner;

public class Main {
	
	private static final int MAX_SIZE = 100;
	
	private static Scanner myScanner = new Scanner(System.in);
	
	private static int inputScore ()
	{
		System.out.print(">점수를 입력하시오: ");
		int userInputScore=myScanner.nextInt();
		return userInputScore;
	}
	
	private static int calcMax (int[] elements, int aSize)
	{
		int max = elements[0];
		int count = 1;
		while (count < aSize){
			if (max < elements[count]){
				max=elements[count];
			}
			count++;
		}
		return max;
	}
	
	private static int calcMin (int[] elements, int aSize)
	{
		int min = elements[0];
		int count = 1;
		while (count < aSize){
			if (min > elements[count]){
				min=elements[count];
			}
			count++;
		}
		return min;
	}
	
	private static double calcAverage (int[] elements, int aSize)
	{
		int count=0;
		int sum=0;
		double average;
		while(count<aSize){
			sum=sum+elements[count];
			count++;
		}
		average = (double)sum/(double)(aSize);
		return average;
	}

	private static void selectionSort (int[] elements, int aSize)
	{
		int lastLoc = aSize-1;
		int maxLoc;
		int maxValue;
		int currentLoc;
		
		int selectionLoc=0;
		while (selectionLoc < lastLoc){
			maxLoc=selectionLoc;
			maxValue=elements[maxLoc];
			currentLoc=selectionLoc+1;
			while(currentLoc<=lastLoc){
				if (elements[currentLoc] > maxValue){
					maxLoc = currentLoc;
					maxValue=elements[currentLoc];
				}
				currentLoc++;
			}
			elements[maxLoc]=elements[selectionLoc];
			elements[selectionLoc]=maxValue;
			selectionLoc++;
		}
	}
	
	public static void main(String[] args) {
		
		int score;
		int[] scores = new int[MAX_SIZE];
		int numberOfStudents=0;
		double average;
		
		score=inputScore();
		while (score>=0){
			if(score>100){
				System.out.println("오류:100이 넘어서, 정상적인 점수가 아닙니다.");
			}
			else{
				scores[numberOfStudents]=score;
				numberOfStudents++;
			}
			score=inputScore();
		}
		System.out.println("음의 정수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("모두 "+numberOfStudents+"명의 성적이 입력되었습니다.");
		
		average=calcAverage(scores, numberOfStudents);
		
		System.out.println("평균은 "+average+"입니다.");
		System.out.println();
		System.out.println("입력된 성적은 다음과 같습니다.");
		
		int count=0;
		int aboveClassAverage=0;
		while(count < numberOfStudents){
			System.out.print("["+count+"] "+scores[count]);
			if((double)scores[count]>=average){
				System.out.println(" (평균 이상입니다)");
				aboveClassAverage++;
			}
			else{
				System.out.println(" (평균 미만입니다)");
			}
			count++;
		}
		System.out.println("평균 이상인 학생의 수는 "+aboveClassAverage+"명 입니다.");
		System.out.println();
		int max=calcMax(scores, numberOfStudents);
		System.out.println("최고점은 "+max+"점 입니다.");
		int min=calcMin(scores, numberOfStudents);
		System.out.println("최저점은 "+min+"점 입니다.");
		System.out.println();
		System.out.println("성적순은 다음과 같습니다.");
		
		selectionSort(scores, numberOfStudents);
		count=0;
		while(count < numberOfStudents){
			System.out.println("["+count+"] "+scores[count]);
			count++;
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
