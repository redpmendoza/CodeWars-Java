public class TwiceAsOld{
  public static int TwiceAsOld(int dadYears, int sonYears){
    
    // Start of Solution
    if(sonYears == 0){
      return dadYears;
    }
    else{
      return Math.abs(dadYears - (sonYears * 2));
    }
    // End of Solution
  
  }
}
