package day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// �ζǹ�ȣ���۱�
// ����: ���� arrayList ���ô�.
public class Ex04LottoArrayList {
	private static final int SIZE = 6;
	private static final int MAX = 45;
	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Integer> list = new ArrayList<>();
		//����Ʈ�� ���� �߰��غ���
		//�� cintains�� false�� ���ö��� �� �߰�
		//list�� ����� 6���� ���� ���ȸ� �� �߰��� �ϸ� �ȴ�.
		
		while(list.size() < SIZE) {
			int number = random.nextInt(MAX)+1;
			if(!list.contains(number)) {
				list.add(number);
			}
		}
	
		//������ �غ��ô�.
		//�ٵ� �� ������ �츮�� �ؾ��ϳ�....
		//�ڹ����� ��ŵ�ô�.
		
		//Collections��� �ܺ� Ŭ������ sort��� �޼ҵ尡 ���ǵǾ��ִ�.
		//ctrl+space�� ����Ʈ�ؼ� ���ô�.
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("%d��° ����: %d\n", i, list.get(i));
			
		}
	}
}
