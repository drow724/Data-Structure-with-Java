package chap01;

import java.util.Scanner;

public class Sub_b_to_a {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int a,b;
		
		System.out.println("a�� �� :");
		a = stdIn.nextInt();
		
		System.out.println("b�� �� :");
		b = stdIn.nextInt();
		
		while(true){
			if (a>b) {
				System.out.println("a���� ū ���� �Է��ϼ���!");
				b = stdIn.nextInt();
			}
			else {
				break;
			}
		}
		System.out.println("b - a�� " + (b-a) + "�Դϴ�.");
	}

}
