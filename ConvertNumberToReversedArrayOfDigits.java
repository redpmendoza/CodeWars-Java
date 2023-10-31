public class ConvertNumberToReversedArrayOfDigits{
  public static int[] digitize(long n){
    
    // Start of Solution
    String num = n + "";
    
    int size = num.length();
    
    int arr[] = new int[size];
    
    for(int ctr = 0; ctr < size; ctr++){
      arr[ctr] = Integer.parseInt(num.charAt(size - (ctr + 1)) + "");
    }
    
    return arr;
    // End of Solution
    
  }
}
