package ua.com.alevel.Module1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise1 {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int[] inPutArray() throws IOException {
        System.out.println("Введите количество элементов массива");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Заполните массив целыми числами");
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    int counter(int[] ints) {
        int unique;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < ints.length; i++) {
            set.add(ints[i]);
        }
        unique = set.size();

        return unique;
    }

}
