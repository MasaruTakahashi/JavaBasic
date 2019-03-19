/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<Player>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				Player player = new Player();
				String line = scanner.nextLine();
				String[] playerdate = line.split(",");
				player.setPosition(playerdate[0]);
				player.setName(playerdate[1]);
				player.setCountry(playerdate[2]);
				player.setTeam(playerdate[3]);

				array.add(player);

			}

		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

		int gkcount = 0;
		int dfcount = 0;
		int mfcount = 0;
		int fwcount = 0;
		Collections.shuffle(array);
		for (int i = array.size() - 1; i >= 0; i--) {
			if (array.get(i).getPosition().equals("GK") && gkcount < 1) {
				System.out.println(array.get(i));
				gkcount++;
			}

		}
		for (int i = array.size() - 1; i >= 0; i--) {
			if (array.get(i).getPosition().equals("DF") && dfcount < 4) {
				System.out.println(array.get(i));
				dfcount++;
			}
		}
		for (int i = array.size() - 1; i >= 0; i--) {
			if (array.get(i).getPosition().equals("MF") && mfcount < 4) {
				System.out.println(array.get(i));
				mfcount++;
			}
		}
		for (int i = array.size() - 1; i >= 0; i--) {
			if (array.get(i).getPosition().equals("FW") && fwcount < 2) {
				System.out.println(array.get(i));
				fwcount++;
			}
		}

	}
}
