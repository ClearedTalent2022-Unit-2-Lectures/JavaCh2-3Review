package org.launchcode;

import java.util.ArrayList;
import java.util.HashMap;

// This class is just going to contain methods that we want to use in main
public class StudentStaffMethods {

    // Let's make a method that takes in an ArrayList of strings and prints out
    // each of the strings 1 at a time to the console
    // Input: ArrayList<String>
    // Output: printing each individual string to the console

    // nameOfMethod(parameters: type): returnType {}
//    public static void printStudents(ArrayList<String> list) {
//        for (String name : list) {
//            System.out.println(name);
//        }
//    }

    // Let's create a new printStudents method that is designed to print
    // an ArrayList of HashMaps instead of an ArrayList of strings
    public static void printStudents(ArrayList<HashMap<String, String>> list) {
        for (HashMap<String, String> student : list) {
            System.out.println();
            // Now that we are looping through the studentList
            // Let's loop through each student hashmap so that we can
            // print out each key/value on its own line
            for (String key : student.keySet()) {
                System.out.println(key + ": " + student.get(key));
            }
        }
    }
}
