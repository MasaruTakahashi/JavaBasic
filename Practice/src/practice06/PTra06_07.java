package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */

		for (int j = 1; j < 26; j++) {

			switch (j) {
			case 6:
			case 11:
			case 12:
			case 16:
			case 17:
			case 18:
			case 21:
			case 22:
			case 23:
			case 24:
				System.out.print("■");
				break;
			default:
				System.out.print("□");

				if (j % 5 == 0) {
					System.out.println("");
				}

			}
		}

		for (int l = 1; l < 26; l++) {

			switch (l) {
			case 14:
			case 18:
			case 19:
			case 22:
			case 23:
			case 24:

				System.out.print("□");
				break;
			case 10:
			case 15:
			case 20:
			case 25:
				System.out.print("□");
				System.out.println("");
				break;
			default:
				System.out.print("■");

				if (l % 5 == 0) {
					System.out.println("");
				}
			}
		}
	}
}
