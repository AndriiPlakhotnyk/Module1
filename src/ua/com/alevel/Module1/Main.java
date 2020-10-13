package ua.com.alevel.Module1;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        //TASK 1
        Exercise1 exercise1 = new Exercise1();
        int num = exercise1.counter(exercise1.inPutArray());
        System.out.println(num);

        //TASK 2
        Exercise2 exercise2 = new Exercise2();
        exercise2.run();

        //TASK 3
        Exercise3 exercise3 = new Exercise3();
        ArrayList<Double> triangle = exercise3.inputTriangle();
        exercise3.squareTriangle(triangle);

    }
}
