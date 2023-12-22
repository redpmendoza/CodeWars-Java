import java.util.Arrays;

public class MaxDiffEasy{
  public static int maxDiff(int[] lst){
    
    // Start of Solution
    if(lst.length == 0){
      return 0;
    }
    
    Arrays.sort(lst);
    
    return lst[lst.length - 1] - lst[0];
    // End of Solution
    
  }
}
