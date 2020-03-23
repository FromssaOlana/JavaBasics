package JavaBasics.sort;
/*
Author Fromssa Olana
An implementation of selection sort
 */

public class ArraySelectionSort {
    public static void selectionSort(int[] list){
        for (int i = 0; i < list.length-1; i++) {

            int currentMIN = list[i];
            int currentMinIndex = i;

            // find the minimum in the list
            for (int j = i+1; j < list.length; j++) {
                if (list[j] < currentMIN) {
                    currentMIN = list[j];
                    currentMinIndex = j;
                }
            }


                // swap if it necessary
                if (currentMinIndex != i) {
                    list[currentMinIndex] = list[i];
                    list[i] = currentMIN;
                }
            }

        }
}

