package oops;

public class MethodPrint {
    public static  class Student{
        String name;
        int rollno;
        double cgpa;
        void print(){
            System.out.println("Name is :- "+name + " " + " Roll no :- "+ rollno + " " + "Cgpa is :- "+ cgpa);
        }
    }
    public static void main(String[]args){
        Student s = new Student();
        s.rollno = 38;
        s.name = "Ayush Anand";
        s.cgpa = 7;
        s.print();
    }
}
