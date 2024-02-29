package com.algorithms;
import java.util.*;
import java.util.stream.*;

/**
 * Write a description of class ArrayUtil here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayUtil
{
    public void reverseArray(int numbers[], int start, int end) {
        while   (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }
    
    public int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
    int[] removeEven(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if  (arr[i] % 2 !=0) {
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }
    
    public int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    
    public void moveAllZeroToEndOfArray(int[] arr) {
        /*
         * move all 0 to end of it while maintaining the relative order of the non
         * zero element
         */
        int [] result =
        Arrays.stream(arr)
            .boxed()
            .sorted((a,b) -> {
                if (a == 0 && b != 0) {
                    return 1;
                } else if (a != 0 && b == 0) {
                    return -1;
                } else {
                    return 0;
                }
            })
            .mapToInt(Integer::intValue)
            .toArray();
        
        System.out.println(Arrays.toString(result));
    }
    
    public void moveAllZeroToEndOfArray1(int[] arr) {
        int nonZeroIndex = 0;
        for (int num : arr) {
            if (num != 0) {
                arr[nonZeroIndex++] = num;
            }
        }
        while (nonZeroIndex < arr.length) {
                arr[nonZeroIndex++] = 0;
            }
        System.out.println(Arrays.toString(arr));
    }
    
    
}
