package day02;
// Switch 조건문
// Switch 조건문은 변수 한개를 선택해서
// 그 변수의 값들에 대해서 일일이 다 실행할 코드를 지정해준다.

public class Ex10Switch {
	public static void main(String[] args) {
		int number =2;
		switch(number) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		default:
			System.out.println("그외 입니다.");
			break;
		}
	}
}
