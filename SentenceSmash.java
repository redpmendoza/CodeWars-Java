import java.util.Arrays;

public class SentenceSmash{
	public static String smash(String... words){
    
    // Start of Solution
    String out = "";
    
    for(int ctr = 0; ctr < words.length; ctr++){
      if(ctr == words.length - 1){
        out += words[ctr];
      }
      else{
        out += words[ctr] + " ";
      }
    }
    
    return out;
    // End of Solution
    
  }
}
