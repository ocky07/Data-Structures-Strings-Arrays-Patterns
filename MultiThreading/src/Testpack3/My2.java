package Testpack3;

public class My2 implements Runnable {

	@Override
	public void run() {
		for(int i=10;i<15;i++) {
			System.out.println(i+"hello");
			try {
				Thread.sleep(78);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
