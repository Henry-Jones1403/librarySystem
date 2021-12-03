package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class Main {
private static File database = new File("BookDatabase.txt");
private static ArrayList<String> bookList = new ArrayList<>();

    public static void main(String[] args) {
	fileCreator();
    setBook(Integer.parseInt(getInput("How many books will be added")));

        if(getInput("Would you like to delete anything? Y or N").equals("Y")){
            deleter(getInput("What is the name of the book"));
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
            fileWriter(bookTitle + "," + ISBN + "," + author + "," +genre);
        }
    }


    public static void fileCreator(){
        try{
            if(database.createNewFile()){
                System.out.println("A new file has been created");
            }else{
                System.out.println("File found");
            }

            }catch(Exception e){
            System.out.println("There was an error " + e);
        }
    }
    public static void fileWriter(String newItem){
        try{
            FileWriter writer = new FileWriter(database.getName(), true);
            writer.write(newItem + "\n");
            writer.close();
        }catch(Exception e){
            System.out.println("Sorry there was an error " + e);
        }
    }public static void deleter(String deletedObject){
        ArrayList<String> changedArray = new ArrayList<>();
        try{
            Scanner reader = new Scanner(database);
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                if(!line.equals(deletedObject)){
                    changedArray.add(line);
                }
            }
        }catch(Exception e){
            System.out.println("Error " + e);
        }
        for (int i = 0; i < changedArray.size(); i++) {
            for (int j = 0; j < bookList.size(); i++) {
                String[] studentDetails = bookList.get(i).split(",");
                System.out.println(studentDetails[0]);
                if(!studentDetails[0].equals(deletedObject)){
                    changedArray.add(bookList.get(i));
                }
            }

            fileWriter(changedArray.get(i));
        }
    }
}
//sort out the deletion