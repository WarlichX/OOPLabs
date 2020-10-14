package com.company;

public class Main {

    public static void main(String[] args) {

        String text =
                "Object Oriented Programming - lab #2\n" +
                        "Work duration: 4-8 hours\n" +
                        "\n" +
                        "Topic: Object instantiations via constructors, basic data structures\n" +
                        "Objectives:\n" +
                        "Familiarize with object constructions.\n" +
                        "All side effects regarding constructors in Java.\n" +
                        "Practice with Queue.\n" +
                        "Tasks:\n" +
                        "Basic Level (mark 5 || 6):\n" +
                        "\n" +
                        "Create a program, where you should instantiate 3 objects of Box type (which should have the following instance variables -> height, width and depth), via its constructor in 3 different ways:\n" +
                        "\n" +
                        "Without parameters (all the instance variables should have default value 1)\n" +
                        "\n" +
                        "With 1 parameter (all the instance variables should have same value)\n" +
                        "With 3 parameters (for each instance variable)\n" +
                        "Medium Level (mark 7 || 8):\n" +
                        "\n" +
                        "Create a class Queue and instantiate 2 objects of this type. Each queue should have as state the number of elements from it and can be created via constructors with and without parameter. If it is created with parameter, then it should have that parameter value maximum size, otherwise it should not have that limitation.\n" +
                        "You should be able to add to queue via a queue.push(Type value); method. Also You should be able to extract the items from queue via queue.pop(); method.\n" +
                        "\n" +
                        "The rule for push and pop to queue you should consider from Data Structures course or find somewhere in web, the rule of FIFO.\n" +
                        "\n" +
                        "In the program after you create the queues (with param and without), add by 3 values to queue and then extract last value from each of them and print in console.\n" +
                        "\n" +
                        "Advanced Level (mark 9 || 10):\n" +
                        "\n" +
                        "Implement two methods for surface area and volume calculation of a box and use it on a box created with 3 different instance variables. Print the results in console.\n" +
                        "\n" +
                        "In class Queue add a method for that checks if the object is empty and one that checks if the object is full (in case queue has no parameters, it should say it is never full, otherwise it should check the number of elements compared to the queue size). Also use these methods in a program and print the results in console.\n" +
                        "\n" +
                        "Tools & perequisites:\n" +
                        "IDEs: Intellij IDEA, Eclipse, Netbeans.\n" +
                        "Programming languages: Java.\n" +
                        "Frameworks and technologies: -.\n" +
                        "References:\n" +
                        "Intellij IDEA\n" +
                        "Java JDK\n" +
                        "Java language\n" +
                        "Java Constructors";
        
        StringManipulator manipulator = new StringManipulator(text);

        // task 1:
        System.out.println("Number of sentences in the text  -> " + manipulator.NumberOfSentences());
        System.out.println("Number of words in the text      -> " + manipulator.NumberOfWords());

        // task 2:
        System.out.println("Number of letters in the text    -> " + manipulator.NumberOfLetters());
        System.out.println("Number of vowels in the text     -> " + manipulator.NumberOfVowels());
        System.out.println("Number of consonants in the text -> " + manipulator.NumberOfConsonants());

        // task 3:
        System.out.println("Longest word in the text         -> " +  manipulator.LongestWord() + "\n");
        manipulator.MostUsedWords();

    }
}
