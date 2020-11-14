
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Question5_5 {
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
			if (n == 1) {
				System.out.println("オレンジジュースです");
			}else if ( n==2 ) {
				System.out.println("コーヒーです。");
			}else {
				System.out.println("どちらでもありません");
			}
		}catch(IOException e){
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println("数字の形式が正しくありません");
		}
	}
}
