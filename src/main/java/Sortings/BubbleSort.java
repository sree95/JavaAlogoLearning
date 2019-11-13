package Sortings;

public class BubbleSort {
    static int[] elementArray = new int[]{15,2,5,4,6,1,8};

    public static void sort(int[] elements){
        for (int i = 0; i < elements.length; i++) {
            boolean swaped = false;
            for (int j = 0; j < elements.length-1; j++) {
                if (elements[j] > elements[j+1]){
                    Helpers.swapElements(elements, j, j+1);
                    swaped = true;
                }
                Helpers.printArray(elements);
            }
            if (!swaped){
                break;
            }
        }
    }

    public static void main(String[] args) {
        sort(elementArray);
    }

}
