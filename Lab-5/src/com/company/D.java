package com.company;

public class D extends C {

    protected String d;

    D(A a, B b, C c, String d) {
        super(a, b, c);
        this.d = d;
    }

    D(A a, B b, C c, D d) {
        super(a, b, c);
        this.d = d.d;
    }

    public void getInstances() {
        super.getInstances();
        System.out.print(this.d + " ");
    }

}
