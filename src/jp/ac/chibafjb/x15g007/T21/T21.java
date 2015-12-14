package jp.ac.chibafjb.x15g007.T21;

import java.util.Scanner;

public class T21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner1 = new Scanner(System.in);
		System.out.printf("ハンバーガーの個数    -->");
		int s1 = scanner1.nextInt();
		System.out.printf("フライドポテトの個数  -->");
		int s2 = scanner1.nextInt();
		int h = 100;
		int p = 180;
		float GOKEI = (h * s1) + (p * s2);
		System.out.printf("ハンバーガーの代金　　＝　%d円\n", h * s1);
		System.out.printf("フライドポテトの代金　＝　%d円\n", p * s2);
		System.out.printf("小計　　　　　　　　　＝　%.0f円\n", GOKEI);
		System.out.printf("消費税　　　　　　　　＝　%.0f円\n", GOKEI * 0.08);
		System.out.printf("合計金額　　　　　　　＝　%.0f円\n", GOKEI * 1.08);
		System.out.printf("受取金額　　　　　　 -->　");
		int s3 = scanner1.nextInt();
		System.out.printf("つり銭　　　　　　　　＝　%d円", (int)(s3 - (GOKEI * 1.08)));
		scanner1.close();
	}

}
