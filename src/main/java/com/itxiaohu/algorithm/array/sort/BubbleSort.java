package com.itxiaohu.algorithm.array.sort;

/**
 * 冒泡排序
 *
 * <p>更多内容参看<a href="https://itxiaohu.com" target="_blank"><b>IT小胡频道</b></a></p>
 * @author IT小胡
 */
public class BubbleSort {

    public static void sort(int[] array) {
        sortR2L(array);
    }

    /**
     * 从右向左冒泡
     */
    public static void sortR2L(int[] array) {
        if(null == array || array.length < 2) {
            return;
        }

        for(int i = 0; i < array.length; i++) {
            for(int j = array.length - 1; j > i; j--) {
                if(array[j-1] > array[j]) {
                    swapTmpVar(array, j-1, j);
                }
            }
        }
    }

    /**
     * 从左向右冒泡
     */
    public static void sortL2R(int[] array) {
        if(array == null || array.length < 2) {
            return;
        }

        for(int i = array.length; i > 0; i--) {
            for(int j = 0; j < i - 1; j++) {
                if(array[j] > array[j+1]) {
                    swapWithXor(array, j, j+1);
                }
            }
        }
    }

    private static void swapWithXor(int[] array, int sourceIndex, int targetIndex) {
        array[sourceIndex] = array[sourceIndex] ^ array[targetIndex];
        array[targetIndex] = array[sourceIndex] ^ array[targetIndex];
        array[sourceIndex] = array[sourceIndex] ^ array[targetIndex];
    }

    private static void swapTmpVar(int[] array, int sourceIndex, int targetIndex) {
        int tmpSource = array[sourceIndex];
        array[sourceIndex] = array[targetIndex];
        array[targetIndex] = tmpSource;
    }

}
