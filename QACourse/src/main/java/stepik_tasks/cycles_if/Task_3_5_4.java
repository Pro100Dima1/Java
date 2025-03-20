package stepik_tasks.cycles_if;

import java.util.Scanner;

/*
        Дано следующее условие: компания друзей посещает ресторан.
        Они решили разделить счет поровну и добавить 10 процентов от общей суммы счета в качестве чаевых. Далее друзья равными частями покрывают общую сумму платежа.

        Напишите программу, которая считывает общую сумму счета и количество друзей, а затем выводит размер части оплаты.

        Рассмотрим некоторые детали:

        Программа должна читать данные из System.in
        Общая сумма счета не может быть отрицательной. Если введенное значение отрицательное, программа останавливается и печатает: Еда не так плоха, чтобы за ее поедание доплачивали
        Количество друзей не может быть отрицательным или нулевым. Если такое происходит, то программа останавливается и выводит: Кто здесь?!
        Общая сумма счета, количество друзей и часть к оплате являются целыми числами.
*/


public class Task_3_5_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int finalCost = scanner.nextInt();
            int friendsCount = scanner.nextInt();
            if (friendsCount <= 0) {
                System.out.println("Кто здесь?!");
                return;
            }
            int partOfCostWithPercent = (finalCost / 100) * 10;
            int partOfCheck = ((finalCost + partOfCostWithPercent) / friendsCount);

            if (finalCost < 0) {
                System.out.println("Еда не так плоха, чтобы за ее поедание доплачивали");
                return;
            }
            else {
                System.out.println(partOfCheck);
            }
        }
    }
}