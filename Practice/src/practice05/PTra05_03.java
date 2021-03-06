package practice05;
/*
 * PTra05_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra05_03 {
	public static void main(String[] args) {
		// 入力型プログラムです。
		// 下記の命令は、入力型プログラムで必要な記述になります。
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		// ★ int型の変数indexを宣言して、0で初期化してください

		int index = 0;

		// ★ int型の変数mountainを宣言して、0で初期化してください

		int mountain = 0;

		// ★ int型の変数riverを宣言して、0で初期化してください

		int river = 0;

		// ★ int型の変数oceanを宣言して、0で初期化してください

		int ocean = 0;

		// ★ 変数indexが5未満である間繰り返す条件式を記述してください

		while (index < 5) {

			System.out.println((index + 1) + "人目");
			System.out.println("山、川、海でどこに行きたいか入力してください。");

			// コマンドプロンプトで入力した文字列が変数lineに代入されます
			String line = scanner.nextLine();

			/*
			 * ★ 以下の仕様で、switch文を記述してください
			 *
			 * ●変数lineが"山"であった場合		->	変数mountainに1加算
			 * ●変数lineが"川"であった場合		->	変数riverに1加算
			 * ●変数lineが"海"であった場合		->	変数oceanに1加算
			 * ●変数lineが上記以外であった場合	->	「無効票です」を出力
			 */

			switch (line) {
			case "山":
				mountain++;
				break;
			case "川":
				river++;
				break;
			case "海":
				ocean++;
				break;
			default:
				System.out.println("無効票です");

			}

			// ★ 変数indexに1を足して、変数indexに代入してください
			index = index + 1;

		}

		// ★ 変数mountain、river、oceanの票数をそれぞれ出力してください

		System.out.println("山" + mountain + "票、" + "川" + river + "票、" + "海" + ocean + "票、");

	}
}
