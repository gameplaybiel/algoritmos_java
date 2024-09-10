public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Troca arr[j] e arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Se não houve troca, a lista está ordenada
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] list1 = {10, 18, 5, 3, 90, 33};
        int[] list2 = {20, 30, 40, 50, 60, 88};
        int[] list3 = {1, 2, 3, 4, 6, 5};
        int[] list4 = {10, 18, 5, 3, 90, 33, 1, 2, 3, 4, 6, 5, 30, 40, 50, 60, 88, 0};

        bubbleSort(list1);
        bubbleSort(list2);
        bubbleSort(list3);
        bubbleSort(list4);

        System.out.println("Bubble Sort Results:");
        System.out.println("List 1: " + java.util.Arrays.toString(list1));
        System.out.println("List 2: " + java.util.Arrays.toString(list2));
        System.out.println("List 3: " + java.util.Arrays.toString(list3));
        System.out.println("List 4: " + java.util.Arrays.toString(list4));
    }
}