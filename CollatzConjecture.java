public class CollatzConjecture{  
  public static int hotpo(int n){

    // Start of Solution
    int count = 0;
    
    while(n != 1){
      count++;
      if(n % 2 == 0){
        n = n / 2;
      }
      else{
        n = 3 * n + 1;
      }
    }
    
    return count;
    // End of Solution
    
  } 
}
