public class L1SetAlarm{
  public static boolean setAlarm(boolean employed, boolean vacation){
    
    // Start of Solution
    if(employed && !vacation){
      return true;
    }
    else{
      return false;
    }
    // End of Solution
    
  }
}
