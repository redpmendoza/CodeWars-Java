public class WillYouMakeIt{
  public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft){
    
    // Start of Solution
    double travel = mpg * fuelLeft;
    
    if(travel >= distanceToPump){
      return true;
    }
    
    return false;
    // End of Solution
    
  }
}
