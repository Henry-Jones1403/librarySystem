package com.company.functions;
import com.company.ObjectDecleration.bookObjects;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class WelcomeTransfer {

    private static void bookTransfer(File bookFile){
        ArrayList<bookObjects> booksList = new ArrayList<>();
        try {
            Scanner reader = new Scanner(bookFile);
            while(reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] splitter = line.split(",");
                bookObjects addBook = new bookObjects(splitter[0], Integer.parseInt(splitter[1]), splitter[2], splitter[3]);
                booksList.add(addBook);
            }
        } catch(Exception e){
            System.out.println("Please restart programme, there has been an issue!");
            System.exit(0);
        }
    }    private static void borrowerTransfer(File bookFile){
        ArrayList<bookObjects> booksList = new ArrayList<>();
        try {
            Scanner reader = new Scanner(bookFile);
            while(reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] splitter = line.split(",");
                bookObjects addBook = new bookObjects(splitter[0], Integer.parseInt(splitter[1]), splitter[2], splitter[3]);
                booksList.add(addBook);
            }
        } catch(Exception e){
            System.out.println("Please restart programme, there has been an issue!");
            System.exit(0);
            bookObjects newBook = new bookObjects("RTG", 324234, "", "");
        }
    }}
//use the same code from the deleter and put it into a object then into the booklist and the do it all again for the borrowers