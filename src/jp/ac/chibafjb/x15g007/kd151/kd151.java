package jp.ac.chibafjb.x15g007.kd151;

import java.util.Scanner;

public class kd151 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner1 = new Scanner(System.in);
		System.out.printf("aの入力 -->");
		Float s1 = scanner1.nextFloat();
		System.out.printf("bの入力 -->");
		Float s2 = scanner1.nextFloat();
		
		System.out.printf("%.1f + %.1f = %f\n",s1,s2,s1+s2);
		System.out.printf("%.1f - %.1f = %f\n",s1,s2,s1-s2);
		System.out.printf("%.1f * %.1f = %f\n",s1,s2,s1*s2);
		System.out.printf("%.1f / %.1f = %f\n",s1,s2,s1/s2);
		
	}

}
