package stepik_tasks.arrays;

/*
Напишите программу, которая должна получить размер массива и сам массив значений int и вернуть массив логических значений,
где каждый элемент является результатом проверки: является ли соответствующий исходный элемент суммой двух предыдущих элементов в данном массиве.

Подробности:

Длина входящего массива должна быть 2 или более.
Метод возвращает массив логических значений, где каждый элемент является результатом для соответствующего элемента в данном массиве.
Первые два элемента логического массива всегда false.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task_4_6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int [] array = new int[sizeOfArray];
        boolean [] logicArray = new boolean[sizeOfArray];
        if (sizeOfArray > 2){
            for (int i = 0; i < array.length; i++){
                array[i] = scanner.nextInt();
                if (i < 2){
                    logicArray[i] = false;
                }
            }
            for (int i = 2; i < array.length; i++){
                if (array[i] == array[i-1] + array[i-2]){
                    logicArray[i] = true;
                }
                if (array[i] != array[i-1] + array[i-2]){
                    logicArray[i] = false;
                }
            }
        }
        System.out.println(Arrays.toString(logicArray));
    }
}
