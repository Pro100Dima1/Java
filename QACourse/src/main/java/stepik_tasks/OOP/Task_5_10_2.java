package stepik_tasks.OOP;

/*
Внимательно изучите предлагаемый код и примеры ввода и вывода. Программа принимает на вход координаты трех вершин треугольника и, если треугольник существует, выводит площадь треугольника.

Реализуйте методы класса Triangle:

Конструктор, имеющий в качестве параметров координаты трех вершин.
Убедитесь, что эти точки относятся к вершинам треугольника.
Проверьте, что созданный треугольник существует и не является вырожденным.
Если это не так, выведите надпись Треугольник не существует.
double area() – возвращает площадь треугольника.
Полезные ссылки:

Triangle existence reference
Triangle area reference
 */

import java.util.Scanner;

public class Task_5_10_2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        Point point1 = new Point(x1,y1);
        Point point2 = new Point(x2,y2);
        Point point3 = new Point(x3,y3);
    }
}

class Triangle {
    Pointt a, b, c;

    public Triangle(Pointt a, Pointt b, Pointt c) {
        //Напишите свой код здесь
    }

    public double area() {
        //Напишите свой код здесь
    }
}

class Pointt {
    private double x;
    private double y;

    public Pointt(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
