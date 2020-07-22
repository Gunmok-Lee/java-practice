package day05;

// MVC 패턴
// Model: 데이터를 담는 클래스
// View: 데이터를 보여주는 클래스
// Controller: 데이터를 컨트롤 하는 클래스
public class ParkVO {
	/*
	 * VO란 Value Object라는 뜻이며 대표적인 Model 클래스의 접미사가 된다. (또다른 접미사는 Data Transfer
	 * Object DTO가 있다.) VO, DTO에는 필드, 겟터/셋터, equals, toString() 정도의 메소드만 들어가게 된다.
	 */

	// 차량 번호
	private String carNum;
	// 들어온 시간
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
