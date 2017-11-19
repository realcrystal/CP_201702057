public class Main {

	public static void main(String[] args) {
		int degree = 1;
		while (degree >= 1 && degree <= 180){
			System.out.print("sine("+degree+")도: ");

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
		double currentTerm = x; //초항 값의 초기화
		double nextTerm;
		int n = 1;
		double sineValue = currentTerm; //sine 값을 초항 값으로 초기화
		while (Math.abs(currentTerm) >= 0.000001) {
			nextTerm = - currentTerm * xSquare / (double) ((n + 1) * (n + 2));//여기서 다음 항 (nextTerm)의 값을 계산
			n = n + 2;
			currentTerm = nextTerm;
			sineValue = sineValue + currentTerm; //현재 항의 값을 누적
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