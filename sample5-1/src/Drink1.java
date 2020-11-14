import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drink1 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("飲み物は何が好きですか？");
			System.out.println("1：オレンジジュースです。");
			System.out.println("2：コーヒーです。");
			System.out.println("3：どちらでもありません。");
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
			default:
				System.out.println("どちらでもありません");
				break;
			}
		}catch(IOException e){
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println("数字の形式が正しくありません");
		}
		/*
		 * 選択を文字にて
		 */
		System.out.println("");
		reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("飲み物は何が好きですか？");
			System.out.println("a：オレンジジュースです。");
			System.out.println("b：コーヒーです。");
			System.out.println("c：どちらでもありません。");
			System.out.println("a,b,cどれかを選んでください");
			String line = reader.readLine();
			char c = line.charAt(0);
			switch (c) {
			case 'a':
				System.out.println("オレンジジュースです");
				break;
			case 'b':
				System.out.println("コーヒーです。");
				break;
			default:
				System.out.println("どちらでもありません");
				break;
			}
		}catch(IOException e){
			System.out.println(e);
		}
		/*
		 * 選択を文字列にて
		 */
		System.out.println("");
		reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("飲み物は何が好きですか？");
			System.out.println("オレンジジュースです(orange)");
			System.out.println("コーヒーです(coffee)");
			System.out.println("どちらでもありません(orher)");
			System.out.println("orange,coffee,otherどれかを選んでください");
			String line = reader.readLine();
			switch (line) {
			case "orange":
				System.out.println("オレンジジュースです");
				break;
			case "coffee":
				System.out.println("コーヒーです。");
				break;
			default:
				System.out.println("どちらでもありません");
				break;
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}
