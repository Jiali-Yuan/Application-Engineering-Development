/*Giving a non-negative integer num, repeatedly add
all its digit until the result has only one digit
For example, 38 return 2. 3 + 8 = 11 -> 1 + 1 = 2*/

class Question2 {
	public static void main(String[] args) {
		int test = 38;
		System.out.println(addToOneDigit(test));
	}
	
	public static int addDigit(int x) {
		int sum = 0;
		while (x > 0) {
			sum += x % 10;
			x = x / 10;
		}
		return sum;
	}
	
	public static int addToOneDigit(int y) {
		int sum = y;
		while (sum >= 10) {
			sum = addDigit(sum);
		}
		return sum;
	}
}