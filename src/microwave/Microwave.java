
package microwave;
import java.util.Scanner;

public class Microwave {

 
    public static void main(String[] args) throws Exception
    {
        int minutes;
        int seconds;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the cookin time in minutes:");
        input = new Scanner(System.in);
        minutes = input.nextInt();
        
        System.out.println("Please enter the cookin time in seconds:");
        seconds = input.nextInt();
        
        Timer myTimer = new Timer(minutes, seconds);
        
        System.out.println(myTimer.cookTime());

    }

}
