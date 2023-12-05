class AlternateCapitalization{
    public static String[] capitalize(String s){
      
      // Start of Solution
      String out1 = "", out2 = "";
      
      for(int ctr = 0; ctr < s.length(); ctr++){
        if(ctr % 2 == 0){
          out1 += (s.charAt(ctr) + "").toUpperCase();
          out2 += (s.charAt(ctr) + "");
        }
        else{
          out2 += (s.charAt(ctr) + "").toUpperCase();
          out1 += (s.charAt(ctr) + "");
        }
      }
      
      String arr[] = {out1, out2};
      
      return arr;
      // End of Solution
      
    }
}
