package jp.ac.chibafjb.x15g007.kd161;

public class kd161 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [] test;
		test = new int[2];
		test[0] = 10;
		test[1] = 20;
		int work = 0;
		work = test[1];
		test[1]=test[0];
		test[0] = work;
		for(int i=0;i<2;i++)
		System.out.printf("test[%d] = %d\n",i,test[i]);
		System.out.printf("%d",work);
		}
}
