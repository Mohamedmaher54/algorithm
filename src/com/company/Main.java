package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            System.out.println("enter first array size");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            System.out.println("enter array values");
            int[] array1 = new int[n];
            for (int i = 0; i < n; i++) {
                array1[i] = input.nextInt();
            }
            System.out.println("enter second array size");
            int m = input.nextInt();
            System.out.println("enter array values");
            int[] array2 = new int[m];
            for (int i = 0; i < m; i++) {
                array2[i] = input.nextInt();
            }
            if (n == 0 && m == 0) {
                System.out.println("both arrays empty");
            } else {
                System.out.println("enter k");
                int k = input.nextInt();
                //System.out.println( kthsmallest.kthsmallest(array1,array2,n,m,k));
                System.out.println(basic.kth(array1, array2, n, m, k));
            }
        }
}
