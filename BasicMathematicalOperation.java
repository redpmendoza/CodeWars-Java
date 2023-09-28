public class BasicMathematicalOperation{
  public static Integer basicMath(String op, int v1, int v2){
    
    // Start of Solution
    int ans = 0;
    
    switch(op){
        case "+":
          ans = v1 + v2;
        break;
        case "-":
          ans = v1 - v2;
        break;
        case "*":
          ans = v1 * v2;
        break;
        case "/":
          ans = v1 / v2;
        break;
    }
    
    return ans;
    // End of Solution
    
  }
}
