package com.company;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    static void validate(String mathExp) {
        if (ParenthesesValidator.isValidExpresion(mathExp)) {
            System.out.println("Status: VALID math expresion! ✔✔✔\n");
        } else {
            System.out.println("Status: INVALID math expresion! ✘✘✘\n");
        }
    }

    public static void main(String[] args) throws IOException {


        String e = "(1+1) 1+ 1 + { (1/1) + ( 1 + [ 1* { 1 } / 1] + 1) }";
        System.out.println("Validating a hardcoded expresion:");
        System.out.println("Expresion: " + e);
        validate(e);

        String exp = ReadExpresionFromFile.read("one_expresion.txt");
        System.out.println("Reading singular expresion from a txt file:");
        System.out.println("Expresion form file: " + exp);
        validate(exp);

        ArrayList<String> expressions = ReadExpresionFromFile.readMultipleExpressions("multiple_expressions.txt");
        String currentExpression = "";
        System.out.println("Reading multiple expressions from a txt file:");

        for (int i = 0; i < expressions.size(); i++) {
            currentExpression = expressions.get(i);
            System.out.format("Expresion %d: %s\n", i+1, currentExpression);
            validate(currentExpression);
        }
    }
}
