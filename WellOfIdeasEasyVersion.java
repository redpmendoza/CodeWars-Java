public class WellOfIdeasEasyVersion{
  public static String well(String[] x){
    
    // Start of Solution
    int good = 0;
    
    for(int ctr = 0; ctr < x.length; ctr++){
      if(x[ctr].equals("good")){
        good++;
      }
    }
    
    if(good == 1 || good == 2){
      return "Publish!";
    }
    else if(good > 2){
      return "I smell a series!";
    }
    else{
      return "Fail!";
    }
    // End of Solution
    
  }
}
