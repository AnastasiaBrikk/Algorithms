package lesson2;

public class hw_lesson2 {
    public static void main(String[] args) {
        // пирамидальная сортировка
        int[] array = { 3, 2, 1, 6, 4, 8, 6, 9 };
        sort(array);
        for (int e : array) {
            System.out.print(e + " ");
        }
    }

    static void sort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            piramideSort(array, i, array.length);
        }

        for (int i = array.length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            piramideSort(array, 0, i);
        }
    }

    static void piramideSort(int[] array, int root, int size) {
        int largest = root;
        int firstChild = 2 * root + 1;
        int secondChild = 2 * root + 2;

        if (firstChild < size && array[firstChild] > array[largest]) {
            largest = firstChild;
        }

        if (secondChild < size && array[secondChild] > array[largest]) {
            largest = secondChild;
        }

        if (largest != root) {
            int temp = array[root];
            array[root] = array[largest];
            array[largest] = temp;

            piramideSort(array, largest, size);
        }
    }
}
