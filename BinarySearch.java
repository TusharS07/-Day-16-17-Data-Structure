package com.bridgelabz.day16_17;

public class BinarySearch {
    public int binarySearch(String[] array, String data) {
        int first = 0;
        int last = array.length;

        int mid = (first + last) / 2;

        if (data.compareTo(array[mid]) == 0) {
            return mid;
        } else if (data.compareTo(array[mid]) > 0) {
            first = mid + 1;
            return binarySearch(array, data);
        } else if (data.compareTo(array[mid]) < 0) {
            last = mid - 1;
            return binarySearch(array, data);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        BinarySearch binary = new BinarySearch();
        String[] array = {"yash","jay","tushar","ashwini","sayali","bhandup"};
        int result = binary.binarySearch(array,"ashwini");
        if(result == -1) {
            System.out.println("Element Not Found");
        }else {
            System.out.println("Element Found At Position "+result);
        }
    }
}