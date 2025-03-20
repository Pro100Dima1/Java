package cycles;

import java.util.Scanner;

public class Ulitka
{
    public static void main(String[] args)
    {
        Scanner z = new Scanner(System.in);
        int a = z.nextInt();
        int b = z.nextInt();
        int h = z.nextInt();
        int s = 1;

        if (b > a || a == b){
            System.out.print("Никогда");
        }
        if (h <= a ){
            System.out.print(1);
        }

        else{
            int c = a - b;
            int q = (h - a) / c;
            System.out.print(q + 1);
        }
    }
}