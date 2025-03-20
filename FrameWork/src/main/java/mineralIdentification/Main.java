package mineralIdentification;

import java.util.Scanner;

//import static mineralIdentification.Hard.hardnessMineral;

public class Main {
    public static void main(String[] args) {
        Hard hard = new Hard();
        int hardness = hard.hardnessMineral();

        Shine sh = new Shine();
        String shinees = sh.shineOfMineral();

        System.out.println("Твердость " + " = " + hardness + " А блеск \n" + shinees + hard.checkHard(hardness));

    }
}

    
