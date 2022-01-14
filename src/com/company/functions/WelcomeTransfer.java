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
        }catch(Exception e){
            System.out.println("Please restart programme, there has been an issue!");
            System.exit(0);
bookObject newBook = new bookObjects()
        }
    }}
//use the same code from the deleter and put it into a object then into the booklist and the do it all again for the borrowers