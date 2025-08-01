package exercise01;

public class Study04 {

	public static void main(String[] args) {
		int a = 4;
		if (a < 5) {
			System.out.println("aは5未満です。");
			if (a == 0) {
				System.out.println("aは０です。");
			} else {
				System.out.println("aは0ではありません。");
			}
		}

		switch (a) {
		case 0:
			System.out.println("aは0です。");
			break;
		case 1:
			System.out.println("aは1です。");
			break;
		default:
			System.out.println("aは０でも１でもありません。");
			break;
		}
	}
}
