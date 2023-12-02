import java.util.Arrays;

public class SortAndStar{
  public static String twoSort(String[] s){
    
    // Start of Solution
    String out = "";
    
    Arrays.sort(s);
    
    String word = s[0];
    
    for(int ctr = 0; ctr < word.length(); ctr++){
      
      if(ctr != word.length() - 1){
        out += word.charAt(ctr) + "***";
      }
      else{
        out += word.charAt(ctr);
      }
    }
    
    return out;
    // End of Solution
    
  }
} 
