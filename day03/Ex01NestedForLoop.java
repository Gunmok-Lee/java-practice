package day03;
// ��øfor��
// ��ø for�� ���� ��쿡��
// �ٱ��� for���� �ѹ� ����
// ���� for���� ó������ ������ �� ����.
public class Ex01NestedForLoop {
	public static void main(String[] args) {
		//���� for���� Ư¡��
		//���� ���� for���� �ٱ��� for����
		//�ݺ�Ƚ���� ���� �ʿ䰡 ���� ���̴�.
		for(int i = 1; i <= 4; i++) {
			for(int j = 10; j <= 15; j++) {
				System.out.printf("i�� ���簪: %d, j�� ���簪: %d\n", i, j);
			}
			System.out.println("j for �� ����");
		}
		System.out.println("i for �� ����");
	}
}
