class IsHeGonnaSurvive{
  public static boolean hero(int bullets, int dragons) {

    // Start of Solution
    int need = dragons * 2;
    
    if(bullets >= need){
      return true;
    }
    
    return false;
    // End of Solution
    
  }
}
