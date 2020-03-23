package JavaBasics.sort;

import JavaBasics.sort.ArraySelectionSort;

public class DriverClass {

    public static void main(String[] args) {
        int[] data = new int[10];
        for (int i = 0; i < data.length ; i++) {
            data[i] = (int)(Math.random() * 10);
        }

        for (int datum : data) {
            System.out.print(datum + "  ");
        }

        ArraySelectionSort.selectionSort(data);
        System.out.println("after sorting...");
        for (int dat : data) {
            System.out.print(dat + " ");
        }

    }
}
