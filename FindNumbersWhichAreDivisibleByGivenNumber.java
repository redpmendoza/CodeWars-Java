public class FindNumbersWhichAreDivisibleByGivenNumber{
  public static int[] divisibleBy(int[] numbers, int divider){
    
    // Start of Solution
    int arr[] = new int[numbers.length];
    int ind = 0;
    
    for(int ctr = 0; ctr < numbers.length; ctr++){
      if(numbers[ctr] % divider == 0){
        arr[ind] = numbers[ctr];
        ind++;
      }
    }
    
    int out[] = new int[ind];
    
    for(int ctr = 0; ctr < ind; ctr++){
      out[ctr] = arr[ctr];
    }
    
    return out;
    // End of Solution
    
  }
}
