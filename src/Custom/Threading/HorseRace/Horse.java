package Custom.Threading.HorseRace;

import java.util.*;

public class Horse extends Thread {
	int totalStep = 0;
	private static final int MAX_STEP = 100;
	
	public int getTotalStep() {
		return totalStep;
	}
	
	public Horse(String name) {
		super(name);	
	}

	@Override
	public void run() {
		while (totalStep < MAX_STEP) {

			try {
				
				int step = new Random().nextInt(10);
				if ((totalStep+step) > 100){
					totalStep = 100;
				} 
				else 
					totalStep += step;
				
				//System.out.println(getName() + " take " + step +" step ");
				Thread.sleep(1000);

			} catch (InterruptedException ex) {
				System.out.println(getName() + " Stop running");
			}

		}
		
		System.out.println(getName() + " Wins the race");
		super.getThreadGroup().stop();
		
	}
}
