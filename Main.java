import selectionSort.SelectionSort;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 9, 8, 6, 3, 0, 55};
//        SelectionSort.sortAscending(arr);
        SelectionSort.sortDescending(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
