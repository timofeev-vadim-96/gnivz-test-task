package org.example;

import java.util.Arrays;

public class ArrayFilter {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,3};
        System.out.println(Arrays.toString(solution(arr)));
    }

    // На вход дан массив чисел. Необходимо вернуть массив, в котором от входящего массива останутся только числа 3 и 5
    public static int[] solution(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 3 || array[i] == 5) counter++;
        }
        int [] newArr = new int[counter];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 3 || array[i] == 5){
                newArr[index] = array[i];
                index++;
            }
        }
        return newArr;
    }
}
