public class SimpleFunHouseNumbersSum{
    public static int houseNumbersSum(final int[] arr){
      
      // Start of Solution
      int total = 0;
      
      for(int ctr = 0; ctr < arr.length; ctr++){
        if(arr[ctr] == 0){
          break;
        }
        else{
          total += arr[ctr];
        }
      }
      
      return total;
      // End of Solution
      
    }
}
