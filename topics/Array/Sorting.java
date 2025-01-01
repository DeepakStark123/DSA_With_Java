
class Sorting {

    public static void main(String[] args) {
        //    String str = "hello";
        int[] arr = {2, 1, 8, 4, 3};
        //    int[] res = bubbleSort(arr);
        // int[] res = selectionSort(arr);
        int[] res = insertionSort(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //insertion sort
    public static int[] insertionSort(int[] arr) {
        for (var i = 1; i < arr.length; i++) {
            //------using for loop-------
            for (var j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
            //------using while loop-------
            // int j = i;
            // while (j > 0) {
            //         if (arr[j] < arr[j - 1]) {
            //             int temp = arr[j];
            //             arr[j] = arr[j - 1];
            //             arr[j - 1] = temp;
            //         } else {
            //             break;
            //         }
            // }
        }
        return arr;
    }

    //selection sort
    public static int[] selectionSort(int[] arr) {
        for (var i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (var j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    //bubble sort
    public static int[] bubbleSort(int[] arr) {
        for (var i = 0; i < arr.length; i++) {
            for (var j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
