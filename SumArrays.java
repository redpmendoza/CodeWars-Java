public class SumArrays{
  public static double sum(double[] numbers){
    
    // Start of Solution
    if(numbers.length == 0){
      return 0;
    }
    
    double sum = 0.0;
    
    for(int ctr = 0; ctr < numbers.length; ctr++){
      sum += numbers[ctr];
    }
    
    return sum;
    // End of Solution
    
  }
}
