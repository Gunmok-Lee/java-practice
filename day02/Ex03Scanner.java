package day02;
//�ڹٿ����� �Է���
//�츮�� ���� ����°� �ƴ϶�
//Scanner ��� Ŭ������ ����(=��ü)��
//�޼ҵ带 ȣ���ؼ�
//�Է��� �ް� �Ѵ�.
//�� Scanner�� �ܺ� Ŭ�����̱� ������
//�츮�� "����"�� �;� �Ѵ�.
import java.util.Scanner;
public class Ex03Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//������ �Է¹��� ������
		//nextInt()�޼ҵ带 �������ָ� �ȴ�.
		System.out.print("������ �Է��ϼ���: ");
		int myNumber = scanner. nextInt();
		System.out.println("myNumber�� ���簪: "+myNumber);
		//�Ǽ��� �Է¹��� ������
		//nextDouble() �޼ҵ带 �������ָ� �ȴ�.
		System.out.println("�Ǽ��� �Է��ϼ���: ");
		double myDouble = scanner.nextDouble();
		System.out.println("myDouble�� ���簪: "+myDouble);
		
		//String(=�������� ���ڰ� ���ִ°�)�� �Է� ���� ������
		//nextLine()�� �������ָ� �ȴ�.
		//��!!!!
		//�� ���� ������ ���� �ִµ�
		//nextInt()�� nextDouble()�� �����ϰ� ���� nextLine()�� ��������
		//nextLine()�� �ѹ� �ܵ� �����Ű�� ���� �Է��� �޾ƾ� �Ѵٴ� ���̴�.
		//�ֳ��ϸ� �츮�� �Է��� �����Ҷ� ���� ����Ű�� �޸𸮿� �����ֱ� ������
		//nextLine()�� ���װ� ����� �����̴�.
		
		//nextLine�� �ܵ� ���� ��Ű�� ����� �ſ� �����ϴ�.
		//�׳� scanner.nextLine()�� �����ָ� �ȴ�.
		//��!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//��Ŭ���� �ڵ��ϼ� ����� abc ���ĺ� ������ �ϼ���Ű�� ������
		//scanner.nextLine�� ������
		//�ڵ����� �ڱⰡ hasNextLine()�̶�� �ٸ� �޼ҵ�� ���������.
		//scanner.nextLine()�� �����ִ����� ��Ȯ�ϰ� Ȯ���ϴ� ���� �߿��ϴ�!!!!
		scanner.nextLine();
		System.out.print("���ڵ��� �Է��ϼ���: ");
		String myString = scanner.nextLine();
		System.out.println("myString�� ���簪: "+myString);
		System.out.println("���α׷� ����! ");
		
		//��ĳ�ʿ� ���� �޸𸮸� �����ϴ� Ŭ��������
		//close()��� �޼ҵ尡 �ִµ�
		//����� ���� �Ŀ� �ش� close()�޼ҵ带 ȣ�����ִ� ����
		//���� ����̴�.
		scanner.close();
	}
}
