public class Kata {
  public static int[] invert(int[] array) {
  
    // Start of Solution
    for(int ctr = 0; ctr < array.length; ctr++){
      array[ctr] = array[ctr] * -1;
    }
    
    return array;
    // End of Solution
    
  }
}
