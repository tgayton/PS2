package base;

public class MyInteger {
	int iValue;

	public MyInteger(int iValue) {
		this.iValue = iValue;
	}

	public Integer getiValue() {
		return iValue;
	}

	public boolean isEven() {
		if (iValue % 2 == 0) {
			return true;
		}
		return false;
	}

	public boolean isOdd() {
		if (iValue % 2 != 0) {
			return true;
		}
		return false;
	}

	public boolean isPrime() {
		int factor = 0;
		for (factor = 2; factor <= iValue / 2; factor++) {
			if (iValue % factor != 0) {
				return true;
			}
		}
		return false;
	}

	public boolean isEven(int iValue) {
		if (iValue % 2 == 0) {
			return true;
		}
		return false;
	}

	public boolean isOdd(int iValue) {
		if (iValue % 2 != 0) {
			return true;
		}
		return false;
	}

	public static boolean isPrime(int iValue) {
		return isPrime(iValue);
	}

	public static boolean isEven(MyInteger myInt) {
		return myInt.isEven(myInt.getiValue());
	}

	public static boolean isOdd(MyInteger myInt) {
		return myInt.isOdd(myInt.getiValue());
	}

	public static boolean isPrime(MyInteger myInt) {
		return myInt.isPrime(myInt.getiValue());
	}

	public boolean equals(int intValue) {
		return iValue == intValue;
	}

	public boolean equals(MyInteger myInt) {
		return equals(myInt.getiValue());
	}
}
