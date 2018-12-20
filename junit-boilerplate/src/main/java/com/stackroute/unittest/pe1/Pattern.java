package com.stackroute.unittest.pe1;

public class Pattern {


    public int[] pattern(int num) {
        int i, j,result=1,k=0;
        int[] a=new int[10];

        for (i = 1; i <=num; i++) {
            for (j = 1; j <= i; j++) {
                a[k]=i;
                k++;

            }
        }
        return a;
    }


}
