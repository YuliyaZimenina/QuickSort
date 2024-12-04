/*
Implementation of the quicksort algorithm using recursion
for character array
 */
public class Quicksort {
    /*
    The method by which the actual quicksort method
     call is configures.
     */
    static void quickSort(char[] items) {
        quicksortRecursion(items, 0, items.length - 1);
    }

    // Recursive version of quicksort for symbols
    private static void quicksortRecursion(char[] items, int left, int right) {
        int i, j;
        char x, y;
        i = left;
        j = right;
        x = items[(left + right) / 2];
        do {
            while ((items[i] < x) && (i < right)) i++;
            while ((x < items[j]) && (j > left)) j--;
            if (i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++;
                j--;
            }
        } while (i <= j);
        if (left < j) quicksortRecursion(items, left, j);
        if (i < right) quicksortRecursion(items, i, right);
    }
}
