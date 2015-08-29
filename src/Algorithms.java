import java.util.Arrays;
import java.util.Random;

/**
 * Created by Illya on 8/28/2015.
 */
public class Algorithms {

    public static int[] bubbleSort(int[] array) {
        //Best Case (already sorted) O (n)
        //Average Case O (n^2)
        //Worst Case O (n^2)
        //This is an un-optimized Bubble Sort.
        boolean swapped = true;
        int length = array.length;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int a = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = a;
                    swapped = true;
                }
            }
        }
        return array;
    }

    public static int[] insertionSort(int[] array) {
        //Best Case (already sorted) O (n)
        //Average Case O (n^2)
        //Worst Case O (n^2)
        for (int i = 1; i < array.length; i++) {
            int x = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > x) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = x;
        }
        return array;

    }

    public static int[] selectionSort(int[] array) {
        //Best Case (already sorted) O (n^2)
        //Average Case O (n^2)
        //Worst Case O (n^2)
        int n = array.length;
        int i, j, indexOfMin;
        for (j = 0; j < n - 1; j++) {
            indexOfMin = j;
            for (i = j + 1; i < n - 1; i++) {
                if (array[i] < array[indexOfMin]) {
                    indexOfMin = i;
                }
            }
            if (indexOfMin != j) {
                int placeholder = array[indexOfMin];
                array[indexOfMin] = array[j];
                array[j] = placeholder;
            }
        }
        return array;
    }

    public static int[] radixSort(int[] array) {
        //Best Case (already sorted) O (n log n)
        //Average Case O (n log n)
        //Worst Case O (n^2)
        return array;
    }

    public static int[] quickSort(int[] array) {
        //Best Case (already sorted) O (n log n)
        //Average Case O (n log n)
        //Worst Case O (n^2)
        return array;

    }

    public static int[] mergeSort(int[] array) {
        //Best Case (already sorted) O (n log n)
        //Average Case O (n log n)
        //Worst Case O (n^2)
        return array;
    }

    public static int[] timSort(int[] array) {
        //Best Case (already sorted) O (n log n)
        //Average Case O (n log n)
        //Worst Case O (n^2)
        return array;
    }

    public static int[] heapSort(int[] array) {
        //Best Case (already sorted) O (n log n)
        //Average Case O (n log n)
        //Worst Case O (n^2)
        return array;
    }

    public static String printArray(int[] array) {
        String output = "";
        output += "{ ";
        for (int i = 0; i < array.length; i++) {
            output += (array[i] + " ");
        }
        output += "} ";
        return output;
    }

    public static void main(String[] args) {
        System.out.println("========================= Algorithm COMPARATOR ========================");
        System.out.println("Bubble Sort: ");
        int[] array = new int[20000];
        Random randomGenerator = new Random();
        for (int i = 0; i < 20000; i++) {
            int random = randomGenerator.nextInt(1000);
            array[i] = random;
        }
        // System.out.println("Before: " + Algorithms.printArray(array));
        // Arrays.sort(array);
        long beforeTime = System.currentTimeMillis();
        array = Algorithms.bubbleSort(array);
        long afterTime = System.currentTimeMillis();
        long sortDuration = afterTime - beforeTime;
        // System.out.println("After: " + Algorithms.printArray(array));
        System.out.println("Took " + sortDuration + " milliseconds to sort 20000 random integers.");
        int[] array2 = new int[2000];
        for (int i = 0; i < 2000; i++) {
            int random = randomGenerator.nextInt(1000);
            array2[i] = random;
        }
        // Arrays.sort(array);
        // System.out.println("Before: " + Algorithms.printArray(array));
        beforeTime = System.currentTimeMillis();
        array2 = Algorithms.bubbleSort(array2);
        afterTime = System.currentTimeMillis();
        long sortDuration2 = afterTime - beforeTime;
        // System.out.println("After: " + Algorithms.printArray(array));
        System.out.println("Took " + sortDuration2 + " milliseconds to sort 2000 random integers.");
        System.out.println("10 fold size increase took  " + sortDuration / sortDuration2 + " times longer to sort.");
        System.out.println("Bubble sort is clearly O (n^2).");

        //============================================================================================================
        System.out.println("Insertion Sort: ");
        for (int i = 0; i < 20000; i++) {
            int random = randomGenerator.nextInt(1000);
            array[i] = random;
        }
        //  System.out.println("Before: " + Algorithms.printArray(array));
        // Arrays.sort(array);
        beforeTime = System.currentTimeMillis();
        array = Algorithms.insertionSort(array);
        afterTime = System.currentTimeMillis();
        sortDuration = afterTime - beforeTime;
        // System.out.println("After: " + Algorithms.printArray(array));
        System.out.println("Took " + sortDuration + " milliseconds to sort 20000 random integers.");

        for (int i = 0; i < 2000; i++) {
            int random = randomGenerator.nextInt(1000);
            array2[i] = random;
        }
        // Arrays.sort(array);
        //System.out.println("Before: " + Algorithms.printArray(array2));
        beforeTime = System.currentTimeMillis();
        array2 = Algorithms.insertionSort(array2);
        afterTime = System.currentTimeMillis();
        sortDuration2 = afterTime - beforeTime;
        //System.out.println("After: " + Algorithms.printArray(array2));
        System.out.println("Took " + sortDuration2 + " milliseconds to sort 2000 random integers.");
        System.out.println("10 fold size increase took  " + sortDuration / sortDuration2 + " times longer to sort.");
        System.out.println("Insertion sort seems to be closer to O (n). WHYYYYYYYY????????!!!!!!!!!");

        //============================================================================================================
        System.out.println("Selection Sort: ");
        for (int i = 0; i < 20000; i++) {
            int random = randomGenerator.nextInt(1000);
            array[i] = random;
        }
        //  System.out.println("Before: " + Algorithms.printArray(array));
        // Arrays.sort(array);
        beforeTime = System.currentTimeMillis();
        array = Algorithms.selectionSort(array);
        afterTime = System.currentTimeMillis();
        sortDuration = afterTime - beforeTime;
        // System.out.println("After: " + Algorithms.printArray(array));
        System.out.println("Took " + sortDuration + " milliseconds to sort 20000 random integers.");

        for (int i = 0; i < 2000; i++) {
            int random = randomGenerator.nextInt(1000);
            array2[i] = random;
        }
        // Arrays.sort(array);
        // System.out.println("Before: " + Algorithms.printArray(array2));
        beforeTime = System.currentTimeMillis();
        array2 = Algorithms.selectionSort(array2);
        afterTime = System.currentTimeMillis();
        sortDuration2 = afterTime - beforeTime;
        //System.out.println("After: " + Algorithms.printArray(array2));
        System.out.println("Took " + sortDuration2 + " milliseconds to sort 2000 random integers.");
        System.out.println("10 fold size increase took  " + sortDuration / sortDuration2 + " times longer to sort.");
        System.out.println("Selection sort is clearly O (n^2).");

        //============================================================================================================
        /*System.out.println("Radix Sort: ");
        for (int i = 0; i < 20000; i++) {
            int random = randomGenerator.nextInt(1000);
            array[i] = random;
        }
        //  System.out.println("Before: " + Algorithms.printArray(array));
        // Arrays.sort(array);
        beforeTime = System.currentTimeMillis();
        array = Algorithms.selectionSort(array);
        afterTime = System.currentTimeMillis();
        sortDuration = afterTime - beforeTime;
        // System.out.println("After: " + Algorithms.printArray(array));
        System.out.println("Took " + sortDuration + " milliseconds to sort 20000 random integers.");

        for (int i = 0; i < 2000; i++) {
            int random = randomGenerator.nextInt(1000);
            array2[i] = random;
        }
        // Arrays.sort(array);
        //System.out.println("Before: " + Algorithms.printArray(array2));
        beforeTime = System.currentTimeMillis();
        array2 = Algorithms.selectionSort(array2);
        afterTime = System.currentTimeMillis();
        sortDuration2 = afterTime - beforeTime;
        //System.out.println("After: " + Algorithms.printArray(array2));
        System.out.println("Took " + sortDuration2 + " milliseconds to sort 2000 random integers.");
        System.out.println("10 fold size increase took  " + sortDuration / sortDuration2 + " times longer to sort.");
        System.out.println("Selection sort is clearly O (n^2).");
        */
    }
}
