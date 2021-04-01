package ������;

import java.util.Scanner;

public class CardConvRev {
	
		static int cardConvR(int x, int r, char[] d) {
			int digits = 0;
			String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

			do {
				d[digits++] = dchar.charAt(x % r);
				x /= r;
			} while (x != 0);
			return digits;
	}

		public static void main(String[] args) {
			Scanner stdIn = new Scanner (System.in);
			int no;
			int cd;
			int dno;
			int retry;
			char[] cno = new char[32];
			do {
				do {
					System.out.print("��ȯ�ϴ� ���� �ƴ� ���� : ");
					no = stdIn.nextInt();
				}while (no<0);
			
			do {
				System.out.print("� ������ ��ȯ�ұ��? (2~36) : ");
				cd = stdIn.nextInt();
			}while (cd < 2 || cd > 36);
			
			dno = cardConvR(no, cd, cno);
			
			System.out.print(cd + "�����δ� ");
			for(int i = dno - 1; i>= 0; i--)
				System.out.print(cno[i]);
			System.out.print("�Դϴ�.");
			
			System.out.print("�� �� �� �ұ��? (1. ��/0. �ƴϿ�) : ");
			retry = stdIn.nextInt();			
			} while (retry == 1);
		}
}
