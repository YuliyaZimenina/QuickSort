public class QuicksortDemo {
    public static void main(String[] args) {
        char[] charArray = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
        int i;

        System.out.print("Original array: { ");
        for (i = 0; i < charArray.length; i++)
            System.out.print(charArray[i] + " ");
        System.out.print("}");
        System.out.println();

        //Sort the array
        Quicksort.quickSort(charArray);
        System.out.print("Sorted array: { ");
        for (i = 0; i < charArray.length; i++)
            System.out.print(charArray[i] + " ");
        System.out.print("}");
        System.out.println();
    }
}