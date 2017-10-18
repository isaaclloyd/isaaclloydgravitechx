

public class challenge101717{
	public static void main(String[] args) {
		int matchTime = 60 * 3; // total match time
		int minutes = 0;
		int seconds = 0;
		for (int time = 0 /* measured in sec */ ; time < matchTime; time++) {
			System.out.printf("Time %d:%d: ", minutes, seconds);
			seconds++;
			
			if(time%10 == 0) {
		    	resetCamera();
		    }
		    if(time%30 == 0) {
		    	flipGear();
		    }
		    if(time%60 == 0) {
		    	startCompressor();
		    }
		    System.out.println("End");
			try        
			{
				Thread.sleep(1000);
			    
			} 
			catch(InterruptedException ex) 
			{
			    
			    
				Thread.currentThread().interrupt();
			}
			if((time + 1)%60 == 0) {
		    	minutes++;
		    	seconds = 0;
		    }
		}
	}
	public static void startCompressor() { System.out.print("Starting Compressor -> "); };
	public static void flipGear() { System.out.print("Flipping Gear -> "); };
	public static void resetCamera() { System.out.print("Reseting Camera -> "); };
}