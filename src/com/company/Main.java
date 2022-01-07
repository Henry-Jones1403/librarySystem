package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import com.company.functions.fileManagement;
public class Main {

private static ArrayList<String> bookList = new ArrayList<>();

    public static void main(String[] args) {
	fileManagement.fileCreator();
    setBook(Integer.parseInt(getInput("How many books will be added")));

        if(getInput("Would you like to delete anything? Y or N").equals("Y")){
            fileManagement.deleter(getInput("What is the name of the book"), bookList);
        }
    }


    public static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }


    public static void setBook(int numberAdded){
        for (int i = 0; i < numberAdded; i++) {
            String bookTitle = getInput("What is the title of book number " + (i+1));
            String ISBN = getInput("What is the ISBN of book number " + (i+1));
            String author = getInput("Who is the Author of book number " +(i+1));
            String genre = getInput("What is the Genre of book number " +(i+1));
            bookList.add(bookTitle + "," + ISBN + "," + author + "," +genre);
            fileManagement.fileWriter(bookTitle + "," + ISBN + "," + author + "," +genre, true);
        }
    }
//You can overwrite the object everytime without actually effecting the object.


    }