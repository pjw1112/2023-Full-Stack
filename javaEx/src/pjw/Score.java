package pjw;

public class Score {
	// 변수

		private String[][] users = new String[5][9];

		String[] name = { "아이언맨", "헐크", "캡틴", "토르", "호크아이" };
		int[] kor = { 100, 20, 90, 70, 35 };
		int[] eng = { 100, 50, 95, 80, 100 };
		int[] mat = { 100, 30, 90, 60, 100 };

		

	

	static void step1(String users[][], String[] name, int[] kor, int[] eng, int[] mat) {

		for (int i = 0; i < users.length; i++) {
			// 단순 입력 값들 처리 =========================================================
			users[i][0] = name[i]; // 이름 입력
			users[i][1] = Integer.toString(kor[i]); // 국어 입력
			users[i][2] = Integer.toString(eng[i]); // 영어 입력
			users[i][3] = Integer.toString(mat[i]); // 수학 입력
			users[i][4] = String.format("%.2f",(float)((kor[i] + eng[i] + mat[i])) / 3.0); // 평균 입력
			// 단순 입력 값들 처리 ENDb ====================================================
		}
	}

	static void step2(String users[][]) {
		for (int i = 0; i < users.length; i++) {
			if (Integer.parseInt(String.format("%.0f", Float.valueOf(users[i][4]))) >= 60) // 조건 평균 70 이상
					
			{
				users[i][6] = "합격"; // TRUE -> 7열에 "합격" 입력
			} else {
				users[i][6] = "불합격"; // FALSE -> 7열에 "불합격" 입력
			} // 합력 불합격 입력 END========================================================
		
			if (	Integer.parseInt(String.format("%.0f", Float.valueOf(users[i][4]))) >= 60 && 
					(Integer.parseInt(users[i][1]) <= 40 || // AND 국어 40 이상
					Integer.parseInt(users[i][2]) <= 40 || // AND 영어 40 이상
					Integer.parseInt(users[i][3]) <= 40)) // AND 수학 40 이상
			{
				users[i][6] = "재시험"; // 한 과목이라도 40점 이하이면 재시험
			}
		
			
		
		}
	}

	static void step3(String users[][]) {
		for (int i = 0; i < users.length; i++) {
			if (Integer.parseInt(String.format("%.0f", Float.valueOf(users[i][4]))) >= 95) { // 조건 평균 95 이상
				users[i][7] = "장학생"; // TRUE -> 8열에 "장학생" 입력
			} else {
				users[i][7] = "---"; // FALSE -> 8열에 "---" 입력
			}
		}
	}

	static void step4(String users[][]) {
		for (int i = 0; i < users.length; i++) {
			users[i][8] = ""; // 초기 null값이 들어가 있기 때문에 ""으로 초기화
			// 평균을 10으로 나눈 값만큼 for문을 돌려서 "#" 문자를 추가한다
			for (int j = 0; j < Integer.parseInt(String.format("%.0f", Float.valueOf(users[i][4]))) / 10; j++) {
				users[i][8] += "#";
			} // 랭킹 처리 END ============================================================

		}
	}

	static void step5(String users[][]) {

//등수 처리#####################################################################
		// ※ 다른 입력값들과 달리 평균이 전부 다 입력 된 후 비교 되야 하기 때문에 for문을 따로 빼야 함
		// ※ 위의 for 문에 넣을 경우 1행째 항목들이 입력된 상태에서 이중for문 안쪽루프 진입, 2~5열 째 항목들을
		// ※ 비교하는 연산이 돌기 때문에 parseInt메소드내에서 String값이 null 인 예외처리가 나게 됨.
		int indexNum = 0;// 등수 처리를 위한 이중for문 안에서 쓸 변수
		for (int i = 0; i < users.length; i++) {
			indexNum = 0; // 바깥쪽 루프가 돌 때 마다 0으로 초기화
			for (int j = 0; j < users.length; j++) {
				if (Integer.parseInt(String.format("%.0f", Float.valueOf(users[i][4]))) <= Integer.parseInt(String.format("%.0f", Float.valueOf(users[i][4])))) {
					indexNum++;// j가 0행5열부터 4행5열까지 한바퀴 돌면서 i행 5열과 비교, i행 5열이 더 작을때 마다 등수에 1씩 더한다
					users[i][5] = Integer.toString(indexNum); // 6열에 값 할당
				}
			}
		}
	}

	static void step6(String users[][]) {

		// 출력 ================================================================
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("이름\t국어\t영어\t수학\t평균\t등수\t합격여부\t장학생\t랭킹");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		for (int i = 0; i < users.length; i++) {
			for (int j = 0; j < users[i].length; j++) {
				System.out.print(users[i][j] + "\t");
			}
			System.out.println();
		} // 출력 END==============================================================

	}

}// class END
