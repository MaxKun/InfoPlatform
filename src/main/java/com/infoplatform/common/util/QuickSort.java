/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.infoplatform.common.util;

import java.util.List;
import java.util.ListIterator;

/**
 * 
 * @author MaxKun
 * @version $Id: QuickSort.java, v 0.1 2016年6月19日 下午9:20:28 MaxKun Exp $
 */
public class QuickSort {

    @SuppressWarnings("unchecked")
    //对上述快排函数原型修改，使其可以对任意对象类型数组进行排序。这个函数为内部使用，外部排序函数接口为sort()，sort函数要求对象必须实现Comparable接口，可以提供编译时类型检测，见后文。
    private static void quickSort(Object[] in, int begin, int end) {
        if (begin == end || begin == (end - 1))
            return;
        Object p = in[begin];
        int a = begin + 1;
        int b = a;
        for (; b < end; b++) {
            //该对象类型数组必须实现Comparable接口，这样才能使用compareTo函数进行比较
            if (((Comparable<Object>) in[b]).compareTo(p) < 0) {
                if (a == b) {
                    a++;
                    continue;
                }
                Object temp = in[a];
                in[a] = in[b];
                in[b] = temp;
                a++;
            }
        }
        in[begin] = in[a - 1];
        in[a - 1] = p;
        if (a - 1 > begin) {
            quickSort(in, begin, a);
        }
        if (end - 1 > a) {
            quickSort(in, a, end);
        }
        return;
    }

    //使用泛型，对任意对象数组排序，该对象类型数组必须实现Comparable接口
    public static <T extends Comparable<? super T>> void sort(T[] input) {
        quickSort(input, 0, input.length);
    }

    //添加对List对象进行排序的功能，参考了Java中的Java.util.Collections类的sort()函数
    public static <T extends Comparable<? super T>> void sort(List<T> list) {
        Object[] t = list.toArray();//将列表转换为数组
        quickSort(t, 0, t.length); //对数组进行排序
        //数组排序完成后再写回到列表中
        ListIterator<T> i = list.listIterator();
        for (int j = 0; j < t.length; j++) {
            i.next();
            i.set((T) t[j]);
        }
    }

}
