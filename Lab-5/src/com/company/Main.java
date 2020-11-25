package com.company;

public class Main {

    public static void main(String[] args) {
        A letterA = new A("a", new X("some name"));
        B letterB = new B(letterA, "b");
        C letterC = new C(letterA, letterB, "c");
        D letterD = new D(letterA, letterB, letterC, "d");
        E letterE = new E(letterA, letterB, letterC, letterD, "e");
        F letterF = new F(letterA, letterB, letterC, letterD, letterE, "f");
        G letterG = new G(letterA, letterB, letterC, letterD, letterE, letterF, "g");
        H letterH = new H(letterA, letterB, letterC, letterD, letterE, letterF, letterG, "h");
        I letterI = new I(letterA, letterB, letterC, letterD, letterE, letterF, letterG, letterH, "i");
        J letterJ = new J(letterA, letterB, letterC, letterD, letterE, letterF, letterG, letterH, letterI, "j");


        System.out.print("B class object -> ");
        letterB.getInstances();System.out.println();

        System.out.print("C class object -> ");
        letterC.getInstances();System.out.println();

        System.out.print("D class object -> ");
        letterD.getInstances();System.out.println();

        System.out.print("E class object -> ");
        letterE.getInstances();System.out.println();

        System.out.print("F class object -> ");
        letterF.getInstances();System.out.println();

        System.out.print("G class object -> ");
        letterG.getInstances();System.out.println();

        System.out.print("H class object -> ");
        letterH.getInstances();System.out.println();

        System.out.print("I class object -> ");
        letterI.getInstances();System.out.println();

        System.out.print("J class object -> ");
        letterJ.getInstances();System.out.println();

        System.out.print("Get the x.name value from letterJ: ");
        letterJ.printXname();




    }
}
