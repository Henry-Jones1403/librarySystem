package com.company.functions;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class fileManagement {

    public static File database = new File("BookDatabase.txt");

    public static void fileCreator() {
        try {
            if (database.createNewFile()) {
                System.out.println("A new file has been created");
            }
        } catch (Exception e) {
            System.out.println("There was an error " + e);
        }
    }

    public static void fileWriter(String newItem, boolean overwrite, File file) {
        try {
            FileWriter writer = new FileWriter(file.getName(), overwrite);
            writer.write(newItem + "\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("Sorry there was an error " + e);
        }
    }

    public static void deleter(String deletedObject){
        ArrayList<String> changedArray = new ArrayList<>();
        try{
            int counter = 0;

            Scanner reader = new Scanner(database);

            while(reader.hasNextLine()){
                counter++;
                String line = reader.nextLine();
                String[] splitter = line.split(",");
                if(!splitter[0].equalsIgnoreCase(deletedObject)){
                    changedArray.add(line);
                }String altered  = "";
                for (int i = 0; i <changedArray.size() ; i++) {
                    altered = altered  + changedArray.get(i) + "\n";
                } fileWriter(altered, false, database);


            }
        }catch(Exception e){
            System.out.println("Error " + e);
        }


    }
        public static String getInput (String prompt){
            System.out.println(prompt);
            Scanner input = new Scanner(System.in);
            return input.nextLine();
        }

    }
