import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        insertionSort(arr);
        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}

/*
 * INPUT: Enter the size of the array : 5 Enter array elements : 9 7 8 5 1
 * OUTPUT: Enter array elements : 1 5 7 8 9
 */