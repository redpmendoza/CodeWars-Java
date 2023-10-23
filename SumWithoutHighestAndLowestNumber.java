public class SumWithoutHighestAndLowestNumber{
  public static int sum(int[] numbers){
    
    // Start of Solution
    if(numbers == null || numbers.length < 2){
      return 0;
    }
    
    int sum = 0;
    
    for(int ctr = 0; ctr < numbers.length; ctr++){
      for(int ctr2 = ctr; ctr2 < numbers.length; ctr2++){
        if(numbers[ctr] > numbers[ctr2]){
          int temp = numbers[ctr];
          numbers[ctr] = numbers[ctr2];
          numbers[ctr2] = temp;
        }
      }
    }
    
    for(int ctr = 1; ctr < numbers.length-1; ctr++){
      sum += numbers[ctr];
    }
    
    return sum;
    // End of Solution
    
  }
}
