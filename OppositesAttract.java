public class OppositesAttract{
  public static boolean isLove(final int flower1, final int flower2){
    
    // Start of Solution
    return ((flower1 % 2 == 0 && flower2 % 2 != 0) || (flower1 % 2 != 0 && flower2 % 2 == 0)? true: false);
    // End of Solution
  
  }
}
