package chap02;

import java.util.Scanner;

public class Rcopy {
	
	static void rcopy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for(int i = 0; i < num; i++) {
			a[i] = b[num-i-1];

		}
	}

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		
		System.out.print("a�� ��ڼ���?");
		int na = stdIn.nextInt();
		
		
		
		int[] a = new int[na];
		
		for(int i = 0; i<na; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("b�� ��ڼ���?");
		int nb = stdIn.nextInt();
				
			int[] b = new int[nb];
			
			for(int i = 0; i<nb; i++) {
				System.out.print("b[" + i + "] : ");
				b[i] = stdIn.nextInt();
		}
			rcopy(a,b);
			
			for(int i =0; i < na; i++) {
				System.out.println("a["+i+"] : " + a[i]);
			}
	}

}
//
//class Rcopy_02_05 {
//	// �迭 b�� ��� ��Ҹ� �迭 a�� �������� ����
//	static void rcopy(int[] a, int[] b) {
//		int num = a.length <= b.length ? a.length : b.length;
//		for (int i = 0; i < num; i++)
//			a[i] = b[b.length - i - 1];
//	}
//
//	public static void main(String[] args) {
//		Scanner stdIn = new Scanner(System.in);
//
//		System.out.print("a�� ��ڼ��� ��");
//		int numa = stdIn.nextInt(); // ��ڼ�
//		int[] a = new int[numa]; // ��ڼ� numa�� �迭
//		for (int i = 0; i < numa; i++) {
//			System.out.print("a[" + i + "] : ");
//			a[i] = stdIn.nextInt();
//		}
//
//		System.out.print("b�� ��ڼ��� ��");
//		int numb = stdIn.nextInt(); // ��ڼ�
//		int[] b = new int[numb]; // ��ڼ� numb�� �迭
//		for (int i = 0; i < numb; i++) {
//			System.out.print("b[" + i + "] : ");
//			b[i] = stdIn.nextInt();
//		}
//
//		rcopy(a, b); // �迭 b�� ��� ��Ҹ� �迭 a�� �������� copy
//
//		System.out.println("�迭 b�� ��� ��Ҹ� �迭 a�� �������� �����߽��ϴ�.");
//		for (int i = 0; i < numa; i++)
//			System.out.println("a[" + i + "] = " + a[i]);
//	}
//}

