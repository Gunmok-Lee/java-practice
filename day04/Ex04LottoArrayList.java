package day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// 로또번호제작기
// 부제: 편한 arrayList 씁시다.
public class Ex04LottoArrayList {
	private static final int SIZE = 6;
	private static final int MAX = 45;
	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Integer> list = new ArrayList<>();
		//리스트에 값을 추가해보자
		//단 cintains가 false가 나올때만 값 추가
		//list의 사이즈가 6보다 작을 동안만 값 추가를 하면 된다.
		
		while(list.size() < SIZE) {
			int number = random.nextInt(MAX)+1;
			if(!list.contains(number)) {
				list.add(number);
			}
		}
	
		//정렬을 해봅시다.
		//근데 왜 정렬을 우리가 해야하나....
		//자바한테 시킵시다.
		
		//Collections라는 외부 클래스에 sort라는 메소드가 정의되어있다.
		//ctrl+space로 임포트해서 씁시다.
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("%d번째 숫자: %d\n", i, list.get(i));
			
		}
	}
}
