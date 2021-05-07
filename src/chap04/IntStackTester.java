package chap04;
import java.util.Scanner;
// int�� ������ ��� ��

class IntStackTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64);	// �ִ� 64���� Ǫ���� �� �ִ� ����

		while (true) {
			System.out.println("���� ������ ����" + s.size() + " / "
															  + s.capacity());
			System.out.print("(1)Ǫ�á�(2)�ˡ�(3)��ũ��" +
								  "(4)������(0)���᣺");

			int menu = stdIn.nextInt();
			if (menu == 0) break;

			int x;
			switch (menu) {
			 case 1: 							// Ǫ��
				System.out.print("�����ͣ�");
				x = stdIn.nextInt();
				try {
					s.push(x);
			 	} catch (IntStack.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;

			 case 2: 							// ��
				try {
			 		x = s.pop();
					System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
			 	} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;

			 case 3: 							// ��ũ
				try {
			 		x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
			 	} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;

			 case 4: 							// ����
				s.dump();
				break;
			}
		}
	}
}