package jp.ac.chibafjb.x15g007.kd143;

import java.util.Scanner;

public class kd143 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.printf("住所の入力 -->");
		String s1 = scanner1.next();
		System.out.printf("氏名の入力 -->");
		String s2 = scanner1.next();
		System.out.printf("電話番号の入力 -->");
		String s3 = scanner1.next();
		scanner1.close();
		
		System.out.printf("%s\n",s1);
		System.out.printf("%s\n",s2);
		System.out.printf("%s\n",s3);
		
		
	}

}
