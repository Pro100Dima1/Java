package stepik_tasks.cycles_if;

/*
Напишите программу, которая должна прочитать два значения из System.in:

количество людей
количество кусочков в одной пицце.
Гарантируется, что входные параметры — целые положительные числа.

Программа должна напечатать минимальное количество пицц (не ноль), которое надо заказать, чтобы у всех было одинаковое количество ломтиков и не осталось ни одного лишнего.
 */

import java.util.Scanner;

public class Task_3_5_7 {
    public static void main(String[] args) {
        int n = 1;
        Scanner scanner = new Scanner(System.in);
        int peopleCount = scanner.nextInt();
        int pizzaPiecesCount = scanner.nextInt();
        while (((n * pizzaPiecesCount) % peopleCount) != 0){
            n ++;
        }
        System.out.println(n);
    }
}
