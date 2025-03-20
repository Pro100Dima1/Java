package stepik_tasks.OOP;

import java.util.Scanner;

/*
Внимательно изучите предлагаемый вам код. Возможно, вам понадобится повторить материал про уравнение прямой  https://skysmart.ru/articles/mathematic/grafik-linejnoj-funkcii

Вам необходимо реализовать метод intersection в классе Line. Он должен возвращать точку пересечения двух линий (Point).
Если линии совпадают или не пересекаются, метод должен возвращать значение null.

Вас может удивить, что в задании используется int для аргументов и полей координат.
 Дело в том, что использование double внесет некоторые дополнительные сложности, которых лучше избежать в этом базовом упражнении.
 Все тесты выбраны так, чтобы производить вычисления без остатков.
 */


public class Task_5_10_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int k2 = scanner.nextInt();
        int b2 = scanner.nextInt();

        Line line1 = new Line(k1,b1);
        Line line2 = new Line(k2,b2);

        System.out.println(line1.intersection(line2));
    }
}

class Line {
    int k, b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Pointt intersection(Line other) {
        if (this.k == other.k ) {
            return null;
        }
        //Второе проверить что отрезки не параллельные
        if (this.k == other.k && this.b == other.b) {
            return null;
        }
       // Третье найти координату пересечения X
        int x = (other.b - this.b) / (this.k - other.k);
        //Четвертое найти координату пересечения Y
        int y = k * x + b;
        //Пятое создать объект "Точка" с найденными координатами и тут же её вернуть
        return new Pointt(x, y);
    }

}

class Point {
    private final int x;
    private final int y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d;%d)", x, y);
    }
}
