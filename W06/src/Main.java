public class Main {

	public static void main(String[] args) {
		int degree = 1;
		while (degree >= 1 && degree <= 180){
			System.out.print("sine("+degree+")��: ");

			double radian = ((double) degree / 180.0) * 3.141592;
			double sineValue = MySine(radian);
			int numberOfAsteriks = (int)((sineValue * 40.0) + 0.5);
			printAsterisks(numberOfAsteriks);
			System.out.println();
			degree = degree + 5;
		}
	}

	private static double MySine(double x)
	{
		double xSquare = x*x;
		double currentTerm = x; //���� ���� �ʱ�ȭ
		double nextTerm;
		int n = 1;
		double sineValue = currentTerm; //sine ���� ���� ������ �ʱ�ȭ
		while (Math.abs(currentTerm) >= 0.000001) {
			nextTerm = - currentTerm * xSquare / (double) ((n + 1) * (n + 2));//���⼭ ���� �� (nextTerm)�� ���� ���
			n = n + 2;
			currentTerm = nextTerm;
			sineValue = sineValue + currentTerm; //���� ���� ���� ����
		}
		return sineValue;
	}

	private static void printAsterisks (int n) 
	{
		int x = 0;
		while (x < n) {
			System.out.print("*");
			x ++;
		}

	}

}