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
		
		
		System.out.print("a의 요솟수는?");
		int na = stdIn.nextInt();
		
		
		
		int[] a = new int[na];
		
		for(int i = 0; i<na; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("b의 요솟수는?");
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
//	// 배열 b의 모든 요소를 배열 a에 역순으로 복사
//	static void rcopy(int[] a, int[] b) {
//		int num = a.length <= b.length ? a.length : b.length;
//		for (int i = 0; i < num; i++)
//			a[i] = b[b.length - i - 1];
//	}
//
//	public static void main(String[] args) {
//		Scanner stdIn = new Scanner(System.in);
//
//		System.out.print("a의 요솟수는 ：");
//		int numa = stdIn.nextInt(); // 요솟수
//		int[] a = new int[numa]; // 요솟수 numa인 배열
//		for (int i = 0; i < numa; i++) {
//			System.out.print("a[" + i + "] : ");
//			a[i] = stdIn.nextInt();
//		}
//
//		System.out.print("b의 요솟수는 ：");
//		int numb = stdIn.nextInt(); // 요솟수
//		int[] b = new int[numb]; // 요솟수 numb인 배열
//		for (int i = 0; i < numb; i++) {
//			System.out.print("b[" + i + "] : ");
//			b[i] = stdIn.nextInt();
//		}
//
//		rcopy(a, b); // 배열 b의 모든 요소를 배열 a에 역순으로 copy
//
//		System.out.println("배열 b의 모든 요소를 배열 a에 역순으로 복사했습니다.");
//		for (int i = 0; i < numa; i++)
//			System.out.println("a[" + i + "] = " + a[i]);
//	}
//}

