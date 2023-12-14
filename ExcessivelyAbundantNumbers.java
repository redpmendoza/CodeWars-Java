public class ExcessivelyAbundantNumbers{
    public static boolean abundantNumber(int num){
    
      // Start of Solution
      int total = 0;
      
      for(int ctr = 1; ctr < num; ctr++){
        if(num % ctr == 0){
          total += ctr;
        }
      }
      
      return total > num? true : false;
      // End of Solution
      
    }
}
