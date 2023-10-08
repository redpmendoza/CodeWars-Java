public class CountOfPositivesSumOfNegatives{
    public static int[] countPositivesSumNegatives(int[] input){
      
      // Start of Solution
      if(input == null || input.length == 0){
        int out[] = {};
        return out;
      }
      
      int out[] = new int[2];
      int pos = 0, neg = 0;
      
      for(int ctr = 0; ctr < input.length; ctr++){
        if(input[ctr] > 0){
          pos++;
        }
        if(input[ctr] < 0){
          neg+= input[ctr];
        }
      }
        
      out[0] = pos;
      out[1] = neg;
      
      return out;
      // End of Solution
      
    }
}
