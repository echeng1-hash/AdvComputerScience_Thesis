public class Painting {
    // 7 birds
    // blue backgrouns
    // wood framed
    // shape is rectangle
    // many trees
    // command + / = comment
    // class name must match with the file name, and each word must be capitalized
    // use command + s to save my work, and click "Commit 1 file to main" to save it forever

    private int numberOfBirds; // = 7
    private double percentOfTrees; // = 80.5;
    private String shape; // = "rectangle"; // string is anon primitive data type;
    private boolean isFramed; // = true;
    private char background; // = "B";

    // this code runs whenever u have a new item
    public Painting() {
        numberOfBirds = 7;
        percentOfTrees = 80.5;
        shape = "rectangle"; // double-quote
        isFramed = true;
        background = 'B'; // single-quote
    }

    // viewed
    // broke
    // fixed
    // admired

    public void viewed() { // syntax: public _WhatComesOut_ _NameOfFunction_(_inputs_)
        numberOfBirds = 8;
        System.out.println("This is amazing!");
        System.out.println(numberOfBirds);
    }

    public void broke() { // reserved word can not be the name of the function
        isFramed = false;
        System.out.println("This painting is pretty" + numberOfBirds);
    }

    public void fixed() {
        background = 'G';
    }
    
    public void admire() {
        percentOfTrees = 62.3;
    }
    // the only thhing the computer is runing is the main function, so if u want to run something, put them in main
}