package exercise01;

public class Study14_1 {

	public static void main(String[] args) {
		Monkey01 m = new Monkey01();
		m.move();
		m.talk();
	}

}

abstract class Animal {
	abstract void talk();

	void move() {
		System.out.println("動く");
	}
}

class Monkey01 extends Animal {

	@Override
	void talk() {
		System.out.println("うっきー");
	}

}
