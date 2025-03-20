package stepik_tasks.cycles_if;

       /* Напишите программу, которая считывает последовательность целочисленных значений из стандартного ввода и выводит максимальное из них.

        Подробности:

        Вы должны считывать значения последовательности, пока следующее не станет 0. Нулевое значение означает конец входной последовательности и не является ее элементом.
        Последовательность гарантированно содержит хотя бы одно значение. */

import java.util.Scanner;

public class Task_3_5_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        while(scanner.hasNextInt()){
            int current = scanner.nextInt();
            if(current == 0){
                break;
            }
            if(current >= max){
                max = current;
            }
        }
        System.out.println(max);
        scanner.close();
    }
}
