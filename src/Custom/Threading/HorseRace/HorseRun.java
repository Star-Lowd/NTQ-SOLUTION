package Custom.Threading.HorseRace;

public class HorseRun {
	
	public static void main(String[] args) {
		System.out.println("Starting");
		
		Race r = new Race();
		r.start();
		
	}

}
