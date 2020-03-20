/*Write a program that calculate the sum value in an array of ints using 4 threads. 
You should construct an 4,000,000 long array of random numbers and return the sum 
of the array. Please finish those two method: generateRandomArray and sum.*/

import java.util.Random;

public class SumValue {

	static void generateRandomArray(int[] arr) {
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100);
			//System.out.println(arr[i]); //this line is to test the small amount of array 
		}		
	}	
		
	
	static long sum(int[] arr) {
		long sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
			
	public static void main(String[] args) {
		int[] arr = new int[4000000];
		generateRandomArray(arr);
		int[] arr1 = new int[1000000];
		int[] arr2 = new int[1000000];
		int[] arr3 = new int[1000000];
		int[] arr4 = new int[1000000];
		
		System.arraycopy(arr, 0, arr1, 0, 1000000);
		System.arraycopy(arr, 1000000, arr2, 0, 1000000);
		System.arraycopy(arr, 2000000, arr3, 0, 1000000);
		System.arraycopy(arr, 3000000, arr4, 0, 1000000);
			
		SumThread thread1 = new SumThread(arr1);
		SumThread thread2 = new SumThread(arr2);
		SumThread thread3 = new SumThread(arr3);
		SumThread thread4 = new SumThread(arr4);
			
		Thread one = new Thread(thread1);
		Thread two = new Thread(thread2);
		Thread three = new Thread(thread3);
		Thread four = new Thread(thread4);
			
		one.start();
		two.start();
		three.start();
		four.start();
			
		try {
			one.join();
			two.join();
			three.join();
			four.join();
		}catch(Exception e) {}
		
		long sum = thread1.getSum() + thread2.getSum() + thread3.getSum() + thread4.getSum();
		System.out.println("sum: " + sum);
	}
}

class SumThread implements Runnable {
	private long sum;
	private int[] arr;
	
	public SumThread(int[] array) {
		super();
		this.arr = array;
	}
	
	public long getSum() {
		return sum;
	}
	
	@Override
	public void run() {
		this.sum = SumValue.sum(arr);
	}
}
