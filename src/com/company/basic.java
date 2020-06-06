package com.company;

public class basic {
    static int kth(int A[], int B[], int size1, int size2, int k)
    {
        if(size1==0 && size2 >= k)
            return B[k-1];
        if(size2==0 && size1 >= k)
            return A[k-1];
        if(k >size1+size2)
            System.out.println("K is larger than the two arrays size");
        int[] arr3 = new int[size1 + size2];
        int i = 0, j = 0, d = 0;
        while (i < size1 && j < size2)
        {
            if (A[i] < B[j])
                arr3[d++] = A[i++];
            else
                arr3[d++] = B[j++];
        }
        while (i < size1)
            arr3[d++] = A[i++];
        while (j < size2)
            arr3[d++] = B[j++];
        return arr3[k - 1];
    }
}
