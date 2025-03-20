package stepik_tasks.cycles_if;

/*
Напишите программу для решения квадратных уравнений.

Для заданных коэффициентов квадратного уравнения (ax² + bx + c = 0), верните один или два корня уравнения, если они существуют в области действительных чисел.

Входное значение задается через System.in. Выходное значение должно быть напечатано в System.out.

Формат вывода:

"x₁ x₂" (два корня в порядке возрастания, разделенные пробелом), если есть два корня
"x" (просто значение корня), если есть единственный корень
просто строковое значение "без корней", если корня нет.
корни - вещественные числа
Параметр a гарантированно не равен нулю.
 */

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Task_3_5_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int discriminant = (b * b) - (4 * a * c);

        if (discriminant > 0) {
            double x1 = ((-b + sqrt(discriminant)) / (2 * a));
            double x2 = ((-b - sqrt(discriminant)) / (2 * a));
            if (x1 > x2) {
                System.out.print(x2 + " " + x1);
            }
            if (x1 < x2) {
                System.out.print(x1 + " " + x2);
            }
        }
        if (discriminant == 0) {
            double x = -(b / (2 * a));
            System.out.println(x);
        }
        if (discriminant < 0) {
            System.out.println("без корней");
        }
    }
}
