package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer[] baseArray = new Integer[20];
        FillArray(baseArray);
        PrintArray(baseArray);

        Integer[] finArray = new Integer[20];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < baseArray.length; i++) {
            list.add(baseArray[i]);
        }
        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.rotate(list, 1);
        System.out.println(list);

        List<Integer> uniqueList = new ArrayList<>();
        List<Integer> duplicList = new ArrayList<>();

        for (Integer el : list) {
            if (Collections.frequency(list, el) != 1)
                duplicList.add(el);
            else
                uniqueList.add(el);
        }
        System.out.println("Уникальные элементы: " + uniqueList);
        System.out.println("Дубликаты " + duplicList);
        list.toArray(finArray);
        PrintArray(finArray);
    }
    public static void FillArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (50 + 1)) + 0;
        }
    }
    public static void PrintArray(Integer[] array){
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
