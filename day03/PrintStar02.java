package day03;



import java.util.Scanner;
public class PrintStar02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("====별찍기 2번====");
		System.out.print("출력할 줄 수를 입력하세요: ");
		int userNumber = scanner.nextInt();
		// userNumber: 5
		// i의 현재값: 2
		// j의 현재값: 5
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