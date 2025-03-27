package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProgram {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);
        numberList.add(2, 25);
        numberList.remove(Integer.valueOf(40));
        numberList.remove(Integer.valueOf(50));
        for(int numbers: numberList) System.out.println(numbers);

        int sum = 0;
        for(int number: numberList){
            sum+=number;
        }
        System.out.println("Sum of elements:" + sum);

        System.out.println(numberList.contains(30));
    }
}
