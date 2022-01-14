package com.company;

import java.util.ArrayList;

import com.company.functions.Members;
import com.company.functions.fileManagement;
import com.company.ObjectDecleration.bookObjects;

import static com.company.functions.fileManagement.getInput;

public class Main {

    private static ArrayList<String> bookList = new ArrayList<>();
    private static ArrayList<bookObjects> newBooks = new ArrayList<>();

    public static void main(String[] args) {
        Boolean repeating = true;
        while(repeating){
        if(welcome()){
            String choice = getInput("Welcome too the library menu!!\n Will you be:\n-Adding a book\n-Deleting a book");
        fileManagement.fileCreator();
        if(choice.equalsIgnoreCase("Adding a book") ){
                setBook(Integer.parseInt(getInput("How many books will be added")));
        }else if(choice.equalsIgnoreCase("Deleting a book") ) {
            fileManagement.deleter(getInput("What is the name of the book"));
        }


        }if(fileManagement.getInput("Do you require any more services?").equalsIgnoreCase("no")){
            repeating = false;
            }
    }}

    public static void setBook(int numberAdded) {
        for (int i = 0; i < numberAdded; i++) {
            String bookTitle = getInput("What is the title of book number " + (i + 1));
            String ISBN = getInput("What is the ISBN of book number " + (i + 1));
            String author = getInput("Who is the Author of book number " + (i + 1));
            String genre = getInput("What is the Genre of book number " + (i + 1));
            bookList.add(bookTitle + "," + ISBN + "," + author + "," + genre);
            fileManagement.fileWriter(bookTitle + "," + ISBN + "," + author + "," + genre, true, fileManagement.database);
        }
        for (int i = 0; i < newBooks.size(); i++) {
            System.out.println(newBooks.get(i));
        }
    }


    public static Boolean welcome(){
        System.out.println("Welcome to the library management system!!");
        String choice= getInput("Would you like to sign in or do you need to register");
        if (choice.equals("register")){
            Members.memberRegister();
            return true;
        }return Members.members();
}

}