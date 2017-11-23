
public class Student {
	
//	비공개 속성들
	private String _studentNo;
	private int _score;
	
//	생성자
	public Student()
	{
		this._studentNo=null;
		this._score=0;
	}
	
	public void setStudentNo (String aStudentNo)
	{
		this._studentNo=aStudentNo;
	}
	
	public String studentNo ()
	{
		return this._studentNo;
	}
	
	public void setScore (int aScore)
	{
		this._score=aScore;
	}
	
	public int score ()
	{
		return this._score;
	}
	
	public char grade ()
	{
		if(this._score>=90){
			return 'A';
		}
		else if(this._score>=80){
			return 'B';
		}
		else if(this._score>=70){
			return 'C';
		}
		else if(this._score>=60){
			return 'D';
		}
		else{
			return 'F';
		}
		
	}
}
