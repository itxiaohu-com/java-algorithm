package com.itxiaohu.algorithm.array.sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 冒泡排序测试
 *
 * <p>更多内容参看<a href="https://itxiaohu.com" target="_blank"><b>IT小胡频道</b></a></p>
 * @author IT小胡
 */
public class BubbleSortTest {

    @Test
    public void test1() {
        int[] array = {8, 56, 23, 13, 87, 1};

        System.out.println(Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(",")));

        BubbleSort.sort(array);

        System.out.println(Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(",")));
    }


    @Test
    public void test2() {
        int[] array = {8};

        System.out.println(Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(",")));

        BubbleSort.sort(array);

        System.out.println(Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(",")));
    }

    @Test
    public void test3() {
        int[] array = {8, 56, 23, 13, 87, 1};

        System.out.println(Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(",")));

        BubbleSort.sortL2R(array);

        System.out.println(Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(",")));
    }

    @Test
    public void test4() {
        int[] array = {8, 56, 23, 13, 87, 1};

        System.out.println(Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(",")));

        BubbleSort.sortR2L(array);

        System.out.println(Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(",")));
    }

}
