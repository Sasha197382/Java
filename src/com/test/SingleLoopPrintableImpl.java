package com.test;

import java.util.stream.Stream;

public class SingleLoopPrintableImpl implements MaxtrixPrintable
{
    public void print(int[][] data)
    {
        int count = 0;
        if(data == null) {
            System.out.print("null");
        }else {
            for (int mas = 0; mas < data.length; mas++) {
                if (data[mas] == null) {
                    count++;
                } else if (data[mas].length == 0) {
                    count++;
                } else {
                    count += data[mas].length;
                }
            }
            int j = 0;
            int k = 0;
            for (int i = 0; i < count; i++) {
                if (data[k] == null) {
                    System.out.print("null" + "\n");
                    k++;
                } else if (data[k].length == 0) {
                    System.out.print("empty" + "\n");
                    k++;
                } else if (j < data[k].length) {
                    System.out.print(data[k][j] + " ");
                    j++;
                } else {
                    k++;
                    j = 0;
                    System.out.print("\n");
                    System.out.print(data[k][j] + " ");
                    j++;
                }
            }
        }
        System.out.print("\n" + "Vu ispolzovali SingleLoopPrintableImpl");
    }
}
