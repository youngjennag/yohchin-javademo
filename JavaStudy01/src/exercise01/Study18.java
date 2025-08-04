package exercise01;

public class Study18 {

	public static void main(String[] args) {
		Yoyaku_svc.zaseki = 5;
		Yoyaku_svc ys = new Yoyaku_svc();
		ys.start();
		
		User[] user = new User[5];
		Thread[] th = new Thread[5];
		for (int i = 0; i < user.length; i++) {
			user[i] = new User();
			th[i] = new Thread(user[i]);
			th[i].start();
		}
		
		try {
			ys.join();
			System.out.println("予約受付を終了しました。");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class Yoyaku_svc extends Thread {
	static int zaseki; // 座席数

	synchronized static void yoyaku() {
		Yoyaku_svc.zaseki--;
	}

	public void run() {
		while (Yoyaku_svc.zaseki != 0) {
			System.out.println("￥t残り座席数は" + Yoyaku_svc.zaseki + "席です。");
			try {
				sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}

class User implements Runnable {

	@Override
	public void run() {
		int time = (int)( Math.random() * 1000 + 1000); // 1秒から2秒 ランダム生成
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Yoyaku_svc.yoyaku();
		System.out.println("予約手続きをしました。" + time);
	}

}
