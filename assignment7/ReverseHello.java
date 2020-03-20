/*Write a program called ReverseHello.java that creates a thread 
(let's call it Thread 1). Thread 1 creates another thread (Thread 2); 
Thread 2 creates Thread 3; and so on, up to Thread 50. Each thread should print

Hello from Thread num!

but you should structure your program such that the threads print 
their greetings in reverse order.*/


public class ReverseHello {
	public static void main(String[] args) {
		HelloThread helloThread = new HelloThread();
		Thread t = new Thread(helloThread);
		t.start();
	}
	
}

class HelloThread implements Runnable {
			
	@Override
	public void run() {
		Thread thread;
		for (int i = 0; i < 50; i++) {
			thread = new Thread(this);
			System.out.println("Hello from Thread " + (50 - i) + "!");
		}
	}
}