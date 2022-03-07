
class Base extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Usha");
			
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub`
			Base base=new Base();
			base.start();
			
			for(int i=0;i<=5;i++) {
				System.out.println("Main method....");
				Thread.sleep(1000);
			}
			
			
	}

}
