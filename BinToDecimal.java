public class BinToDecimal{
  public static int binToDecimal(String inp){
    
    // Start of Solution
    int num = 0, count = 1;
    
    int size = inp.length() - 1;
    
    for(int ctr = size; ctr >= 0; ctr--){
      if((inp.charAt(ctr) + "").equals("1")){
        num += count;
      }
      
      count *= 2;
    }
    
    return num;
    // End of Solution
    
  }
}
