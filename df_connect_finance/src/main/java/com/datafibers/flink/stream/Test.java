package com.datafibers.flink.stream;

/**
 * @author Richer_man
 * @date 2018-08-09 22:21
 * @descrip com.datafibers.flink.stream
 */
public  class Test{
    public Test(){
        String name="123";
        int age =11;
        //change(name);
        change(age);
        System.out.println(age);
    }
    public void change(String name){
        name ="abc";
    }
    public void change(int age){
        age =12;
    }




    public static void main(String[] args) {
        new Test();
        Integer a =127,b=127,c=128,d=128,e=129,f=129;
        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println(e==f);

    }
}
