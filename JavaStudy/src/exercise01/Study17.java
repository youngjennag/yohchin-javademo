package exercise01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Study17 {

	public static void main(String[] args) {
		try {
			// キーボード入力用のオブジェクト
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			// ファイル出力用のオブジェクト
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Study17.txt")));
			int cnt = 0;// 件数カウント
			while(true) {// 無限ループ
				System.out.println("キーボードから名前を入力してください。終了＝END");
				String str = br.readLine(); // キーボードから入力
				if (str.equals("END")) {
					break;
				}else {
					pw.println(str);
					cnt++;
				}
			}
			System.out.println(cnt + "件のデータをファイルに書き出した。");
			pw.close();
			
			// ファイル入力用のオブジェクト
			BufferedReader fr = new BufferedReader(new FileReader("Study17.txt"));
		
			String str = fr.readLine();
			cnt = 0;
			while(str != null) {
				System.out.println(str);
				str = fr.readLine();
				cnt++;	
			}
			System.out.println(cnt + "件	のデータを読み込み、画面に表示しました。");
			fr.close(); // ファイルのクローズ
			
		} catch (Exception e){
			System.out.println("例外発生");
		
		}
		

	}

}
