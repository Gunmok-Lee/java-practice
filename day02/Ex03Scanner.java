package day02;
//자바에서의 입력은
//우리가 직접 만드는게 아니라
//Scanner 라는 클래스의 변수(=객체)의
//메소드를 호출해서
//입력을 받게 한다.
//단 Scanner는 외부 클래스이기 때문에
//우리가 "수입"해 와야 한다.
import java.util.Scanner;
public class Ex03Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//정수를 입력받을 때에는
		//nextInt()메소드를 실행해주면 된다.
		System.out.print("정수를 입력하세요: ");
		int myNumber = scanner. nextInt();
		System.out.println("myNumber의 현재값: "+myNumber);
		//실수를 입력받을 때에는
		//nextDouble() 메소드를 실행해주면 된다.
		System.out.println("실수를 입력하세요: ");
		double myDouble = scanner.nextDouble();
		System.out.println("myDouble의 현재값: "+myDouble);
		
		//String(=여러개의 문자가 모여있는것)을 입력 받을 때에는
		//nextLine()을 실행해주면 된다.
		//단!!!!
		//한 가지 주의할 것이 있는데
		//nextInt()나 nextDouble()을 실행하고 나서 nextLine()을 쓸때에는
		//nextLine()을 한번 단독 실행시키고 나서 입력을 받아야 한다는 것이다.
		//왜냐하면 우리가 입력을 종료할때 쓰는 엔터키가 메모리에 남아있기 때문에
		//nextLine()에 버그가 생기기 때문이다.
		
		//nextLine을 단독 실행 시키는 방법은 매우 간단하다.
		//그냥 scanner.nextLine()만 적어주면 된다.
		//단!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//이클립스 자동완성 기능이 abc 알파벳 순서로 완성시키기 때문에
		//scanner.nextLine을 적으면
		//자동으로 자기가 hasNextLine()이라는 다른 메소드로 적어버린다.
		//scanner.nextLine()이 적혀있는지를 정확하게 확인하는 것이 중요하다!!!!
		scanner.nextLine();
		System.out.print("글자들을 입력하세요: ");
		String myString = scanner.nextLine();
		System.out.println("myString의 현재값: "+myString);
		System.out.println("프로그램 종료! ");
		
		//스캐너와 같이 메모리를 참조하는 클래스들은
		//close()라는 메소드가 있는데
		//사용이 끝난 후에 해당 close()메소드를 호출해주는 것이
		//좋은 방법이다.
		scanner.close();
	}
}
