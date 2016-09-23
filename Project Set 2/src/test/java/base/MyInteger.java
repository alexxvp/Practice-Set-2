package base;

public class MyInteger {

	private int iValue;
	
	public MyInteger(int iValue) {
		this.iValue = iValue;
	}
	public int getiValue() {
		return iValue;
	}
	
	public boolean isEven() {
		if (this.getiValue() % 2 ==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isOdd() {
		if (this.getiValue() % 2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isPrime() {
		for (int i = 2; i < this.getiValue(); i++) {
			if (this.getiValue() % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(int iValue) {
		if (iValue % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isOdd(int iValue) {
		if (iValue % 2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isPrime(int iValue) {
		for (int i = 2; i < iValue; i++) {
			if (iValue % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger iValue) {
		return iValue.isEven();
	}
	public static boolean isOdd(MyInteger iValue) {
		return iValue.isOdd();
	}
	public static boolean isPrime(MyInteger iValue) {
		return iValue.isPrime();
	}
	
	public boolean equals(int i) {
		if (i == getiValue()) {
			return true;
		}
		return false;
	}
	public static boolean equals(MyInteger i) {
		return i.equals(i.getiValue());
	}
}
