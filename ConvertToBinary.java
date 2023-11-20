public class ConvertToBinary{
  public static int toBinary(int n){

    // Start of Solution
    String out = "";
    
    while(n != 0){
      if(n % 2 != 0){
        out = "1" + out;
      }
      else{
        out = "0" + out;
      }
      
      n = n / 2;
    }
    
    return Integer.valueOf(out);
    // End of Solution
  
  }
}
