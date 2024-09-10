public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // Move elementos de arr[0..i-1] que são maiores que key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] list1 = {10, 18, 5, 3, 90, 33};
        int[] list2 = {20, 30, 40, 50, 60, 88};
        int[] list3 = {1, 2, 3, 4, 6, 5};
        int[] list4 = {10, 18, 5, 3, 90, 33, 1, 2, 3, 4, 6, 5, 30, 40, 50, 60, 88, 0};

        insertionSort(list1);
        insertionSort(list2);
        insertionSort(list3);
        insertionSort(list4);

        System.out.println("Insertion Sort Results:");
        System.out.println("List 1: " + java.util.Arrays.toString(list1));
        System.out.println("List 2: " + java.util.Arrays.toString(list2));
        System.out.println("List 3: " + java.util.Arrays.toString(list3));
        System.out.println("List 4: " + java.util.Arrays.toString(list4));
    }
}
