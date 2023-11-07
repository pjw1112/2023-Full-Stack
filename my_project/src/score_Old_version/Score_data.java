package score_Old_version;

public class Score_data {

	//사용자에게 입력 받는 값
	private String user = "";
	private int kor = 0;
	private int eng = 0;
	private int mat = 0;
	
	//메서드에게 입력 받는 값
	private int tot = 0;
	private String avg = "";
	private String pass = "";
	private String scholarship = "";
	private String star = "";

	public Score_data() {
		super();
	}

	public Score_data(String user, int kor, int eng, int mat) {
		super();
		this.user = user;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public String getAvg() {
		return avg;
	}

	public void setAvg(String avg) {
		this.avg = avg;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getScholarship() {
		return scholarship;
	}

	public void setScholarship(String scholarship) {
		this.scholarship = scholarship;
	}

	public String getStar() {
		return star;
	}

	public void setStar(String star) {
		this.star = star;
	}

	@Override
	public String toString() {
		return "Score_data [user=" + user + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}

	
	
}
