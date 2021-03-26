package chap01;

import java.util.Scanner;

//public class Square_01_14 {
//
//	public static void main(String[] args) {
//		Scanner stdIn = new Scanner(System.in);
//		int n;
//		System.out.println("사각형을 출력합니다.");
//		n = stdIn.nextInt();
//		for(int i=1; i<=n; i++) {
//			System.out.println("\n");
//			for(int j=1; j<=n; j++)
//				System.out.print("*");
//		}
//	}
//
//}
public class Square_01_14 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("정사각형 모양으로 나타냅니다.");

		do {
			System.out.print("단수는：");
			n = stdIn.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}