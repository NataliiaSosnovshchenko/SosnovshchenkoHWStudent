/*
Create Console Application
project in Java. Add class Student to the project.
Class should consists of
two private fields: name and rating;
methods for access to these fields
default constructor and constructor with parameters
methods:
betterStudent - to definite the better student (between two, return true or false)
toString - to output information about student
changeRating –to consistently change the rating of student
In the method main() create 3 objects of Student type and input information about them.
Display the average rating of all students.
Change the rating of any student.
Display the new average rating.*/

public class Main {
    public static void main(String[] args) {
        Student Stud1 = new Student();
        Student Stud2 = new Student();
        Student Stud3 = new Student();

        Stud1.setNameAndRating("Vasya", 51);
        Stud2.setNameAndRating("Tolik", 72);
        Stud3.setNameAndRating("Anya", 100);

        Stud1.toString1();
        //Stud1.changeRating(75);
        //Stud1.toString1();

        System.out.println(Stud1.betterStudent(Stud1, Stud2));

        Stud1.averageRating(Stud1, Stud2, Stud3);
        Stud1.changeRating(9999);
        Stud1.averageRating(Stud1, Stud2, Stud3);

    }

}
