package day03;
import java.util.Scanner;
public class PrintStar09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("====����� 9��====");
		System.out.print("����� �� ���� �Է��ϼ���: ");
		int userNumber = scanner.nextInt();
		
		
		for(int i = 1; i <= userNumber; i++) {
			String stars = "";
			//������ ����ϴ� for��
			for(int j = 1; j <= userNumber - i; j++) {
				stars += " ";
			}
			//���� ����ϴ� for���� ���
			//���⼭���� ���� ������ 1 3 5 7 9 ..... 2 * i - 1���� �ȴ�.
			for(int j = 1; j <= 2 * i -1; j++) {
				stars += "*";
			}
			System.out.println(stars);
		}
		for(int i = userNumber-1; i >= 1; i--) {
			String stars = "";
			//������ ����ϴ� for��
			for(int j = 1; j <= userNumber - i; j++) {
				stars += " ";
			}
			//���� ����ϴ� for���� ���
			//���⼭���� ���� ������ 1 3 5 7 9 ..... 2 * i - 1���� �ȴ�.
			for(int j = 1; j <= 2 * i -1; j++) {
				stars += "*";
			}
			System.out.println(stars);
		}
		
		
		
		scanner.close();
	}

}


