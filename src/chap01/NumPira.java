package chap01;

import java.util.Scanner;

//public class NumPira {
//
//	static void npira(int n) {
//		for (int i = 1; i <= n; i++) { 					// i행 (i = 1, 2, … ,n)
//			for (int j = 1; j <= n - i + 1; j++) 		// n-i+1개의 ' '를 나타냄
//				System.out.print(' ');
//			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1개의 '*'를 나타냄
//				System.out.print((i - 1) * 1 + 1);
//			System.out.println(); 						// 개행(줄변환)
//		}
//	}
//
//	public static void main(String[] args) {
//		Scanner stdIn = new Scanner(System.in);
//		int n;
//
//		System.out.println("피라미드 모양으로 나타냅니다.");
//
//		do {
//			System.out.print("단수는 ：");
//			n = stdIn.nextInt();
//		} while (n <= 0);
//
//		npira(n);
//	}
//}
class NumPira {
	static void npira(int n) {
		for (int i = 1; i <= n; i++) { 					// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= n - i + 1; j++) 		// n-i+1개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1개의 '*'를 나타냄
				System.out.print(i % 10);
			System.out.println(); 						// 개행(줄변환)
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("피라미드 모양으로 나타냅니다.");

		do {
			System.out.print("단수는 ：");
			n = stdIn.nextInt();
		} while (n <= 0);

		npira(n); // 피라미드를 나타냄
	}
}