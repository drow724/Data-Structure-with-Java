package chap01;

import java.util.Scanner;

public class a_to_b {
	
	static int sumof (int a, int b) {
		if(a>b) {
			int sum = 0;
			for(int i = b; i<=a; i ++) {
				sum += i;
			}
			return sum;
		}
			else {
				int sum = 0;
				for(int i =a; i<=b; i ++) {
					sum += i;
				};
			return sum;
		}
	}
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("a����b������ ���� ���մϴ�.");
		System.out.print("a�� �� : ");
		int a = stdIn.nextInt();
		System.out.print("b�� �� : ");
		int b = stdIn.nextInt();
		
		int x = 0;
		int y = 0;
		
		if(a>b) {
			x = b;
			y = a;
		}
		else {
			x = a;
			y = b;
		}
		
		System.out.println(x + "����" + y + "������ ����" + sumof(a, b) + "�Դϴ�.");
	}

}
