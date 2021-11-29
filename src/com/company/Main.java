package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
//Good at keeping main just a list of method calls
//You used try catches which is also clean code
    // number of books is supposed to be unspecified
    public static void main(String[] args) {
        CreateFile();
        information_list();

	// write your code here
    }


    public static void CreateFile() {
        try {
            if (mylibrary.createNewFile()) {
                System.out.println("File created: " + mylibrary.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void information_list() {
        System.out.print("please enter the amount of books you'd like to store");
        int number_of_books = scanner.nextInt();
        String[] book_name = new String[number_of_books];
        int count = 0;
        while (count != number_of_books) {
            book_name = book_name.
        }
        return book_name;
    }
}


private static File mylibrary = new File("library.txt"); //Change to something sensible
 private static Scanner scanner = new Scanner(System.in);
 //information list is creating the array and ytrying to add things to the array i need to seperate this into two seperate methods
//definitley research arrays may have to change the array into an array list 