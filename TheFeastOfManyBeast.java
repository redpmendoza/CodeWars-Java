public class TheFeastOfManyBeast{
  public static boolean feast(String beast, String dish){
    
    // Start of Solution
    if((beast.charAt(0) + "").equals(dish.charAt(0) + "")){
      if((beast.charAt(beast.length() - 1) + "").equals(dish.charAt(dish.length() - 1) + "")){
        return true;
      }
      
    }
         
    return false;
    // End of Solution
    
  }
}
