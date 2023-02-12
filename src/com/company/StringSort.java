package com.company;

public class StringSort {
    public static void Sort() {
        String[] a={"Tom","Dick","Harry","Pluto","Mickey","Donald"};
        String temp;
        for (int i=0;i<a.length;i++){
            for(int j=0;j<(a.length-1)-i;j++){     // In this loop -i is used so that the element which is already sorted we should not use those elements again in our loop.
                if(a[j].compareTo(a[j+1])>0) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
    }
}
