public class CountTheMonkeys{
  public static int[] monkeyCount(final int n){
    
    // Start of Solution
    int count[] = new int[n];
    
    for(int ctr = 1; ctr <= n; ctr++){
      count[ctr-1] = ctr;
    }
    
    return count;
    // End of Solution
  
  }
}
