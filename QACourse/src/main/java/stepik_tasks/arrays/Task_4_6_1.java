/*
toString(array) —преобразование массива в строку символов
deepToString(array) — преобразование многомерного массива в строку символов
copyOf(array, length) — копирование массива указанной длины
equals(array1, array2) — сравнение массивов
deepEquals(array1, array2) — сравнение многомерных массивов
sort(array) — расположение элементов массива в порядке не убывания
binarySearch(array, element) — определение содержит ли массив значение element: если да, то возвращает его индекс
fill(array, element) — заполнение элементов массива значением element.
 */

package stepik_tasks.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task_4_6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countElementsArray = scanner.nextInt();
        int [] array = new int [countElementsArray];
        if (countElementsArray <= 0){
            System.out.println("Массив нулевого размера");
        }
        else {
            for (int i = 0; i < array.length; i++){
                array[i] = scanner.nextInt();
            }
            Arrays.sort(array);
            System.out.println(array[array.length-1]);
        }
    }
}
