class Base1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Runnable");
		}
	}

}

public class run {
	public static void main(String[] args) {
		Base1 base=new Base1();
		//Interface doesnot have capacity to call its own method. Hence we called that method using Thread object
		Thread thread=new Thread(base);
		thread.start();
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("Main Method");
		}
	}
}
