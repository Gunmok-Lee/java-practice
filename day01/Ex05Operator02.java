package day01;
// ����������
// ���������ڴ� ������ ����� ���� ��Ȯ�ϰ� 1���� �ٲ۴�.
// ++�� 1 ����
// --�� 1 ����
// �� ���������ڴ� ������ �տ� �ٳ� �ڿ� �ٳĿ� ����
// �ǹ̰� �޶����� �ȴ�!!!

public class Ex05Operator02 {
	public static void main(String[] args) {
		int number = 10;
		System.out.println("number�� ���� ��: "+number);
		//���������ڰ� ������ �տ� �ٰԵǸ�
		//�ش� �ٿ��� �켱������ ���� ���� �ȴ�
		//�� ���� ���� ������ �ȴ�!
		System.out.println("number�� ���� ��: "+ ++number);
		//���� �ڵ�� ũ�� 3���� �ܰ�� ������.
		//1. ++number -> number�� ���簪�� 1 �÷��� -> 11�� �ȴ�.
		//2. "number�� ���� ��: " + ++number
		//   number�� ���� ��: �ڿ� number�� ���簪�� 1 �ø� ���� �ٿ���
		// ->number�� ���� ��: 11
		//3. System.out.println("number�� ���� ��: " + ++number)
		// -> ��ȣ���� ������ ȭ�鿡 ����ض�
		
		System.out.println("number�� ���� ��: "+number);
		
		//������ ++�� ������ �ڿ� ������
		//�켱������ ���� ��������.
		//�� ���� �������� ������ �ȴ�.
		System.out.println("number�� ���� ��: "+ number++);
		
		//���� �ڵ��
		//1. "number�� ���� ��: " �ڿ� number�� �ٿ��ش�.
		//2. ȭ�鿡 ��ȣ���� ������ ȭ�鿡 ����Ѵ�.
		//3. number�� ���簪�� 1 ������Ų��.
		
		System.out.println("number�� ���� ��: "+number);
		
		// ++�� 1 ����
		// --�� 1 ����
		// **, //, %% �� �������� �ʴ´�.
	}
}