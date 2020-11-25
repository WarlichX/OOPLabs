package com.company;

public class A {
    protected String a;
    protected X x = new X("xxx-change-in-A");

    A(String a, X x) {
        this.x = x;
        this.a = a;
    }

    A(A a) {
        this.a = a.a;
        this.x = a.x;
    }

    public void getInstances() {
        System.out.print(this.a + " ");
    }
}
