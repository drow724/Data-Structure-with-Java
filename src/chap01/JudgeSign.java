package chap01;

import java.util.Scanner;

public class JudgeSign {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���. : ");
		int n = stdIn.nextInt();
		
		if (n > 0)
			System.out.println("�� ���� ����Դϴ�.");
		else if (n < 0)
			System.out.println("�� ���� �����Դϴ�.");
		else
			System.out.println("�� ���� 0�Դϴ�.");
	}

}
