package chap03;
import java.util.Arrays;
import java.util.Scanner;
// Arrays.binarySearch�� ���� �˻�

class BinarySearchTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("��ڼ���");
		int num = stdIn.nextInt();
		int[] x = new int[num];			// ��ڼ��� num�� �迭

		System.out.println("������������ �Է��ϼ���.");

		System.out.print("x[0]��");		// �迭�� ù ��Ҹ� ���� �Է��մϴ�.
		x[0] = stdIn.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]��");
				x[i] = stdIn.nextInt();
			} while (x[i] < x[i - 1]);	// �ٷ� ���� ��Һ��� ������ �ٽ� �Է��մϴ�.
		}

		System.out.print("�˻��� ����");	// Ű ���� �Է� ����
		int ky = stdIn.nextInt();

		int idx = Arrays.binarySearch(x, ky);	// �迭 x���� Ű ���� ky�� ��Ҹ� �˻�

		if (idx < 0)
			System.out.println(idx);
		else
			System.out.println(ky+"��(��) x[" + idx + "]�� �ֽ��ϴ�.");
	}
}