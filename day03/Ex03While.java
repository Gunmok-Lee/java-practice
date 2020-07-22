package day03;
// while 반복문
// for 반복문은 그나마 몇번 반복이 될지 우리가 어느정도 예상 가능했지만
// while 반복문은 조건식이 true인 동안 영원히 반복된다!

public class Ex03While {
	public static void main(String[] args) {
		int i = 0;
		int count = 3;
		while(i <= count) {
			System.out.println("while 반복문!");
			count--;
		}
	}

}
