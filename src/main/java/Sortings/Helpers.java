package Sortings;

public class Helpers {
    public static void printArray(int[] array){
        for (int ele:array) {
            System.out.print(ele + ",");
        }
        System.out.println();
    }

    public static void swapElements(int[] array, int earliestIndex, int latestIndex){
        int temp = array[earliestIndex];
        array[earliestIndex] = array[latestIndex];
        array[latestIndex] = temp;
    }
}
