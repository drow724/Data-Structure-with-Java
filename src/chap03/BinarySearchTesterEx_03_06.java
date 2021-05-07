package chap03;
import java.util.Arrays;
import java.util.Scanner;
// Arrays.binarySearch�� ���� �����˻�(������ �� ���� ����Ʈ�� ��Ÿ��)

class BinarySearchTesterEx_03_06 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("��ڼ���");
		int num = stdIn.nextInt();
		int[] x = new int[num]; // ��ڼ� num�� �迭

		System.out.println("������������ �Է��ϼ���.");

		System.out.print("x[0]��"); // �� �� ��Ҹ� �Է� ����
		x[0] = stdIn.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]��");
				x[i] = stdIn.nextInt();
			} while (x[i] < x[i - 1]); // �ϳ� ���� ��Һ��� ������ �ٽ� �Է�
		}

		System.out.print("ã�� ����"); // Ű ���� �Է� ����
		int ky = stdIn.nextInt();

		int idx = Arrays.binarySearch(x, ky); // �迭 x���� ���� ky�� ��Ҹ� �˻�

		if (idx < 0) {
			int insPoint = -idx - 1;
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
			System.out.printf("���� ����Ʈ�� %d�Դϴ�.\n", insPoint);
			System.out.printf("x[%d]�� �ٷ� �տ� %d�� �����ϸ� �迭�� ���� ���°� �����˴ϴ�.", insPoint, ky);
		} else
			System.out.println("�� ���� x[" + idx + "]�� �ֽ��ϴ�.");
	}
}
