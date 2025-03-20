package stepik_tasks.arrays;

/*
Напишите программу, которая должна получить на вход размерность массива больше нуля и сам массив значений int и вернуть сумму четных чисел. Если четных чисел в массиве нет, сумма равна 0.
 */

import java.util.Scanner;

public class Task_4_6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countElementsArray = scanner.nextInt();
        int[] array = new int[countElementsArray];
        int sum = 0;
        if (countElementsArray > 0) {
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
                if (array[i] % 2 == 0){
                    sum += array[i];
                }
            }
            if (sum % 2 != 0){
                sum = 0;
            }
            System.out.println(sum);
        }
    }
}


