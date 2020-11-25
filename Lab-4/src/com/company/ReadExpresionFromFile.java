package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class ReadExpresionFromFile {

    public static String read(String fileName) throws IOException {
        BufferedReader reader = null;
        String expression = "";
        try{
            reader = new BufferedReader(new FileReader(fileName));
            expression = reader.readLine();

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            reader.close();
        }
        return expression;
    }

    public static ArrayList<String> readMultipleExpressions(String fileName) throws FileNotFoundException {

        ArrayList<String> list = new ArrayList<String>();
        Scanner file_scanner = new Scanner(new File(fileName));

        while(file_scanner.hasNextLine()) {
            list.add(file_scanner.nextLine());
        }
        return list;
    }

}
