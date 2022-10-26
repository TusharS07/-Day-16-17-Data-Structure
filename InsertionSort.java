package com.bridgelabz.day16_17;

public class InsertionSort {
    public String[] insertionSort(String[] array) {
        /*
          Variable 'temp' initializer '" "' is redundant
         */
        String temp;
        int arrayLength=array.length;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (array[i].compareToIgnoreCase(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public void displaySort(String[] array) {
        for (String j : array) {
            System.out.print(" "+j);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();

        String[] array = {"yash","jay","tushar","ashwini","sayali","bhandup"};
        String[] sortedArray = sort.insertionSort(array);
        sort.displaySort(sortedArray);

    }

}
