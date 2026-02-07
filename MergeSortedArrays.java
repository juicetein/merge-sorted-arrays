/**
 * Homework #1 – Week 1 Day 2
 * Justin Lao
 */
public class MergeSortedArrays {

    /*
     * we take two sorted arrays and merge them into
     * one sorted array
     */
    public static int[] merge(int[] A, int[] B) {

        int[] result = new int[A.length + B.length];

        int i = 0; // index for first array
        int j = 0; // index for second array
        int k = 0; // pointer for result array

        while (i < A.length && j < B.length) {
            if (A[i] <= B[j]) {
                result[k] = A[i];
                i++;
            } else {
                result[k] = B[j];
                j++;
            }
            k++;
        }

        while (i < A.length) {
            result[k] = A[i];
            i++;
            k++;
        }

        while (j < B.length) {
            result[k] = B[j];
            j++;
            k++;
        }

        return result;
    }
}
