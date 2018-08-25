package com.datafibers.flink.stream;

/**
 * @author Richer_man
 * @date 2018-08-09 22:21
 * @descrip com.datafibers.flink.stream
 */
public  class Test2 {
    public static void Swap(Integer a,Integer b){

        int c=a;

        a=b;

        b=c;

        System.out.println("a: "+a);

        System.out.println("b: "+b);

    }
    public static void Swap(Boolean a,Boolean b){

        Boolean c=a;

        a=b;

        b=c;

        System.out.println("a: "+a);

        System.out.println("b: "+b);

    }
    public static void main(String[] args){

        Integer a=5;
        Integer b=6;
        Swap(a,b);
        System.out.println("Swap Integer :");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("Swap Boolean :");
        Boolean flag = true;
        Boolean flag2=false;
        Swap(flag,flag2);
        System.out.println(flag);
        System.out.println(flag2);
    }
}
