import java.util.*;

public class DescribeAList{
  public static String describeList(final List list){
    
    // Start of Solution
    if(list.size() == 0){
      return "empty";
    }
    else if(list.size() == 1){
      return "singleton";
    }
    else{
      return "longer";
    }
    // End of Solution
    
  }
}
