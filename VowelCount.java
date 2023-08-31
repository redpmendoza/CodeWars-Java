public class Vowels {
  public static int getCount(String str) {
  
    // Start of Solution
    int count = 0;
    
    for(int ctr = 0; ctr < str.length(); ctr++){
      String let = str.charAt(ctr) + "";
      
      switch(let){
          case "a": case "e": case "i": case "o": case "u":
            count++;
          break;
      }
    }
    
    return count;
    // End of Solution
    
  }
}
