package ua.com.alevel.Module1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3 {
    ArrayList<Double> inputTriangle() {
        ArrayList<Double> triangle = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты углов треугольника: ");
        System.out.println("Для точки А: ");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        System.out.println("Для точки В: ");
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        System.out.println("Для точки С: ");
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();

        double ab = Math.abs(Math.sqrt((b1 - a1) * (b1 - a1) + (b2 - a2) * (b2 - a2)));
        double ac = Math.abs(Math.sqrt((c1 - a1) * (c1 - a1) + (c2 - a2) * (c2 - a2)));
        double bc = Math.abs(Math.sqrt((c1 - b1) * (c1 - b1) + (c2 - b2) * (c2 - b2)));
        triangle.add(ab);
        triangle.add(ac);
        triangle.add(bc);

        return triangle;
    }

    void squareTriangle(ArrayList<Double> arrayList) {
        double a = arrayList.get(0);
        double b = arrayList.get(1);
        double c = arrayList.get(2);

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Треугольник не существует");
            System.exit(0);
        } else {
            double Pabc = (a + b + c) / 2.0;
            double Sabc = Math.sqrt(Pabc * (Pabc - a) * (Pabc - b) * (Pabc - c));
            System.out.println("Площадь треугольника равна " + Sabc);
        }
    }
}
