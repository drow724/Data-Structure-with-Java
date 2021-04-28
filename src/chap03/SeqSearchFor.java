package chap03;

import java.util.Scanner;

public class SeqSearchFor {
	
	static int seqSearch(int[] a, int n, int key) {
	
		for(int i = 0; i < n; i++)
			if (a[i] == key) 
				return i;
			return -1;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for( int i =0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int ky = stdIn.nextInt();
		int idx = seqSearch(x, num, ky);
		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) + [" + idx + "]에 있습니다.");
	}

}
