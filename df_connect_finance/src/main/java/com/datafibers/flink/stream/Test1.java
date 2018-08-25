package com.datafibers.flink.stream;

/**
 * @author Richer_man
 * @date 2018-08-09 22:21
 * @descrip com.datafibers.flink.stream
 */
public  class Test1 {
     public static void Swap(int a,int b){

        int c=a;

        a=b;

        b=c;

        System.out.println("a: "+a);

        System.out.println("b: "+b);

    }
    public static void Swap(Integer a,Integer b){

        int c=a;

        a=b;

        b=c;

        System.out.println("a: "+a);

        System.out.println("b: "+b);

    }

    public static void Sample(StringBuffer a){

        a.append(" Changed ");

        System.out.println("a: "+a);

    }
    public static void main(String[] args){

        int c=10;

        int d=20;

        Swap(c,d);




        System.out.println("After Swap:");

        System.out.println("c: "+c);

        System.out.println("d: "+d);

        System.out.println("*********************************************");
        StringBuffer b=new StringBuffer("This is a test!");

        Sample(b);

        System.out.println("b: "+b);

        System.out.println("*********************************************");

        String tmp="abc";
        String tmp1=tmp;

        System.out.println(tmp==tmp1);


        int[] a=new int[2];

        a[0]=10;

        a[1]=20;

        Swap(a);

        System.out.println(a[0]);

        System.out.println(a[1]);
    }
    public static void Swap(int[] a){

        int c=a[0];

        a[0]=a[1];

        a[1]=c;

    }
}
