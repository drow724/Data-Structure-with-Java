package chap01;

import java.util.Scanner;

public class gaussSum {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1부터n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();
	
		int sum = (1+n)*n/2;
		
		System.out.println("1부터" + n + "까지의 합은" + sum + "입니다.");
	}

}
