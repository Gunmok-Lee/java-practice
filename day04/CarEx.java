package day04;

public class CarEx {
	public static void main(String[] args) {
		Car c = new Car();
		// ���� Car ��ü c�� �ʵ忡 �����͸� �־��
		// ��ü���� �޼ҵ� Ȥ�� �ʵ带 ���� �� ������
		// ���� ������ . �� ����Ѵ�.

		// null�� ��� �ƹ��͵� �� �� ����.
		// null�� �ʵ峪 ��ü�� �޼ҵ峪 �ʵ带 ȣ���ϴ°� ��ü��
		// �Ұ����ϴ�.
		// System.out.println(c.plateNumber.equals("abc"));

		// ���� �Ķ���Ͱ� ���� �����ڸ� ����� �� ���
		// ������ ������Ÿ���� ���� �ʵ��
		// ���ο��� �ش� ������Ÿ���� �����ڸ� ȣ�����ִ� ����� ���� ����̴�.

		// c.color = "�Ķ���";
		// c.plateNumber = "00�� 0000";
		// c.price = 20000000;
		// c.type = "�ҳ�Ÿ";
		// c.year = 2020;
		c.setColor("�Ķ���");
		c.setPlateNumber("00�� 0000");
		c.setPrice(20000000);
		c.setType("�ҳ�Ÿ");
		c.setYear(2020);

		System.out.println("���� ��ȣ�� " + c.getPlateNumber());

		System.out.println("���� ��ȣ�� " + c.getPlateNumber());

		// �޼ҵ带 ȣ���غ���
		// 1. �Ķ���Ͱ� ���� ��� ���� Ÿ���� ��򰡿� �� ����� �ʿ���� ����.
		c.getPlateNumber();
		String string1 = c.getPlateNumber();
		System.out.println("���� ��ȣ : " + string1);

		// 2. �Ķ���Ͱ� �ִ� ��� �� ���� �ݵ�� �Ķ���͸� ��ӵȴ�� �Ѱ��־�� �Ѵ�.
		// �� �Ķ���͸� �Ѱ��� ������ �̸��� Ʋ���� �ȴ�.
		String a = "00�� 0000";
		String b = "11�� 1111";

		System.out.println(c.checkPlateNumber("11�� 1111"));

		Car c2 = new Car();
		c2.setPlateNumber("99�� 9999");
		c2.setColor("������");
		c2.setPrice(10000000);
		c2.setType("���");
		c2.setYear(2020);

		Car c3 = new Car();
		c3.setPlateNumber("99�� 9999");
		c3.setColor("������");
		c3.setPrice(10000000);
		c3.setType("���");
		c3.setYear(2020);

		System.out.println(c3.equals(c2));

		// System.out.println()�� �Ķ���ͷ�
		// ��ü�� �Ѱ��ָ� System.out.println ��
		// �ش� ��ü�� toString() �޼ҵ��� �������
		// ȭ�鿡 ����ϰ� �ȴ�.
		System.out.println(c2);

	}
}
