public class CalculateBMI{
  public static String bmi(double weight, double height){
    
    // Start of Solution
    String result = "";
    double bmi = weight / (height * height);
    
    if(bmi <= 18.5){
      result = "Underweight";
    }
    else if(bmi <= 25){
      result = "Normal";
    }
    else if(bmi <= 30){
      result = "Overweight";
    }
    else{
      result = "Obese";
    }
    
    return result;
    // End of Solution
    
  }
}
