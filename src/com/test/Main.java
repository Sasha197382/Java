package com.test;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        float ran = (float)(Math.random());
        System.out.print("Random: " + ran + "\n");

        int[][] data = null;

        MaxtrixPrintable nes= new NestedLoopsPrintableImpl();
        MaxtrixPrintable sin= new SingleLoopPrintableImpl();

        if(ran<0.5)
        {
            nes.print(data);
        }
        else
        {
            sin.print(data);
        }
    }
}
