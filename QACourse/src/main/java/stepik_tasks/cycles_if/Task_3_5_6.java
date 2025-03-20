package stepik_tasks.cycles_if;

/*
Напишите программу, которая считывает последовательность целочисленных значений из стандартного ввода и находит среднее значение.

Подробности:

Вы должны считывать значения последовательности, пока следующее не станет 0. Нулевое значение означает конец входной последовательности и не является ее частью.
Последовательность гарантированно содержит хотя бы одно значение.
Среднее значение также является целым числом. Используйте целочисленные операции. */

import java.util.Scanner;

public class Task_3_5_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int z = 0;
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if(number > 0 || number < 0){
                n++;
            }
            if (number == 0) {
                break;
            }
            z += number;
            //System.out.println("Это z " + z);
            //System.out.println("Это n " + n);
        }
        int x = z / n;
        //System.out.println("Это z " + z);
        //System.out.println("Это n " + n);
        System.out.println(x);
    }
}
