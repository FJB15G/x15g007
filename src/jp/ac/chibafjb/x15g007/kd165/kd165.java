package jp.ac.chibafjb.x15g007.kd165;

public class kd165 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int m = 3;
		int a[] = { 5, 10, 15 };
		int b[] = new int[m];
		int i;
		for (i = 0; i < m; i++)
			b[m - i - 1] = a[i];
		for (i = 0; i < m; i++)
			System.out.printf("b[%d] = %d\n", i, b[i]);
	}

}
