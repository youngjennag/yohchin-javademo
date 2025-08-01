package exercise01;

public class Study12 {

	public static void main(String[] args) {
		Human hm = new Human();
		Human hm2 = hm;
		hm.seibetsu="男";
		hm2.seibetsu="オス";
		hm.showSeibetsu();
		hm.walk();
		hm.talk();
		hm.showSeibetsu();
		System.out.println(hm);
	}

}

class Monkey{
	protected String seibetsu;
	void showSeibetsu() {
		System.out.println("性別は"+ seibetsu + "です。");
	}
	
	void walk() {
		System.out.println("手を使いながらですが、2足歩行で歩いています。");
	}
}

class Human extends Monkey{
	String seibetsu;
	void showSeibetsu() {
		super.seibetsu="オス";
		this.seibetsu="男";
		System.out.println(super.seibetsu);
		System.out.println(this.seibetsu);
	}
	void talk() {
		System.out.println("こんにちは");
	}
	
	void walk() {
		System.out.println("完全2足歩行であるいています。");
	}
}
