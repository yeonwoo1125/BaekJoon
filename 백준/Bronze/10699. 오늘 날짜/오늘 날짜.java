import java.util.*;
import java.text.SimpleDateFormat;
 
 
class Main {
    public static void main(String[] args) {
       Date today = new Date();
       SimpleDateFormat format1 = new SimpleDateFormat("YYYY-MM-dd");

       System.out.println(format1.format(today));  
                   
    }
}
