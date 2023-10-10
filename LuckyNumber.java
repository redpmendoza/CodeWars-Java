public class LuckyNumber{
  public static boolean isLucky(long n){
    
    // Start of Solution
    String num = n + "";
    int sum = 0;
    
    for(int ctr = 0; ctr < num.length(); ctr++){
      sum += (Integer.parseInt(num.charAt(ctr) + ""));
    }
    
    if(sum % 9 == 0 || sum == 0){
      return true;
    }
    
    return false;
    // End of Solution
    
  }
}
