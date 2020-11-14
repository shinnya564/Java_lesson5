import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question5_4 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("飲み物は何が好きですか？");
			System.out.println("1：オレンジジュースです。");
			System.out.println("2：コーヒーです。");
			System.out.println("3：ミルクです。");
			System.out.println("それ以外：どれでもありません。");
			System.out.println("1,2,3どれかを選んでください");
			String line = reader.readLine();
			int n = Integer.parseInt(line);
			switch (n) {
			case 1:
				System.out.println("オレンジジュースです");
				break;
			case 2:
				System.out.println("コーヒーです。");
				break;
			case 3:
				System.out.println("ミルクです。");
				break;
			default:
				System.out.println("どちらでもありません");
				break;
			}
		}catch(IOException e){
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println("数字の形式が正しくありません");
		}
	}
}
