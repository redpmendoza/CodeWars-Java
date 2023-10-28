public class DoubleChar{
  public static String doubleChar(String s){
    
    // Start of Solution
    String out = "";
    
    for(int ctr = 0; ctr < s.length(); ctr++){
      for(int ctr2 = 0; ctr2 < 2; ctr2++){
        out += s.charAt(ctr) + "";
      }
    }
    
    return out;
    // End of Solution
    
  }
}
