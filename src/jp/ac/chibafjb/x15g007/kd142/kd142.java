package jp.ac.chibafjb.x15g007.kd142;

import java.util.Scanner;

public class kd142 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.printf("整数aの入力 -->");
		int s1 = scanner1.nextInt();
		System.out.printf("整数bの入力 -->");
		int s2 = scanner1.nextInt();
		scanner1.close();
		System.out.format("%d + %d = %d\n",s1,s2,s1+s2);
		System.out.format("%d - %d = %d\n",s1,s2,s1-s2);
		System.out.format("%d * %d = %d\n",s1,s2,s1*s2);
		System.out.format("%d / %d = %d\n",s1,s2,s1/s2);
		
	}

}
