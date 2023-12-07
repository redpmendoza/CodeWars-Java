public class SmallEnoughBeginner{
  public static boolean smallEnough(int[] a, int limit){
    
    // Start of Solution
    boolean check = false;
    
    for(int ctr = 0; ctr < a.length; ctr++){
      
      if(a[ctr] > limit){
        check = true;
      }
    }
    
    return check? false : true;
    // End of Solution
    
  }
}
