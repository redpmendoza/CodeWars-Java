public class NumberStarLadder{
    public static String pattern(int n){
  
      // Start of Solution
      String out = "";
      
      for(int ctr = 1; ctr <= n; ctr++){
          for(int ctr2 = 1; ctr2 <= ctr; ctr2++){
                
              if(ctr2 == 1){
                  out += "1";
              }
              else{
                  out += "*";
              }
                
              if(ctr2 == ctr && ctr2 != 1){
                  out += ctr2;
              }
          }
        
          if(ctr != n){
              out += "\n";
          }
      }
      
      return out;
      // End of Solution
      
    }
}
