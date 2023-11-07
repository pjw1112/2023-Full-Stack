package com.company.day029.etc;

public class ScoreProcess {
	// 변수
	@Override
	public String toString() {
		return "Score_calc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	

	public void proceed( Score score) {

		
			score.setAvg(String.format("%.2f", (float) ((score.getKor() + score.getEng() + score.getMath())) / 3.0)); // 평균 입력
			// 단순 입력 값들 처리 ENDb ====================================================
		
	
		
			if (Integer.parseInt(String.format("%.0f", Float.valueOf(score.getAvg()))) >= 60) // 조건 평균 70 이상

			{
				score.setPass("합격"); // TRUE -> 7열에 "합격" 입력
			} else {
				score.setPass("불합격"); // FALSE -> 7열에 "불합격" 입력
			} // 합력 불합격 입력 END========================================================

			if (Integer.parseInt(String.format("%.0f", Float.valueOf(score.getAvg()))) >= 60
					&& (score.getKor() <= 40 || // AND 국어 40 이상
							score.getEng() <= 40 || // AND 영어 40 이상
									score.getMath() <= 40)) // AND 수학 40 이상
			{
				score.setPass("재시험"); // 한 과목이라도 40점 이하이면 재시험
			}

		
	
//		for (int i = 0; i < users.length; i++) {
//			if (Integer.parseInt(String.format("%.0f", Float.valueOf(users[4]))) >= 95) { // 조건 평균 95 이상
//				users[7] = "장학생"; // TRUE -> 8열에 "장학생" 입력
//			} else {
//				users[7] = "---"; // FALSE -> 8열에 "---" 입력
//			}
//		}
//	
//		for (int i = 0; i < users.length; i++) {
//			users[8] = ""; // 초기 null값이 들어가 있기 때문에 ""으로 초기화
//			// 평균을 10으로 나눈 값만큼 for문을 돌려서 "#" 문자를 추가한다
//			for (int j = 0; j < Integer.parseInt(String.format("%.0f", Float.valueOf(users[4]))) / 10; j++) {
//				users[8] += "#";
//			} // 랭킹 처리 END ============================================================
//
//		}

	}


}// class END
