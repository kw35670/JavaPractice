package 第1章;
public class main {
	public static void main(String[] args) {
		final int age = 10;
		System.out.println("私の年齢は" + age + "歳です。");

		/* 
			コンパイルエラー
			age = 20;
		*/
		System.out.println("本当の年齢は" + age + "歳です");
	}
}