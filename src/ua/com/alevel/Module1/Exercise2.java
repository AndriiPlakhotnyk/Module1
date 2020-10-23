package ua.com.alevel.Module1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Scanner;

public class Exercise2 {
    private int[][] field;

    public void setField(int[][] field) {
        this.field = field;
    }

    private boolean isRightPositionOnBoard(int currX, int currY, int newX, int newY) {
        return (this.field[currX][currY] < field.length && this.field[newX][newY] < field.length);
    }

    private boolean isRightMove(int currX, int currY, int newX, int newY) {
        return Math.abs(currX - newX) + Math.abs(currY - newY) == 3;
    }

    public void run() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Если желаете завершить программу введите 'x', если хотите продолжить нажмите Enter");
            if (reader.readLine().equals("x"))
                break;
            System.out.println("Введите начальную позицию по оси X: ");
            int currX = Integer.parseInt(reader.readLine());
            System.out.println("Введите начальную позицию по оси Y: ");
            int currY = Integer.parseInt(reader.readLine());
            System.out.println("Введите ход по оси X: ");
            int newX = Integer.parseInt(reader.readLine());
            System.out.println("Введите ход по оси Y: ");
            int newY = Integer.parseInt(reader.readLine());

            try {
                boolean isRightPoz = isRightPositionOnBoard(currX, currY, newX, newY);
                boolean isRightMove = isRightMove(currX, currY, newX, newY);

                if (isRightPoz) {
                    if (isRightMove) {
                        System.out.println("Ход верный!");
                    } else {
                        System.out.println("Ход не верный!");
                    }
                } else {
                    throw new RuntimeException("Введенные кординаты выходят за границы доски");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new RuntimeException("Введенные кординаты выходят за границы доски");

            }
        }
    }

    public static class Field {

        public static int[][] getField() {
            int[][] field = new int[8][8];
            return field;
        }

    }
}


