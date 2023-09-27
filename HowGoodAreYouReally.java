public class HowGoodAreYouReally{
  public static boolean betterThanAverage(int[] classPoints, int yourPoints){
    
    // Start of Solution
    int total = 0;
    int size = classPoints.length;
    
    for(int ctr = 0; ctr < size; ctr++){
      total += classPoints[ctr];
    }
    
    total += yourPoints;
    
    int average = total/(size + 1);
    
    if(yourPoints > average){
      return true;
    }
    else{
      return false;
    }
    // End of Solution
    
  }
}
