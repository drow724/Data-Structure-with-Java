package chap01;

import java.util.Scanner;

public class Sumfor_q7 {
		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			System.out.println("1����n������ ���� ���մϴ�.");
			System.out.print("n�� �� : ");
			int n = stdIn.nextInt();
			
			int sum = 0;
			int i = 1;
			for (i = 1; i < n; i++) {
				sum += i;
			System.out.print(i+"+");
			}
			sum += i;
			System.out.print(n+"="+sum);
		}
}
