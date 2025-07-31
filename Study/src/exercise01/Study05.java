package exercise01;
import java.io.*;

public class Study05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("お名前を教えてください");
		String name = br.readLine();
		System.out.println("こんにちは" + name + "さん");
		int age;
		System.out.println("年齢を教えてください");
		age = Integer.parseInt(br.readLine());
		System.out.println(age +"歳なんですね。");

	}

}
