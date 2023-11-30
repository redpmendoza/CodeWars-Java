public class BeginnerReduceButGrow{
  public static int grow(int[] x){
    
    // Start of Solution
    int num = x[0];
    
    for(int ctr = 1; ctr < x.length; ctr++){
      num *= x[ctr];
    }
    
    return num;
    // End of Solution
    
  }
}
