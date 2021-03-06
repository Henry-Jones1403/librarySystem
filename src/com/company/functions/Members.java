package com.company.functions;

import com.company.functions.fileManagement;
import java.io.File;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;



public class Members {
    private static File database = new File("Authorisation.txt");
    public static Boolean search(File database, String searchFor, Boolean caseSensitive, int csvValue) {
        ArrayList<String> changedArray = new ArrayList<>();
        Boolean present = false;
        try {
            int counter = 0;
            Scanner reader = new Scanner(database);
            while (reader.hasNextLine()) {
                counter++;
                String line = reader.nextLine();
                String[] splitter = line.split(",");
                if (caseSensitive) {
                    if (splitter[csvValue].equals(searchFor)) {
                        present = true;
                    }
                } else if (splitter[csvValue].equalsIgnoreCase(searchFor)) {
                    present = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        return present;
    }

    public static Boolean members() {
        Boolean repeat = true;
        while (repeat) {
            String username = fileManagement.getInput("What is your username");
            if (search(database, username, false, 0)) {
                repeat = false;
                for (int i = 0; i < 6; i++) {
                    if (search(database, fileManagement.getInput("what is the password?"), true, 1)) {
                        return true;
                    }
                    if(i>5){
                        System.out.println("too many attempts, the program will now close!!");
                    System.exit(0);
                    }
                }

            }

        }
return false;
    }
    public static void memberRegister(){
        String username = fileManagement.getInput("what will your username be");
        String password = fileManagement.getInput("what will your password be?");
        fileManagement.fileWriter(  "\n"+username + "," +password + "\n", true, database);
    }
}