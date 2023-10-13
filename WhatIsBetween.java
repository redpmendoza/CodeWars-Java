public class WhatIsBetween{
  public static int[] between(int a, int b){

    // Start of Solution
    int count = 0, ind = 0;
    
    for(int ctr = a; ctr <= b; ctr++){
      count++;
    }
    
    int num[] = new int[count];
    
    for(int ctr = a; ctr <= b; ctr++){
      num[ind] = ctr;
      ind++;
    }
    
    return num;
    // End of Solution
    
  }
}
