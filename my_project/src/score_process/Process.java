package score_process;

class Process {

	Process[] datas;

	public Process() {
	}

	public Process(Process[] datas) {
		super();
		this.datas = datas;

	}

	public void run(Student[] stds) {

		for (Process data : datas) {

			data.run(stds);
		}

	}

}

class Total extends Process {

	@Override
	public void run(Student[] stds) {
		// TODO Auto-generated method stub

		for (Student std : stds) {
			std.setTotal(std.getKor() + std.getMath() + std.getEng());

		}

	}

}

class Avg extends Process {

	@Override
	public void run(Student[] stds) {
		// TODO Auto-generated method stub
		for (Student std : stds) {
			std.setAvg((std.getKor() + std.getEng() + std.getMath()) / 3.0); // 평균 입력
		}
	}
}

class Pass extends Process {

	@Override
	public void run(Student[] stds) {
		// TODO Auto-generated method stub
		for (Student std : stds) {
			if (std.getAvg() >= 60) // 조건 평균 70 이상

			{
				std.setPass("합격"); // TRUE -> "합격" 입력
			} else {
				std.setPass("불합격"); // FALSE -> "불합격" 입력
			} // 합력 불합격 입력 END========================================================
		}
	}
}

class Money extends Process {

	@Override
	public void run(Student[] stds) {
		// TODO Auto-generated method stub
		for (Student std : stds) {

			if (std.getAvg() >= 95) { // 조건 평균 95 이상
				std.setMoney("장학생"); // TRUE -> "장학생" 입력
			} else {
				std.setMoney(""); // FALSE -> " " 입력
			}

		}
	}

}

class Star extends Process {

	@Override
	public void run(Student[] stds) {
		// TODO Auto-generated method stub

		for (Student std : stds) {
			std.setStar("");
			for (int j = 0; j < std.getAvg() / 10; j++) {
				std.setStar(std.getStar() + "★");
			}

		}
	}

}

class Show {

	public void show(Student[] stds) {
		// 출력 ================================================================
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		for (Student std : stds) {

			System.out.print(std.getName() + "\t" + std.getKor() + "\t" + std.getEng() + "\t"
					+ std.getMath() + "\t" + std.getTotal() + "\t" + String.format("%.2f", std.getAvg()) + "\t"
					+ std.getPass() + "\t" + std.getMoney() + "\t" + std.getStar());

			System.out.println();
		} // 출력 END==============================================================
	}

}
