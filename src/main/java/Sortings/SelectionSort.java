package Sortings;

public class SelectionSort {
    static int[] elementArray = new int[]{15,2,5,4,6,1,8};

    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]){
                    Helpers.swapElements(array, i, j);
                    Helpers.printArray(array);
                }
            }
        }
    }

    public static void main(String[] args) {
        sort(elementArray);
    }
}
