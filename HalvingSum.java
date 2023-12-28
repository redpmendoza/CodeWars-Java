public class HalvingSum{
  int halvingSum(int n){
    
    // Start of Solution
    int sum = n;
    int d = 2;
    boolean check = false;
    
    while(true){
        if((n / d) == 1){
            break;
        }
        if((n / d) == 0){
          check = true;
          break;
        }
      
        sum += n / d;
        d *= 2;
    }
    
    if(check){
      return sum;
    }
    
    return sum + 1;
    // End of Solution
    
  }
}
