public class CalculateAverage{
  public static double find_average(int[] array){
    
    // Start of Solution
    int size = array.length;
    
    if(size == 0){
      return 0;
    }
    
    int all = 0;
    
    for(int ctr = 0; ctr < size; ctr++){
      all += array[ctr];
    }
    
    return all/size;
    // End of Solution
    
  }
}
