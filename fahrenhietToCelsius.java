package revision;
import java.util.Scanner;
class temp{
    double res;
    Double f;
    void fahrenhietToCelsius(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temp in Fahrenheight");
        f = scan.nextDouble();
        res = ((f-32)*5)/9;
        System.out.println("The Corresponding Temp in Celcius is "+ res);
    }
}

public class fahrenhietToCelsius {
    public static void main(String[] args) {
        temp obj = new temp();
        obj.fahrenhietToCelsius(); 
        
    }
    
}
