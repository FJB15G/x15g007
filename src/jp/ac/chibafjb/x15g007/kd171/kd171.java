package jp.ac.chibafjb.x15g007.kd171;

public class kd171 {
	
	public static void main(String[] args){
		int k = 3;
		int data[] = {100,200,300};
		data[k] = data[k+1];
		System.out.printf("data[%d]=%d\n",k,data[k]);
	}
	

}
