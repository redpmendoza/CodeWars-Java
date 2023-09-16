public class WillThereBeEnoughSpace{
  public static int enough(int cap, int on, int wait){

    // Start of Solution
		int total = cap - on;
		int output = wait - total;
		
		if(output < 0){
		    return 0;
		}
		
		return output;
    // End of Solution
    
  }
}
