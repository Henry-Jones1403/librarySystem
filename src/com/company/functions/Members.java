package com.company.functions;

import com.company.functions.fileManagement;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Members {
    public static Boolean search(File database, String searchFor, Boolean caseSensitive) {
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
                    if (splitter[0].equalsIgnoreCase(searchFor)) {
                        present = true;
                    }
                } else if (splitter[0].equals(searchFor)) {
                    present = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        return present;
    }

    private static void members(File database) {
        Boolean repeat = true;
        for (int i = 0; i < 5; i++) {
            while (repeat) {
                String username = fileManagement.getInput("What is your username");
                repeat = false;
                if (search(database, username, false)) {

                }

            }

        }

    }


}
