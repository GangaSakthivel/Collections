package com.java.collection;

import java.util.ArrayList;

public class StudentManagementSystem {
    public static void main(String[] args) {
        // TASK: Student Management System using ArrayList

        // 1. Create an ArrayList to store student names (as String)
        ArrayList<String> students = new ArrayList<>();

        // 2. Add the following students to the list:
        //    - "Alice"
        //    - "Bob"
        //    - "Charlie"
        //    - "David"
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");



        // 3. Insert "Eve" at index 2
        students.add(2, "Eve");

        // 4. Remove "Bob" from the list
        students.remove("Bob");


        // 5. Check if "Charlie" exists in the list and print true or false
        //    (Write your code here)
        System.out.println(students.contains("Charlie"));

        // 6. Print all student names using a for-each loop
        //    (Write your code here)
        for(String studentsList: students){
            System.out.println(studentsList);
        }

        // 7. (Bonus) Find and print the longest name in the list
        //    Hint: Loop through names, compare lengths, and track the longest
        //    (Write your code here)

        String longestName = "";
        for(String student : students){
            if(student.length() > longestName.length()){
                longestName=student;
            }
        }
        System.out.println("Longest name:" + longestName);

        /* EXPECTED OUTPUT:
           Contains Charlie? true
           List of Students:
           Alice
           Eve
           Charlie
           David
           Longest name: Charlie
        */

        for (int i = 0; i < students.size(); i++) {
            String currentName = students.get(i);
            if (currentName.length() > longestName.length()) {
                longestName = currentName;
            }
        }
    }
}