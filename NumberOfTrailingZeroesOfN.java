public class NumberOfTrailingZeroesOfN{
  public static int zeros(int n){
    
    // Start of Solution
    int count = 0;
    
    while(n != 0){
      count += (int)Math.floor(n/5);
      n /= 5;
    }
    
    return count;
    // End of Solution
    
  }
}
