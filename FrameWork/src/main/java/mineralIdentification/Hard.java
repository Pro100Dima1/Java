package mineralIdentification;

import java.util.Scanner;

public class Hard {

    public Integer hardnessMineral() {
        Scanner number_1 = new Scanner(System.in);
        System.out.println("Введите твердость:");
        int num_1 = number_1.nextInt();
        return num_1;
    }

    public String checkHard(Integer hardnes) {

        if (hardnes < 10 && hardnes > 0) {
            System.out.println("Твердость по шкале Мооса: " + hardnes);
        } else {
            System.out.println("Неверно определена твёрдость");
        }
        switch (hardnes) {
            case 1:
                System.out.println("Это тальк по шкале Мооса!");
                break;
            case 2:
                System.out.println("Это гипс по шкале Мооса!");
                break;
            case 3:
                System.out.println("Это кальцит по шкале Мооса!");
                break;
            case 4:
                System.out.println("Это флюорит по шкале Мооса!");
                break;
            case 5:
                System.out.println("Это апатит по шкале Мооса!");
                break;
            case 6:
                System.out.println("Это ПШ по шкале Мооса!");
                break;
            case 7:
                System.out.println("Это кварц по шкале Мооса!");
                break;
            case 8:
                System.out.println("Это топаз по шкале Мооса!");
                break;
            case 9:
                System.out.println("Это корунд по шкале Мооса!");
                break;
            case 10:
                System.out.println("Это алмаз по шкале Мооса!");
                break;
            default:
                System.out.println("Попробуй еще раз");
        }
        return "!";
    }
}
