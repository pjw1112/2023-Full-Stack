package score_process;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] std = { new Student("아이언맨", 100, 100, 100), new Student("헐크", 90, 60, 80),
				new Student("블랙팬서", 20, 60, 90) };

		Process[] datas = { new Total(), new Avg(), new Pass(), new Money(), new Star() };

		Process process = new Process(datas);
		process.run(std);

		System.out.println(  process.hashCode() );
		
		
		// 출력
		Show print = new Show();
		print.show(std);
	}

}
