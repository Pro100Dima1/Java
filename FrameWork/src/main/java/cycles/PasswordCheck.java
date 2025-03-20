package cycles;
import java.util.Scanner;

public class PasswordCheck {
    public static void main (String args[]){
            final int PASSWORD = 133976;
                Scanner inputPassword = new Scanner(System.in);
                int pass = inputPassword.nextInt();
                if (pass == PASSWORD) {
                    System.out.print("Hello, Agent");
                }
                else{
                    System.out.print("Access denied");
                }


    }
}
