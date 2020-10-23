package ua.com.alevel.Module1;



import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
//        System.out.println("Задача 1: Вывод количества уникальных значей");
//        Exercise1 exercise1 = new Exercise1();
//        int num =exercise1.counter(exercise1.inPutArray());
//        System.out.println(num);
//

//        System.out.println("Задача 2: Ход коня");
//        Exercise2 exercise2 = new Exercise2();
//        Exercise2.Field fields = new Exercise2.Field();
//        int[][] field = fields.getField();
//        exercise2.setField(field);
//        exercise2.run();


        System.out.println("Задача 3: Рассчет площади треугольника");
        Exercise3 exercise3 = new Exercise3();
        ArrayList<Double> triangle = exercise3.inputTriangle();
        exercise3.squareTriangle(triangle);


    }
}
