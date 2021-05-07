package chap04;

public class Gstack_04_02<E> {
	private int max; // ������ �뷮
	private int ptr; // ���� ������
	private E[] stk; // ���� ��ü

	// ������ �� ���ܣ������� ��� ����
	public static class EmptyGstackException extends RuntimeException {
		public EmptyGstackException() {
		}
	}

	// ������ �� ���ܣ������� ���� ��
	public static class OverflowGstackException extends RuntimeException {
		public OverflowGstackException() {
		}
	}

	// ������
	public Gstack_04_02(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = (E[]) new Object[max]; // ���� ��ü�� �迭�� ����
		} catch (OutOfMemoryError e) { // ������ �� �����ϴ�.
			max = 0;
		}
	}

	// ���ÿ� x�� Ǫ��
	public E push(E x) throws OverflowGstackException {
		if (ptr >= max) // ������ ���� ��
			throw new OverflowGstackException();
		return stk[ptr++] = x;
	}

	// ���ÿ��� �����͸� �� (������� �����͸� ����)
	public E pop() throws EmptyGstackException {
		if (ptr <= 0) // ������ ��� ����
			throw new EmptyGstackException();
		return stk[--ptr];
	}

	// ���ÿ��� �����͸� ��ũ(������� �����͸� ���� ��)
	public E peek() throws EmptyGstackException {
		if (ptr <= 0) // ������ ��� ����
			throw new EmptyGstackException();
		return stk[ptr - 1];
	}

	// ���ÿ��� x�� �˻��Ͽ� index(ã�� ���ϸ� -1)�� ��ȯ
	public int indexOf(E x) {
		for (int i = ptr - 1; i >= 0; i--) // ������ʺ��� ���� �˻�
			if (stk[i].equals(x))
				return i; // �˻�����
		return -1; // �˻�����
	}

	// ������ ���
	public void clear() {
		ptr = 0;
	}

	// ������ �뷮�� ��ȯ
	public int capacity() {
		return max;
	}

	// ���ÿ� �׿��ִ� ������ ���� ��ȯ
	public int size() {
		return ptr;
	}

	// ������ ��� �ִ°�?
	public boolean isEmpty() {
		return ptr <= 0;
	}

	// ������ ���� á�°�?
	public boolean isFull() {
		return ptr >= max;
	}

	// ���� ���� �����͸� �ٴڡ������� ���ʷ� �����
	public void dump() {
		if (ptr <= 0)
			System.out.println("������ ������ϴ�.");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
}