package com.test;

import java.util.stream.Stream;

public class NestedLoopsPrintableImpl implements MaxtrixPrintable
{
    public void print(int[][] data)
    {
        if(data == null) {
            System.out.print("null" + "\n");
        }else {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    System.out.print("null");
                } else if (data[i].length == 0) {
                    System.out.print("empty");
                } else {
                    for (int j = 0; j < data[i].length; j++) {
                        System.out.print(data[i][j] + " ");
                    }
                }
                System.out.print("\n");
            }
        }
        System.out.print("Vu ispolzovali NestedLoopsPrintableImpl");
    }
}
