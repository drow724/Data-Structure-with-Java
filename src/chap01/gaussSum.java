package chap01;

import java.util.Scanner;

public class gaussSum {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1����n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = stdIn.nextInt();
	
		int sum = (1+n)*n/2;
		
		System.out.println("1����" + n + "������ ����" + sum + "�Դϴ�.");
	}

}
