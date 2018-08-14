public class Partitioning3Way {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int size = arr.length;
        flagAlgo(arr, size);
        Print(arr, size);
    }

    static void flagAlgo(int[] arr, int size) {
        int lo = 0;
        int mid = 0;
        int h = arr.length - 1;
        int temp = 0;
        while (mid <= h) {
            switch (arr[mid]) {
                case 0 : {
                    temp = arr[lo];
                    arr[lo] = arr[mid];
                    arr[mid] = temp;
                    mid++;
                    lo++;
                    break;
                }
                case 1 : {
                    mid++;
                    break;
                }
                case 2 : {
                    temp = arr[mid];
                    arr[mid] = arr[h];
                    arr[h] = temp;
                    h--;
                    break;
                }
            }
        }
    }

    static void Print(int[] array, int size) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
