package day02;
//����ڷκ��� ���ڸ� �Է� �޾Ƽ�
//1~�� �������� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�� �� ���� 15���� �۾ƾ� �Ѵ�.
import java.util.Scanner;
public class Ex16ForLoop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int result = 1;
		System.out.print("���ڸ� �ϳ� �Է����ּ���: ");
		int userNumber = scanner.nextInt();
		
		if(userNumber < 15) {	
			for(int i = 1; i <= userNumber; i++) {
				result *= i;
	
		}
		System.out.println("�����: "+result);
		}else {
			System.out.println("15���� ũ�ų� ������ �۵����� �ʽ��ϴ�.");
		}
	
		scanner.close();
	}

}
