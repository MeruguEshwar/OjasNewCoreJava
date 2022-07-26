package _10Encapusulation;

public class _01DebitCard {
	
	//Data hiding
	private int pinNumber;
	
	//Data Abstraction
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	
	public static void main(String[] args) {
		_01DebitCard dc = new _01DebitCard();
		dc.setPinNumber(1234);
		System.out.println("Entered pin is:"+dc.getPinNumber());
	}

}
