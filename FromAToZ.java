public class FromAToZ{
  public static String gimmeTheLetters(String s){
    
    // Start of Solution
    int start = (char) (s.charAt(0));
    int end = (char) (s.charAt(2));
    
    String out = "";
    
    for(int ctr = start; ctr <= end; ctr++){
      char let = (char) ctr;
      out += let + "";
    }
    
    return out;
    // End of Solution
    
  }
}
