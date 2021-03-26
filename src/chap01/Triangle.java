package chap01;

import java.util.Scanner;

public class Triangle {
	
	static void triangleLB(int n) {
		for (int i=1; i <= n; i++) {
			for (int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	static void triangleLU(int n) {
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= n - i + 1; j++) 	// n-i+1���� '*'�� ��Ÿ��
				System.out.print('*');
			System.out.println(); 
		}
	}
	static void triangleRU(int n) {
		for (int i = 1; i <= n; i++) { 				// i�� (i = 1, 2, �� ,n)
			for (int j = 1; j <= i - 1; j++) 		// i-1���� ' '�� ��Ÿ��
				System.out.print(' ');
			for (int j = 1; j <= n - i + 1; j++) 	// n-i+1���� '*'�� ��Ÿ��
				System.out.print('*');
			System.out.println();					// ����(�ٺ�ȯ)
		}
	}
	static void triangleRB(int n) {
		for (int i = 1; i <= n; i++) { 				// i�� (i = 1, 2, �� ,ln)
			for (int j = 1; j <= n - i; j++) 		// n-i���� ' '�� ��Ÿ��
				System.out.print(' ');
			for (int j = 1; j <= i; j++) 			// i���� '*'�� ��Ÿ��
				System.out.print('*');
			System.out.println(); 					// ����(�ٺ�ȯ)
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		System.out.println("�ܼ���?");
		n = stdIn.nextInt();
		
		triangleLB(n);
		triangleLU(n);
		triangleRU(n);
		triangleRB(n);
	}
}
