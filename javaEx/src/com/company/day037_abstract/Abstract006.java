package com.company.day037_abstract;

abstract class Animal006 {
	public abstract String myani();
}

class Dog006 extends Animal006 {
	int age=8;
	class Doggie{
		int age=0;
	}
	public String myani() {
		// TODO Auto-generated method stub
		return "Dog";
	}

	public String bowwow() {
		return "멍멍";
	}
}

class Cat006 extends Animal006 {
	public String myani() {
		// TODO Auto-generated method stub
		return "Cat";
	}

	public String bowwow() {
		return "야옹";
	}
}

class Pig006 extends Animal006 {
	public String myani() {
		// TODO Auto-generated method stub
		return "Pig";
	}

	public String bowwow() {
		return "꿀꿀";
	}
}


public class Abstract006 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal006[] myani = {
			new Dog006(), new Cat006(), new Pig006()	
		};
		for(Animal006 ani : myani ) {
			System.out.print(ani.myani()+"\t");
			if(ani instanceof Dog006) {
				System.out.print(((Dog006)ani).bowwow()); 
			}
			if(ani instanceof Cat006) {
				System.out.print(((Cat006)ani).bowwow()); 
			}
			if(ani instanceof Pig006) {
				System.out.print(((Pig006)ani).bowwow()); 
			}
			
			
			System.out.println();
		}
		
		
		Dog006 dog = new Dog006();
		
		Dog006.Doggie mydoggie = dog.new Doggie();
		
		System.out.println( mydoggie.age);
		
		
		
		
	}

}
