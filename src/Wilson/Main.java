package Wilson;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 9;
        arr[1] = 8;
        arr[2] = 7;
        arr[3] = 6;
        arr[4] = 0;
        arr[5] = 4;
        arr[6] = 3;
        arr[7] = 2;
        arr[8] = 1;
        arr[9] = 5;

        System.out.println(Arrays.toString(arr));


        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr,i,j);

                }
            }

        }

    }
}

