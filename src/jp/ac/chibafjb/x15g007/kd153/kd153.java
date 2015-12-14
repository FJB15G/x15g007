package jp.ac.chibafjb.x15g007.kd153;

import java.util.Scanner;

public class kd153 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner1 = new Scanner(System.in);

		System.out.printf("半径r -->");
		Float s1 = scanner1.nextFloat();
		double π = 3.14;
		System.out.printf("円周 = %.1f\n", 2 * π * s1);
		System.out.printf("面積 = %.1f\n", π * s1 * s1);
	}

}
