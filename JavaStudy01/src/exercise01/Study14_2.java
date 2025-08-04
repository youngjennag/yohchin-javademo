package exercise01;

public class Study14_2 {

	public static void main(String[] args) {
		Monkey02 m = new Monkey02();
		m.move();
		m.talk();
	}
}

interface Animals {
	void talk();

	void move();
}

class Monkey02 implements Animals {

	@Override
	public void talk() {
		System.out.println("うっきー！");
	}

	@Override
	public void move() {
		System.out.println("動く");
		
	}

}
