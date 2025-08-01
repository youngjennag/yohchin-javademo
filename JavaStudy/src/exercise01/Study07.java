package exercise01;

public class Study07 {

	public static void main(String[] args) {
		Teppan t = new Teppan();
		Teppan t1 = new Teppan();
		Teppan t2 = new Teppan();
		Teppan t3 = new Teppan();
		
		System.out.println("鉄板は" + Teppan.cnt + "枚です");
		System.out.println("鉄板は" + Teppan.getCnt() + "枚です");
		
		t.setTemp();
		System.out.println("現在の温度は" + t.getTemp() + "度です");
		t.setTemp(200);
		System.out.println("現在の温度は" + t.getTemp() + "度です");
		// t.temp = 200;
		System.out.println(t.guzai + "を入れます。");
		System.out.println(t.kata + "の型を使って焼きます。");
		System.out.println(t.yaku());
	}
}

class Teppan {
	private int temp = 180;
	String guzai = "あんこ";
	String kata = "たいやき";
	// クラスフィールド
	static public int cnt = 0;
	static int getCnt() {
		return cnt;
	}
	
	//コンストラクタ
	Teppan(){
		this.temp = 0;
		cnt++;
	}

	// オーバーロード
	void setTemp() {
		this.temp = 180;
	}
	
	void setTemp(int temp) {
		this.temp = temp;
		System.out.println("温度を" + this.temp + "にしました。");
	}

	String yaku() {
		return temp + "度で焼きました。";
	}

	int getTemp() {
		return temp;
	}
	
}
