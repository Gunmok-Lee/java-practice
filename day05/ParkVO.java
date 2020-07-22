package day05;

// MVC ����
// Model: �����͸� ��� Ŭ����
// View: �����͸� �����ִ� Ŭ����
// Controller: �����͸� ��Ʈ�� �ϴ� Ŭ����
public class ParkVO {
	/*
	 * VO�� Value Object��� ���̸� ��ǥ���� Model Ŭ������ ���̻簡 �ȴ�. (�Ǵٸ� ���̻�� Data Transfer
	 * Object DTO�� �ִ�.) VO, DTO���� �ʵ�, ����/����, equals, toString() ������ �޼ҵ常 ���� �ȴ�.
	 */

	// ���� ��ȣ
	private String carNum;
	// ���� �ð�
	private int inTime;

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public int getInTime() {
		return inTime;
	}

	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ParkVO) {
			ParkVO p = (ParkVO)obj;
			if(carNum.equals(p.carNum)) {
				return true;
			}
		}
		
		return false;
	}
	
}
