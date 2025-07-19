package org.example.binarysearch;

public class Main {

    public static void main(String[] args) {

//        rotatedMin();

        searchTarget();

    }

    static void rotatedMin() {
        RotatedSortedBinarySearch binarySearch = new RotatedSortedBinarySearch();

        System.out.println(binarySearch.findMinOn(new int[]{3,4,5,6,1,2}));
        System.out.println(binarySearch.findMinOn(new int[]{4,5,0,1,2,3}));

        System.out.println(binarySearch.findMinOn(new int[]{4,5,6,7}));

        System.out.println(binarySearch.binSearchMin(new int[]{3,4,5,6,1,2}));
    }

    static void searchTarget() {
        SearchInSortedArray searchInSortedArray = new SearchInSortedArray();
        System.out.println(searchInSortedArray.search(new int[]{4,5,6,7,8,1,2,3}, 8));
        System.out.println(searchInSortedArray.search(new int[]{4,5,6,7,0,1,2}, 0));


        System.out.println(searchInSortedArray.search(new int[]{3,5,6,0,1,2}, 5));

        System.out.println(searchInSortedArray.search(new int[]{3,4,5,6,1,2}, 1));

        System.out.println(searchInSortedArray.search(new int[]{4,5,0,1,2,3},0));

        System.out.println(searchInSortedArray.search(new int[]{4,5,6,7},5));

        System.out.println(searchInSortedArray.search(new int[]{3,5,6,0,1,2},4));
    }
}
