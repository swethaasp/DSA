public class Solution {
	 private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int index = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
            }
        }

        // Copy remaining elements from the left subarray
        while (left <= mid) {
            temp[index++] = arr[left++];
        }

        // Copy remaining elements from the right subarray
        while (right <= high) {
            temp[index++] = arr[right++];
        }

        // Copy the sorted elements back to the original array
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    private static void ms(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            ms(arr, low, mid);
            ms(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void mergeSort(int[] arr, int n) {
        ms(arr, 0, n - 1);
    }

}
