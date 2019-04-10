package multithreading;
class MultithreadingDemo extends Thread {
   public void run() {
	System.out.println("run() ");
   }
   public static void main(String... ar) {
	
	MultithreadingDemo md = new MultithreadingDemo();
	md.start();
	System.out.println("MultiDemo");

  }
}
   	
	