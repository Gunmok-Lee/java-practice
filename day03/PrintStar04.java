package day03;
import java.util.Scanner;
public class PrintStar04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("====����� 4��====");
		System.out.print("����� �� ���� �Է��ϼ���: ");
		int userNumber = scanner.nextInt();
		
		
		for(int i = 0; i <= userNumber; i++) {
			String stars = "";
			//������ ����ϴ� for��
			for(int j = 1; j <= i; j++) {
				stars += " ";
			}
			
			//���� ����ϴ� for ��
			for(int j = 1; j <= userNumber - i; j++) {
				stars += "*";
				
			}
			
			System.out.println(stars);
		}
		
		
		
		scanner.close();
	}

}