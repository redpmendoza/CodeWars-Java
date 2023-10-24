class SimpleRemoveDuplicates{
    public static int [] solve(int [] arr){
        
      // Start of Solution
      int out[] = new int[arr.length];
      int ind = 0;
        
      for(int ctr = 0; ctr < arr.length; ctr++){
          for(int ctr2 = ctr + 1; ctr2 < arr.length; ctr2++){
              if(arr[ctr] == arr[ctr2]){
                  break;
              }
              if(ctr2 == arr.length - 1){
                  out[ind] = arr[ctr];
                  ind++;
              }
          }
      }

      out[ind] = arr[arr.length-1];

      ind++;

      int fin_arr[] = new int[ind];

      for(int ctr = 0; ctr < ind; ctr++){
          fin_arr[ctr] = out[ctr];
      }
      
      return fin_arr;
      // End of Solution
      
    }
}
