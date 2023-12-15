public class CompoundArray{    
    public static int[] compoundArray(int[] a, int[] b){
      
      // Start of Solution
      int arr[] = new int[a.length + b.length];
      
      int total = 0;
      
      if(a.length >= b.length){
        total = a.length;
      }
      else{
        total = b.length;
      }
      
      int ind = 0, place = 0;
      
      while(ind < total){
        if(ind < a.length){
          arr[place] = a[ind];
          place++;
        }
        if(ind < b.length){
          arr[place] = b[ind];
          place++;
        }
        ind++;
      }
      
      return arr;
      // End of Solution
      
    }
}
