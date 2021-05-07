package chap03;
// ���̵� �ο��ϴ� Ŭ����

class Id {
	private static int counter = 0;		// ���̵� �� �� �ο��ߴ��� ����
	private int id;						// ���̵�

	// ������
	public Id() { id = ++counter; }

	// ���̵� ��ȯ�ϴ� �ν���Ʈ �޼���
	public int getId() { return id; }

	// counter�� ��ȯ�ϴ� Ŭ���� �޼���
	public static int getCounter() { return counter; }
}

public class IdTester {
	public static void main(String[] args) {
		Id a = new Id();		// ���̵� 1
		Id b = new Id();		// ���̵� 2

		System.out.println("a�� ���̵�" + a.getId());
		System.out.println("b�� ���̵�" + b.getId());

		System.out.println("�ο��� ���̵��� ���� : " + Id.getCounter());
	}
}