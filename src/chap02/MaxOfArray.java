package chap02;

import java.util.Scanner;

public class MaxOfArray {

	static int maxOf(int[] a) {
		//�迭 a�� �ִ��� ���Ͽ� ��ȯ�մϴ�.
		int max = a[0];
		for (int i = 1; i < a.length; i++)
			if(a[i] > max)
				max = a[i];
		return max;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
				System.out.println("Ű�� �ִ밪�� ���մϴ�.");
				System.out.print("��� �� :");
				int num = stdIn.nextInt(); //�迭�� ��ڼ��� �Է� ����
				
				int[]height = new int[num]; // ��ڼ��� num�� �迭�� ����
				
				for(int i = 0; i < num; i++) {
					System.out.println("height[" + i + "] :");
					height[i] = stdIn.nextInt();
					
				}
				System.out.println("�ִ��� " + maxOf(height) + "�Դϴ�.");
		
	}

}
