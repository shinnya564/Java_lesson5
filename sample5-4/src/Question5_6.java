
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Question5_6 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("飲み物は何が好きですか？");
			System.out.println("あ：オレンジジュースです。");
			System.out.println("い：コーヒーです。");
			System.out.println("それ以外：どれでもありません。");
			System.out.println("あ,いどれかを選んでください");
			String line = reader.readLine();
			char c = line.charAt(0);
			switch (c) {
				case 'あ':
					System.out.println("オレンジジュースです");
					break;
				case 'い':
					System.out.println("コーヒーです。");
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
