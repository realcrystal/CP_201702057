import java.util.Scanner;

public class Main {
	
	private static final int MAX_SIZE = 100;
	
	private static Scanner myScanner = new Scanner(System.in);
	
	private static int inputScore ()
	{
		System.out.print(">������ �Է��Ͻÿ�: ");
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
				System.out.println("����:100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else{
				scores[numberOfStudents]=score;
				numberOfStudents++;
			}
			score=inputScore();
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��� "+numberOfStudents+"���� ������ �ԷµǾ����ϴ�.");
		
		average=calcAverage(scores, numberOfStudents);
		
		System.out.println("����� "+average+"�Դϴ�.");
		System.out.println();
		System.out.println("�Էµ� ������ ������ �����ϴ�.");
		
		int count=0;
		int aboveClassAverage=0;
		while(count < numberOfStudents){
			System.out.print("["+count+"] "+scores[count]);
			if((double)scores[count]>=average){
				System.out.println(" (��� �̻��Դϴ�)");
				aboveClassAverage++;
			}
			else{
				System.out.println(" (��� �̸��Դϴ�)");
			}
			count++;
		}
		System.out.println("��� �̻��� �л��� ���� "+aboveClassAverage+"�� �Դϴ�.");
		System.out.println();
		int max=calcMax(scores, numberOfStudents);
		System.out.println("�ְ����� "+max+"�� �Դϴ�.");
		int min=calcMin(scores, numberOfStudents);
		System.out.println("�������� "+min+"�� �Դϴ�.");
		System.out.println();
		System.out.println("�������� ������ �����ϴ�.");
		
		selectionSort(scores, numberOfStudents);
		count=0;
		while(count < numberOfStudents){
			System.out.println("["+count+"] "+scores[count]);
			count++;
		}
		System.out.println("���α׷��� �����մϴ�.");
	}

}
