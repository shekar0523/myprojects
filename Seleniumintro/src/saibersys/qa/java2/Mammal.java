package saibersys.qa.java2;

public class Mammal implements Animal {

	@Override
	public void eat() {
		System.out.println("mammal eats");
	}

	@Override
	public void travel() {
		System.out.println("mammal travels");
	}

	public static void main(String[] args) {
		Mammal m = new Mammal();
		m.eat();
		m.travel();
	}

}
