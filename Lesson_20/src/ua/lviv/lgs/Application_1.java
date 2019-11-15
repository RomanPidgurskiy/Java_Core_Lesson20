package ua.lviv.lgs;


public class Application_1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		MyThread myThread1 = new MyThread();	
		myThread1.start();
		myThread1.join();
		myThread1.sleep(1000);
		myThread1.Out_Print();
		

		
		RunnableThread runnableThread = new RunnableThread();
		Thread myThread2 = new Thread(runnableThread);
		myThread2.start();
		myThread2.join();
		myThread2.sleep(1000);
		runnableThread.Out_Print();

	}

}
