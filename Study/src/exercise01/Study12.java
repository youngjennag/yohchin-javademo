package exercise01;

public class Study12 {

	public static void main(String[] args) {
		Human hm = new Human();
		hm.seibetsu="男";
		hm.showSeibetsu();
		hm.walk();
		hm.talk();
	}

}

class Monkey{
	String seibetsu;
	void showSeibetsu() {
		System.out.println("性別は"+ seibetsu + "です。");
	}
	
	void walk() {
		System.out.println("手を使いながらですが、2足歩行で歩いています。");
	}
}

class Human extends Monkey{
	void talk() {
		System.out.println("こんにちは");
	}
}
