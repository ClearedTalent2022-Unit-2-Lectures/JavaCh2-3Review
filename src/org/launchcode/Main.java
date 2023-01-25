package org.launchcode;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
//        ArrayList<String> students = new ArrayList<>();
//        students.add("Yeseul");
//        students.add("Nick I.");
//        students.add("David");
//        students.add("Daryl");
//
//        // Let's move this out into a method and organize our code by putting that method in the
//        // StudentStaffMethods class
//        // Now that we have created the printStudents method, let's use it here to print out
//        // the students array list
//        StudentStaffMethods.printStudents(students);

        // ---------------------------------------------------
        // At this point, students are just represented as single strings containing
        // their first name
        // Let's be a little more detailed with how we represent students;
        // with a first name, a last name, and a TA group
        // In the future, we'll tackle this kind of situation with a class, and that's how it
        // would honestly make most sense in general
        // But for now, before we get there, we are going use HashMaps to represent each student
        // In that sense, each student HashMap will 3 keys: firstName, lastName, TA
        // The values of each of these will be different depending on what student it represents

        HashMap<String, String> student1 = new HashMap<>();
        student1.put("First Name", "Yeseul");
        student1.put("Last Name", "Park");
        student1.put("TA", "Steve");

//        System.out.println(student1.get("firstName"));

        HashMap<String, String> student2 = new HashMap<>();
        student2.put("First Name", "Nick");
        student2.put("Last Name", "Impoco");
        student2.put("TA", "Steve");

        // We have now 2 hashmaps representing 2 different students
        // Let's store these HashMaps in a list
        ArrayList<HashMap<String, String>> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);

        // Let's try that loop that we did earlier
        // This time, it'll be more complicated though because we are dealing with
        // an ArrayList of HashMaps instead of an ArrayList of Strings
        // Our goal is to print out all of the key/value pairs for all of the hashmaps
        // in our students ArrayList

        // Now that we have moved the for loop into a external static method,
        // let's call it here and pass in our studentList

        StudentStaffMethods.printStudents(studentList);

    }

}
