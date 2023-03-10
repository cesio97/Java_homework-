/*
 * Реализовать алгоритм пирамидальной сортировки (HeapSort)  
 */


package home_5;
import java.util.Arrays;

public class task_3 {
    public static void main(String[] args) {
        int[] A = { 6, 3, 6, 9, 9, 5, 1, 8 };
        heapsort(A);
        System.out.println(Arrays.toString(A));
   }

   private static int leftSide(int i) {
        return (2 * i + 1);
   }

   private static int rightSide(int i) {
        return (2 * i + 2);
   }

   private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
   }

   private static void heap(int[] A, int i, int size) {
        int left = leftSide(i);
        int right = rightSide(i);
        int largest = i;
        if (left < size && A[left] > A[i]) {
             largest = left;
        }
        if (right < size && A[right] > A[largest]) {
             largest = right;
        }
        if (largest != i) {
             swap(A, i, largest);
             heap(A, largest, size);
        }
   }

   public static int pop(int[] A, int size) {
        if (size <= 0) {
             return -1;
        }
        int top = A[0];
        A[0] = A[size - 1];
        heap(A, 0, size - 1);
        return top;
   }

   public static void heapsort(int[] A) {
        int n = A.length;
        int i = (n - 2) / 2;
        while (i >= 0) {
             heap(A, i--, n);
        }
        while (n > 0) {
             A[n - 1] = pop(A, n);
             n--;
        }
   }
}

