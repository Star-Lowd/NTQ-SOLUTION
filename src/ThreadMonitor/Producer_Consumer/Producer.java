package ThreadMonitor.Producer_Consumer;

public class Producer {
	static int a = 0;
	public static void test(){
		while(true){
			a++;
			System.out.println(a);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	public static void main(String[] args) {
		test();
	}
}
