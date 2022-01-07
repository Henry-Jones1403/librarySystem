package com.company.functions;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class fileManagement {
    private static File database = new File("BookDatabase.txt");
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
    public static void fileWriter(String newItem, boolean overwrite){
        try{
            FileWriter writer = new FileWriter(database.getName(), overwrite);
            writer.write(newItem + "\n");
            writer.close();
        }catch(Exception e){
            System.out.println("Sorry there was an error " + e);
        }
    }public static void deleter(String deletedObject, ArrayList<String> bookList){
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

            fileWriter(changedArray.get(i), false);
        }
    }

}
