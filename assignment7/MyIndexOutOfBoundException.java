import java.util.Scanner;

class MyIndexOutOfBoundException extends Exception {
	private int lowerBound;
	private int upperBound;
	private int index;
	public MyIndexOutOfBoundException() {
		super();
	}
	
	public MyIndexOutOfBoundException (String message) {
		super(message);
	}
	
	public MyIndexOutOfBoundException(int lowerBound, int upperBound, int index) {
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
		this.index = index;
	}
	
	public String toString() {
		return "Error Message: Index: " + index + ", but lower bound: " + lowerBound + ", upper bound: " + upperBound;
	}

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Please input a word:");
			String test = input.nextLine();
			int index = test.length();
			int lowerBound = 5;
			int upperBound = 10;
			MyIndexOutOfBoundException indexOutOfBoundException = new MyIndexOutOfBoundException(lowerBound, upperBound, index);
			try {
				if (index < lowerBound || index > upperBound) {
					throw indexOutOfBoundException;
				}else {
					System.out.println("You are done!");
				}
			}catch (MyIndexOutOfBoundException e){
				RuntimeException e1 = new RuntimeException(e);
				throw e1;
			}
	}
}