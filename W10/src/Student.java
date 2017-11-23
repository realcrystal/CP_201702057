
public class Student {

	private int _scoreKor;
	private int _scoreEng;
	private int _scoreCom;
	
	private char score2Grade (int aScore)
	{
		if (aScore >= 90){
			return 'A';
		}
		else if (aScore >= 80){
			return 'B';
		}
		else if (aScore >= 70){
			return 'C';
		}
		else if (aScore >= 60){
			return 'D';
		}
		else {
			return 'F';
		}
	}
	
	private double grade2Point (char aGrade)
	{
		if (aGrade =='A'){
			return 4.0;
		}
		else if (aGrade =='B'){
			return 3.0;
		}
		else if (aGrade =='C'){
			return 2.0;
		}
		else if (aGrade =='D'){
			return 1.0;
		}
		else{
			return 0.0;
		}
	}
	
	public Student() //������
	{
		this._scoreKor=0;
		this._scoreEng=0;
		this._scoreCom=0;
	}
	
	public void setScoreKor (int aScoreKor) //�־��� ������ �����Ѵ�
	{
		this._scoreKor = aScoreKor;
	}
	
	public int scoreKor () //���� ������ �ִ� ������ ����ڿ��� �����ش�
	{
		return this._scoreKor;
	}
	
	public char gradeKor () //���� ������ �ִ� ������ �ش��ϴ� ������ �����ش�
	{
		return this.score2Grade(this._scoreKor);
	}
	
	public double pointKor ()
	{
		return this.grade2Point(this.gradeKor());
	}
	
	public void setScoreEng (int aScoreEng)
	{
		this._scoreEng = aScoreEng;
	}
	
	public int scoreEng ()
	{
		return this._scoreEng;
	}
	
	public char gradeEng ()
	{
		return this.score2Grade(this._scoreEng);
	}
	
	public double pointEng ()
	{
		return this.grade2Point(this.gradeEng());
	}
	
	public void setScoreCom (int aScoreCom)
	{
		this._scoreCom = aScoreCom;
	}
	
	public int scoreCom ()
	{
		return this._scoreCom;
	}
	
	public char gradeCom ()
	{
		return this.score2Grade(this._scoreCom);
	}
	
	public double pointCom ()
	{
		return this.grade2Point(this.gradeCom());
	}
	
	public double gpa()
	{
		double gradePointKor, gradePointEng, gradePointCom;
		gradePointKor = this.pointKor();
		gradePointEng = this.pointEng();
		gradePointCom = this.pointCom();
		double gpa = (gradePointKor + gradePointEng + gradePointCom) / 3.0;
		return gpa;
	}
	
//	public double gradePoint () //���� ������ �ش��ϴ� ������ �����ش�
//	{
//		char currentGrade = this.grade();
//		switch (currentGrade){
//		case'A' : return 4.0 ;
//		case'B' : return 3.0 ;
//		case'C' : return 2.0 ;
//		case'D' : return 1.0 ;
//		default : return 0.0 ;
//		}
//	}

}