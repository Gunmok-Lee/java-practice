package day02;
//사용자로부터 숫자를 입력 받아서
//1~그 수까지의 곱을 구하는 프로그램을 작성하시오.
//단 그 수는 15보다 작아야 한다.
import java.util.Scanner;
public class Ex16ForLoop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int result = 1;
		System.out.print("숫자를 하나 입력해주세요: ");
		int userNumber = scanner.nextInt();
		
		if(userNumber < 15) {	
			for(int i = 1; i <= userNumber; i++) {
				result *= i;
	
		}
		System.out.println("결과값: "+result);
		}else {
			System.out.println("15보다 크거나 같으면 작동하지 않습니다.");
		}
	
		scanner.close();
	}

}
