public class School{
 	public static int getAverage(int[] marks){
    
    // Start of Solution
    int med = 0;
    for(int ctr = 0; ctr < marks.length; ctr++){
      med += marks[ctr];
    }
    
    return med/marks.length;
    // End of Solution
    
	}
}
