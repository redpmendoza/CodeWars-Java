public class RemoveStringSpaces{
    public static String noSpace(final String x){
      
      // Start of Solution
      String out = "";
      
      for(int ctr = 0; ctr < x.length(); ctr++){
        if(!(x.charAt(ctr) + "").equals(" ")){
          out += x.charAt(ctr) + "";
        }
      }
      
      return out;
      // End of Solution
      
    }
}
