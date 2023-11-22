public class ANeedleInTheHaystack{
  public static String findNeedle(Object[] haystack){
    
    // Start of Solution
    String out = "";
    
    for(int ctr = 0; ctr < haystack.length; ctr++){
      if(haystack[ctr] == "needle"){
        out = "found the needle at position " + ctr;
      }
    }
    
    return out;
    // End of Solution
    
  }
}
