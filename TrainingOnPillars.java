public class TrainingOnPillars{
  public static int pillars(int numPill, int dist, int width){
    
    // Start of Solution
    if(numPill < 2){
      return 0;
    }
    
    int distance = numPill * ((dist * 100) + width) - (width * 2) - (dist * 100);
    
    return distance; 
    // End of Solution
  
  }
}
