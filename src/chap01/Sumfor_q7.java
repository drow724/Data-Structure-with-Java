package chap01;

import java.util.Scanner;

public class Sumfor_q7 {
		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			System.out.println("1부터n까지의 합을 구합니다.");
			System.out.print("n의 값 : ");
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
