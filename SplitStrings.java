public class SplitStrings{
    public static String[] solution(String s){
    
      // Start of Solution
      int s_len = s.length();
      int size = 0;
        
      if(s_len % 2 == 0){
          size = s_len / 2;
      }
      else{
          size = (s_len / 2) + 1;
      }
        
      String ls[] = new String[size];
        
      String pair = "";
      int ind = 0;
        
      for(int ctr = 0; ctr < s_len; ctr++){
          if(ctr % 2 != 0){
              pair += s.charAt(ctr) + "";
              ls[ind] = pair;
              ind++;
              pair = "";
          }
          else{
             pair += s.charAt(ctr) + ""; 
          }
      }
        
      if(s_len % 2 != 0){
          ls[size - 1] = s.charAt(s_len - 1) + "_";
      }
      
      return ls;
      // End of Solution
      
    }
}
