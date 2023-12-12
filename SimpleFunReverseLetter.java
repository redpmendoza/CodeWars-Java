public class SimpleFunReverseLetter{
    public static String reverseLetter(final String str){
      
      // Start of Solution
      String out = "";
      
      for(int ctr = 0; ctr < str.length(); ctr++){
        if(Character.isLetter(str.charAt(ctr))){
          out = str.charAt(ctr) + out;
        }
      }
      
      return out;
      // End of Solution
      
    }
}
