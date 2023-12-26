public class GhostCode{
  public static String helloName(final String name){

    // Start of Solution
    if(name == null || name.equals("")){
      return "Hello world!";
    }
    else{
      return "Hello my name is " + name;
    }
    // End of Solution
    
  }
}
