package day02;

import java.util.Scanner;

//사용자로부터
//이름, 학년, 국어, 영어, 수학 점수를 입력 받아서
//출력하는 프로그램을 작성하세요.
//출력할 때에는
//국어, 영어, 수학 점수를 3자리로 맞추고 왼쪽에 빈 공백이 있을 시에는 0으로 채우고
//국어, 영어, 수학을 토대로한 총점과 평균도 출력하되
//총점은 3자리, 왼쪽 공백엔 0을 넣고
//평균은 소숫점 2번째 자리까지 출력되게 프로그램을 작성하세요.
public class Ex04Scanner {
	public static void main(String[] ags) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름: ");
		String name = scanner.nextLine();

		System.out.print("학년: ");
		int grade = scanner.nextInt();

		System.out.print("국어 점수: ");
		int korean = scanner.nextInt();

		System.out.print("영어 점수: ");
		int english = scanner.nextInt();

		System.out.print("수학 점수: ");
		int math = scanner.nextInt();

		System.out.println("이름: " + name + ", 학년: " + grade + "학년");

		System.out.printf("국어: %03d점, 영어: %03d점, 수학: %03d점\n", korean, english, math);
		
		int sum = korean + english + math;

		System.out.printf("총점: %03d점 ,평균: %.2f\n", sum, sum / 3.0);


		scanner.close();
	}

}
