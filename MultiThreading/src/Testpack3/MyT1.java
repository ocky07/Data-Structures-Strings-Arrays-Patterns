package Testpack3;

public class MyT1 implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
		
			System.out.println(i+"hi");
			try {
				Thread.sleep(750);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
