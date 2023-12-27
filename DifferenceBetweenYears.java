public class DifferenceBetweenYears{
    public static int howManyYears(String date1, String date2){
       
      // Start of Solution
      String d1[] = date1.split("/");
      String d2[] = date2.split("/");
      
      int num = Math.abs(Integer.valueOf(d2[0]) - Integer.valueOf(d1[0]));
      
      return num;
      // End of Solution
      
    }
}
