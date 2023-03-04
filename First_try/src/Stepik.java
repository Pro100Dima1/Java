import java.util.Scanner;
import java.io.IOException;


public class Stepik {
    public static void main(String[] args) throws IOException {
        Scanner a = new Scanner(System.in);
        int count = a.nextInt();

        if (count < 0){
            System.out.print("Серьезно? А что так негативно?");
        }
        if (count == 0){
            System.out.print("Оу... Похоже здесь никого...");
        }

        if(count > 0){

            for (int i = 0; i < count; i++){

                String pop = a.next();
                System.out.println("Привет, " + pop);
            }
        }


    }

}
