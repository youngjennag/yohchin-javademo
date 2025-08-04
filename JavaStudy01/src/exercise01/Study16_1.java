package exercise01;

public class Study16_1 {

	public static void main(String[] args) {
		Age a = new Age();
		try {
			// a.setAge(18);
			a.setAge(-1);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("例外発生");
		} finally {
			System.out.println("プログラム終了。");
		}

	}

}

// 例外オブジェクトの作成
class AgeException extends Exception {

}

class Age {
	private int age;

	void setAge(int age) throws AgeException {
		if (age < 0) {
			throw new AgeException();
		}
		this.age = age;
		System.out.println("年齢を" + age + "にセットしました。");
	}

}
