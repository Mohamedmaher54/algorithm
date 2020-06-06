package com.company;

public class kthsmallest {
    public static int kthsmallest(int[] A, int[] B,int size1,int size2, int K) {
        int begin = Math.max(0, K - size1);
        int end = Math.min(size2, K);
        while (begin < end) {
            int mid = begin + ( end - begin )/ 2;
            if (mid < size1 && K - mid > 0 && A[mid] < B[K - mid - 1]) {
                begin = mid + 1;
            } else if (mid > 0 && K - mid < size2 && A[mid - 1] > B[K - mid]) {
                end = mid;
            } else {
                begin = mid;
                break;
            }
        }
        if (begin == 0) {
            return B[K - 1];
        } else if (begin == K) {
            return A[K - 1];
        } else {
            return Math.max(A[begin - 1], B[K - begin - 1]);
        }
    }
}
