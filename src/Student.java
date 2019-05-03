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

//import java.util.Scanner; used for user input
//main class Student
public class Student {
    //private fields
    private String name;
    private int rating;
    //constructors
    //default constructor
    public Student() {
        this.name = null;
        this.rating = 0;
    }
    //constructor with parameters
    public void setNameAndRating(String name, int rating){
        this.name = name;
        this.rating = rating;
    }

    //evaluating better student by rating
    public boolean betterStudent(Student Stud1, Student Stud2){
        if (Stud1.getRating() > Stud2.getRating()) {
            return true;
        }
        return false;
    }

    //get rating method
    public int getRating() {
        return rating;
    }
    //println method
    public void toString1(){
        System.out.println(name);
        System.out.println(rating);
    }
    //method for establishing new rating
    public void changeRating(int rating){
        this.rating = rating;
        //can be also done with user input through console
        /*Scanner in = new Scanner(System.in);
        System.out.println("Enter rating value: ");
        this.rating = in.nextInt();
        System.out.println("New rating value: ");
        System.out.println(this.rating);*/
    }
    public void averageRating(Student Stud1, Student Stud2, Student Stud3 ){
        int AvRat = 0;
        AvRat = (Stud1.getRating() + Stud2.getRating() + Stud3.getRating()) / 3;
        System.out.println("Average rating: ");
        System.out.println(AvRat);
    }
}
