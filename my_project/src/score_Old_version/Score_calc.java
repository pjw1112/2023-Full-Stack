package score_Old_version;

public class Score_calc {
	// 변수
	@Override
	public String toString() {
		return "Score_calc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	

	public void input( Score_data data) {

		
			// 단순 입력 값들 처리 =========================================================
			
			data.setAvg(String.format("%.2f", (float) ((data.getKor() + data.getEng()  + data.getMat() )) / 3.0)); // 평균 입력
			// 단순 입력 값들 처리 ENDb ====================================================
		
		
			if (Integer.parseInt(String.format("%.0f", Float.valueOf(users[4]))) >= 60) // 조건 평균 70 이상

			{
				users[6] = "합격"; // TRUE -> 7열에 "합격" 입력
			} else {
				users[6] = "불합격"; // FALSE -> 7열에 "불합격" 입력
			} // 합력 불합격 입력 END========================================================

			if (Integer.parseInt(String.format("%.0f", Float.valueOf(users[4]))) >= 60
					&& (Integer.parseInt(users[1]) <= 40 || // AND 국어 40 이상
							Integer.parseInt(users[2]) <= 40 || // AND 영어 40 이상
							Integer.parseInt(users[3]) <= 40)) // AND 수학 40 이상
			{
				users[6] = "재시험"; // 한 과목이라도 40점 이하이면 재시험
			}

		}
	
		for (int i = 0; i < users.length; i++) {
			if (Integer.parseInt(String.format("%.0f", Float.valueOf(users[4]))) >= 95) { // 조건 평균 95 이상
				users[7] = "장학생"; // TRUE -> 8열에 "장학생" 입력
			} else {
				users[7] = "---"; // FALSE -> 8열에 "---" 입력
			}
		}
	
		for (int i = 0; i < users.length; i++) {
			users[8] = ""; // 초기 null값이 들어가 있기 때문에 ""으로 초기화
			// 평균을 10으로 나눈 값만큼 for문을 돌려서 "#" 문자를 추가한다
			for (int j = 0; j < Integer.parseInt(String.format("%.0f", Float.valueOf(users[4]))) / 10; j++) {
				users[8] += "#";
			} // 랭킹 처리 END ============================================================

		}

	}

	
	
	
	
	public void step6(String[] users) {

		// 출력 ================================================================
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("이름\t국어\t영어\t수학\t평균\t등수\t합격여부\t장학생\t랭킹");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		for (int i = 0; i < users.length; i++) {
			for (int j = 0; j < users.length; j++) {
				System.out.print(users[j] + "\t");
			}
			System.out.println();
		} // 출력 END==============================================================

	}

}// class END
