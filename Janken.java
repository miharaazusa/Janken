package Hello;

import java.util.Scanner;

public class Janken {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("グーは1、チョキは2、パーは3を出してください");

		System.out.println("先手入力してください");
		int a = sc.nextInt();
		System.out.print("後手入力してください");
		int b = sc.nextInt();

		if(a==b) {
			System.out.print("あいこです");
		}else if(a+1==b || a==3&&b==1)
		System.out.println("先手の勝ちです");
	else {
		System.out.println("後手の勝ちです");
		}

	}
}