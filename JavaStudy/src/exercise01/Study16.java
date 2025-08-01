package exercise01;

public class Study16 {

	public static void main(String[] args) {
		String status = "正常終了";
		try {
			int[] a = new int[10];
			a[10] = 10;

		} catch (Exception e) {
			status = "異常終了";
			System.out.println(e + "の例外が発生しました。");
		} finally {
			System.out.println(status);

		}

	}

}
