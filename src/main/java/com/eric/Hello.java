package com.eric;

public class Hello {
    public static void main(String[] args) {
        Person p=new Person("Eric",66.5f,1.7f);
        //p.Hello();
       /* p.weight=66.5f;
        p.height=1.7f;
        p.name="Eric";*/
        System.out.println(p.name+p.bmi());
        char c='A';
        System.out.println(c>'a');


    }
}
