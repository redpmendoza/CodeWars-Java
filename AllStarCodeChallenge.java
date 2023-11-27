public class AllStarCodeChallenge{
  public static int strCount(String str, char letter){
    
    // Start of Solution
    int count = 0;
    
    for(int ctr = 0; ctr < str.length(); ctr++){
      if((letter + "").equals(str.charAt(ctr) + "")){
        count++;
      }
    }
    
    return count;
    // End of Solution
    
  }
}
