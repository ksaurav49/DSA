/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dsa.array;

/**
 * Find the maximum and minimum element in an array
 *
 * @author saurav
 */
public class MaxMinArray {

    public static int getMinFromArray(int arr[]) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            min = num < min ? num : min;
        }
        return min;
    }

    public static int getMaxFromArray(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = num > max ? num : max;
        }
        return max;
    }

    public static void main(String args[]) {
        int arr[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        System.out.println("Minimum is : " + getMinFromArray(arr));
        System.out.println("Maximum is : " + getMaxFromArray(arr));
    }

}
