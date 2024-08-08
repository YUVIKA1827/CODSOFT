// STUDENT GRADE CALCULATOR
import java.util.*;
import java.util.Scanner;
 class Student
   {
     String name;
     int rollNo;
     int math_marks,biology_marks,physics_marks,chemistry_marks;
     int total;
     double percentage;
    public Student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Math marks in a range of 0-100");
         math_marks=sc.nextInt();
        System.out.println("Enter Biology marks in a range of 0-100");
         biology_marks= sc.nextInt();
        System.out.println("Enter Physics marks in a range of 0-100");
        physics_marks= sc.nextInt();
        System.out.println("Enter Chemistry marks in a range of 0-100");
        chemistry_marks=sc.nextInt();

    }
    void calculation(){
        total=math_marks+biology_marks+physics_marks+chemistry_marks;
        percentage=total/4;
    }
    void display(){
        System.out.println("Student name :"+name);
        System.out.println("Student Roll No :"+rollNo);
        System.out.println("Total marks out of 400 :"+total);
        System.out.println("Percentage :"+percentage);


        if(percentage>=90){
            System.out.println("Grade:-O");
        } else if (percentage>=80) {
            System.out.println("Grade:-E");

        } else if (percentage>=70) {
            System.out.println("Grade:-A");

        } else if (percentage>=60) {
            System.out.println("Grade:-B");

        } else if (percentage>=50) {
            System.out.println("Grade:-C");

        } else if (percentage>=40) {
            System.out.println("Grade:-D");

        }else{
            System.out.println("FAIL");
        }

    }



}
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Student s1=new Student("Arpita Basu",47);
        s1.input();
        s1.calculation();
        s1.display();

    }
}
