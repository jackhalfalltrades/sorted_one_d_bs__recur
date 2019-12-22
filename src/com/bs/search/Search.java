package com.bs.search;

public class Search {


    private int binarySearch(int[] input, int search, int low, int high) {
        int middle = (low + high) / 2;

        if (search < input[middle]) {
            int newHigh = middle -1;
            return binarySearch(input, search, low, newHigh);
        } else if (search > input[middle]) {
            int newLow = middle + 1;
            return binarySearch(input, search, newLow, high);
        } else return middle;
    }


    public static void main(String[] args) {

        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int searchTerm = 7;

        Search search = new Search();

        int location = search.binarySearch(sortedArray, searchTerm, 0, sortedArray.length - 1);
        System.out.printf("search term found in the location %d \n", location);
    }
}
