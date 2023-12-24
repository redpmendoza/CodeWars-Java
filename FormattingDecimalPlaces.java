import java.text.DecimalFormat;

public class FormattingDecimalPlaces{
  public static double TwoDecimalPlaces(double number){

    // Start of Solution
    DecimalFormat df = new DecimalFormat("0.00");
    return Double.parseDouble(df.format(number));
    // End of Solution
    
  }
}
