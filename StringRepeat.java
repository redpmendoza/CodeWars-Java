public class StringRepeat{
    public static String repeatStr(final int repeat, final String string){
      
      // Start of Solution
      String out = "";
      
      for(int ctr = 0; ctr < repeat; ctr++){
        out += string;
      }
      
      return out;
      // End of Solution
      
    }
}
