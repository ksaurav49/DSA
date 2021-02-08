/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dsa.array;

/**
 *
 * @author saurav
 */
public class ReverseArray {

    public static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        int arr[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        System.out.println("Array Before Reversing : ");
        printArray(arr);
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("Array After Reversing : ");
        printArray(arr);
    }

}
