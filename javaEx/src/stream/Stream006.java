package stream;

import java.util.Arrays;
import java.util.List;

class Scoreb{
	private String name;
	private double avg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public Scoreb() {
		super();
	}
	public Scoreb(String name, double avg) {
		super();
		this.name = name;
		this.avg = avg;
	}
	
	
}



public class Stream006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Scoreb> list = Arrays.asList(
				new Scoreb("Sally",100),
				new Scoreb("Alpha",92)
				);
				
		list.stream().forEach(t -> 
			System.out.println(t.getName()+"\t"+t.getAvg())
				);
		
		
	}

}
