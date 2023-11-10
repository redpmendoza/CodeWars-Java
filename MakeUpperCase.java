class MakeUpperCase{
  public static String MakeUpperCase(String str){
    
    // Start of Solution
    String inp = "";
    
    for(int ctr = 0; ctr < str.length(); ctr++){
      String a = (str.charAt(ctr) + "").toUpperCase();
      inp += a + ""; 
    }
    
    return inp;
    // End of Solution
    
  }
}
