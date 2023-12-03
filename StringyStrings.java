public class StringyStrings{
  public static String stringy(int size){
    
    // Start of Solution
    String pattern = "";
    
    for(int ctr = 0; ctr < size; ctr++){
      if(ctr % 2 == 0){
        pattern += "1";
      }
      else{
        pattern += "0";
      }
    }
    
    return pattern;
    // End of Solution
    
  }
}
