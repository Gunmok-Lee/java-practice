package day03;



import java.util.Scanner;
public class PrintStar02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("====����� 2��====");
		System.out.print("����� �� ���� �Է��ϼ���: ");
		int userNumber = scanner.nextInt();
		// userNumber: 5
		// i�� ���簪: 2
		// j�� ���簪: 5
		// stars: ****
		// *****
		for(int i = 1; i <= userNumber; i++) {
			String stars = "";
			
			for(int j = i; j <= userNumber; j++) {
				stars += "*";
			}
			
			System.out.println(stars);
		}
		
		
		
		scanner.close();
	}

}