

class demo implements Runnable{
	 synchronized  public void run() {
	String n=Thread.currentThread().getName();
	
		System.out.println(n);
	try {
		Thread.sleep(2000);
		System.out.println(n);
		System.out.println(n);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}}
		
	
}
public class A {

	public static void main(String[] args) {
		demo t1 = new demo();
		Thread d1 = new Thread(t1);
		Thread d2 = new Thread(t1);
		Thread d3 = new Thread(t1);
		d1.setName("a");
		d2.setName("b");
		d3.setName("c");
		d1.start();d2.start();d3.start();
	}

}
