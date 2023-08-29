class WhoLikesIt{
  public static String whoLikesIt(String... names){
    
    // Start of Solution
    int size = names.length;
    String s = "";
    
    if(size == 0){
      s = "no one likes this";
      return s;
    }
    else if(size == 1){
      s = names[0] + " likes this";
      return s;
    }
    else if(size == 2){
      s = names[0] + " and " + names[1] + " like this";
      return s;
    }
    else if(size == 3){
      s = names[0] + ", " + names[1] + " and " + names[2] + " like this";
      return s;
    }
    else{
      s = names[0] + ", " + names[1] + " and " + (size-2) + " others like this";
      return s;
    }
    // End of Solution
    
  }
}
